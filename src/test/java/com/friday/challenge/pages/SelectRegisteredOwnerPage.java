package com.friday.challenge.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectRegisteredOwnerPage extends FridayBasePage<SelectRegisteredOwnerPage> {

    private static final By PAGE_ID = By.xpath("//span[text()='Bist du der Halter des Autos (zugelassen auf dich)?']");
    private static final By NEXT_BUTTON = By.xpath("//button[@type='submit']");

    public SelectRegisteredOwnerPage() {
        setRightPageCondition(ExpectedConditions.presenceOfElementLocated(PAGE_ID));
    }

    @Step("Click next button")
    public SelectVehiclePage clickNextButton() {
        click(NEXT_BUTTON);
        return createPage(SelectVehiclePage.class);
    }

}
