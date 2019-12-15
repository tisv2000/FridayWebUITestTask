package com.friday.challenge.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectEnginePage extends FridayBasePage<SelectEnginePage> {

    private static final By PAGE_ID = By.xpath("//span[text()='Ist dein Auto dabei?']");

    public SelectEnginePage() {
        setRightPageCondition(ExpectedConditions.presenceOfElementLocated(PAGE_ID));
    }

    @Step("Select engine: {engine}")
    public EnterRegistrationDatePage selectEngine(String engine) {
        click(By.xpath("//button[@name='engine']//label[text()='" + engine + "']"));
        return createPage(EnterRegistrationDatePage.class);
    }

}
