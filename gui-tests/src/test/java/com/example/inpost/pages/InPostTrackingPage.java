package com.example.inpost.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Component
public class InPostTrackingPage {

    private static final String URL = "/sledzenie-przesylek";
    private static final String REJECT_BUTTON_ID = "onetrust-reject-all-handler";
    private static final String TRACKING_NUMBER_INPUT_NAME = "number";
    private static final String SEARCH_BUTTON_SELECTOR = ".tracking-form button[class*='block']";
    private static final String FIRST_MESSAGE_BOX_SELECTOR = ".parcel--statuses--list .message-box .paragraph--component";

    private final SelenideElement rejectButton = $(By.id(REJECT_BUTTON_ID));
    private final SelenideElement trackingNumberInput = $(By.name(TRACKING_NUMBER_INPUT_NAME));
    private final SelenideElement searchButton = $(By.cssSelector(SEARCH_BUTTON_SELECTOR));
    private final SelenideElement firstMessageBox = $(By.cssSelector(FIRST_MESSAGE_BOX_SELECTOR));

    public void openPage() {
        open(URL);
    }

    public void rejectCookiesIfVisible() {
        if (isElementVisible(rejectButton)) {
            rejectButton.click();
            rejectButton.shouldNotBe(Condition.visible);
        }
    }

    public void enterTrackingNumber(String trackingNumber) {
        trackingNumberInput.setValue(trackingNumber);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void verifyDeliveryStatus(String expectedStatus) {
        firstMessageBox.shouldHave(Condition.exactText(expectedStatus));
    }

    private boolean isElementVisible(SelenideElement selenideElement) {
        try {
            selenideElement.shouldBe(Condition.visible);
            return selenideElement.isDisplayed();
        } catch (ElementNotFound e) {
            return false;
        }
    }
}
