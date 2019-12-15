package com.friday.challenge.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EnterRegistrationDatePage extends FridayBasePage<EnterRegistrationDatePage> {

    private static final By PAGE_ID = By.xpath("//span[text()='Wann war die Erstzulassung?']");
    private static final By FIRST_DATE_REGISTRATION_FIELD = By.name("monthYearFirstRegistered");
    private static final By OWNER_DATE_REGISTRATION_FIELD = By.name("monthYearOwnerRegistered");
    private static final By NEXT_BUTTON = By.xpath("//button[@type='submit']");

    public EnterRegistrationDatePage() {
        setRightPageCondition(ExpectedConditions.presenceOfElementLocated(PAGE_ID));
    }

    @Step("Enter first registration data")
    public EnterRegistrationDatePage enterFirstRegistrationData(String firstRegistrationData) {
        enterValue(FIRST_DATE_REGISTRATION_FIELD, firstRegistrationData);
        return this;
    }

    @Step("Enter owner registration data")
    public EnterRegistrationDatePage enterOwnerRegistrationData(String ownerRegistrationData) {
        enterValue(OWNER_DATE_REGISTRATION_FIELD, ownerRegistrationData);
        return this;
    }

    @Step("Click next button")
    public EnterBirthDatePage clickNextButton() {
        click(NEXT_BUTTON);
        return createPage(EnterBirthDatePage.class);
    }

}
