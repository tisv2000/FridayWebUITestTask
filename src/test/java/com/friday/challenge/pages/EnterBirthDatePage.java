package com.friday.challenge.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EnterBirthDatePage extends FridayBasePage<EnterBirthDatePage> {

    private static final By PAGE_ID = By.xpath("//div[@data-test-id='wizardTitle']");

    public EnterBirthDatePage() {
        setRightPageCondition(ExpectedConditions.presenceOfElementLocated(PAGE_ID));
    }

    @Step("Get Wizard Title")
    public String getWizardTitle() {
        return getText(PAGE_ID);
    }

}
