package com.friday.challenge.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectVehiclePage extends FridayBasePage<SelectVehiclePage>{

    private static final By PAGE_ID = By.xpath("//span[text()='Wähle dein Auto aus']");

    public SelectVehiclePage() {
        setRightPageCondition(ExpectedConditions.presenceOfElementLocated(PAGE_ID));
    }

    @Step("Select brand: {brand}")
    public SelectModelPage selectBrand(String brand) {
        click(By.xpath("//button[@name='make']//label[text()='" + brand + "']"));
        return createPage(SelectModelPage.class);
    }

}
