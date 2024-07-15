package com.example.inpost.steps;

import com.example.inpost.config.CucumberSpringConfiguration;
import com.example.inpost.pages.InPostTrackingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {CucumberSpringConfiguration.class})
public class StepDefinitions {
    @Autowired
    @Lazy
    private InPostTrackingPage inPostTrackingPage;

    @Given("I am on the InPost tracking page")
    public void i_am_on_the_inpost_tracking_page() {
        inPostTrackingPage.openPage();
        inPostTrackingPage.rejectCookiesIfVisible();
    }

    @When("I search for package with tracking number {string}")
    public void i_search_for_package_with_tracking_number(String trackingNumber) {
        inPostTrackingPage.enterTrackingNumber(trackingNumber);
        inPostTrackingPage.clickSearchButton();
    }

    @Then("I should see the status as {string}")
    public void i_should_see_the_status_as(String expectedStatus) {
        inPostTrackingPage.verifyDeliveryStatus(expectedStatus);
    }
}
