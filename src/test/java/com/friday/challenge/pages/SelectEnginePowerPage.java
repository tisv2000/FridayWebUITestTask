package com.friday.challenge.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectEnginePowerPage extends FridayBasePage<SelectEnginePowerPage> {

    private static final By PAGE_ID = By.xpath("//span[text()='Wie viele PS hat dein Auto?']");

    public SelectEnginePowerPage() {
        setRightPageCondition(ExpectedConditions.presenceOfElementLocated(PAGE_ID));
    }

    @Step("Select engine power: {enginePower}")
    public SelectEnginePage selectEnginePower(String enginePower) {
        click(By.xpath("//button[@name='enginePower']//label[text()='" + enginePower + "']"));
        return createPage(SelectEnginePage.class);
    }

}
