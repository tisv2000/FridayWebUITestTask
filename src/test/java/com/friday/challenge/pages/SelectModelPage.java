package com.friday.challenge.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectModelPage extends FridayBasePage<SelectModelPage> {

    private static final By PAGE_ID = By.xpath("//span[text()='Wähle dein Automodell']");

    public SelectModelPage() {
        setRightPageCondition(ExpectedConditions.presenceOfElementLocated(PAGE_ID));
    }

    @Step("Select model: {model}")
    public SelectBodyTypePage selectModel(String model) {
        click(By.xpath("//button[@name='model']//label[text()='" + model + "']"));
        return createPage(SelectBodyTypePage.class);
    }

}
