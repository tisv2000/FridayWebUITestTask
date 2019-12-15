package com.friday.challenge.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectPreconditionPage extends FridayBasePage<SelectPreconditionPage> {

    private static final By PAGE_ID = By.xpath("//span[text()='In 90 Sekunden zum Beitrag']");
    private static final By NEXT_BUTTON = By.xpath("//button[@type='submit']");

    public SelectPreconditionPage() {
        setPagePath("/selectPrecondition");
        setRightPageCondition(ExpectedConditions.presenceOfElementLocated(PAGE_ID));
    }

    @Step("Click next button")
    public SelectRegisteredOwnerPage clickNextButton() {
        click(NEXT_BUTTON);
        return createPage(SelectRegisteredOwnerPage.class);
    }

}
