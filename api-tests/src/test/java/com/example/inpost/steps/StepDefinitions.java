package com.example.inpost.steps;

import com.example.inpost.config.ApiConfig;
import com.example.inpost.config.CucumberSpringConfiguration;
import com.example.inpost.mappers.DataMapper;
import com.example.inpost.model.Item;
import com.example.inpost.services.AllureAttachmentService;
import com.example.inpost.services.FileService;
import com.example.inpost.services.ParcelLockerService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.test.context.ContextConfiguration;

import java.io.File;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@ContextConfiguration(classes = {CucumberSpringConfiguration.class})
public class StepDefinitions {
    private final AllureAttachmentService allureAttachmentService;
    private final ParcelLockerService parcelLockerService;
    private final FileService fileService;
    private final DataMapper dataMapper;
    private final ApiConfig apiConfig;

    private List<Item> allLockers;
    private String city;

    @Given("I want to find parcel lockers in {string}")
    public void i_want_to_find_parcel_lockers_in(String city) {
        this.city = city;
    }

    @When("I request parcel lockers for the city")
    public void i_request_parcel_lockers_for_the_city() {
        try {
            allLockers = parcelLockerService.fetchAllLockers(city, "parcel_locker");
        } catch (Exception e) {
            log.error("Error fetching parcel lockers: {}", e.getMessage());
            throw new RuntimeException("Error fetching parcel lockers", e);
        }
    }

    @Then("I should save the parcel lockers data to a file named {string}")
    public void i_should_save_the_parcel_lockers_data_to_a_file_named(String filename) {
        try {
            File file = fileService.saveDataToFile(dataMapper.mapToSelectedFields(allLockers), filename, apiConfig.getFileSaveDirectory());
            allureAttachmentService.attachFileToAllureReport(file);
            log.info("Data successfully saved to file: {}", filename);
        } catch (Exception e) {
            log.error("Failed to write data to file: {}: {}", filename, e.getMessage());
            throw new RuntimeException("Failed to write to file: " + filename, e);
        }
    }
}
