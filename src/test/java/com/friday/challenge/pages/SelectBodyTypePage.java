package com.friday.challenge.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectBodyTypePage extends FridayBasePage<SelectBodyTypePage> {

    private static final By PAGE_ID = By.xpath("//span[text()='Welche Form hat das Auto?']");

    public SelectBodyTypePage() {
        setRightPageCondition(ExpectedConditions.presenceOfElementLocated(PAGE_ID));
    }

    @Step("Select body type: {bodyType}")
    public SelectFuelTypePage selectBodyType(String bodyType) {
        click(By.xpath("//button[@name='bodyType']//label[text()='" + bodyType + "']"));
        return createPage(SelectFuelTypePage.class);
    }

}
