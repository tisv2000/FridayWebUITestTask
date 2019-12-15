package com.friday.challenge.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectFuelTypePage extends FridayBasePage<SelectFuelTypePage> {

    private static final By PAGE_ID = By.xpath("//span[text()='Was tankst du?']");

    public SelectFuelTypePage() {
        setRightPageCondition(ExpectedConditions.presenceOfElementLocated(PAGE_ID));
    }

    @Step("Select fuel type: {fuelType}")
    public SelectEnginePowerPage selectFuelType(String fuelType) {
        click(By.xpath("//button[@name='fuelType']//label[text()='" + fuelType + "']"));
        return createPage(SelectEnginePowerPage.class);
    }

}
