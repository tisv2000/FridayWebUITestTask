package com.friday.challenge.pages;

import core.base_page.BasePage;

public class FridayBasePage<T extends FridayBasePage<T>> extends BasePage<T> {

    public FridayBasePage() {
        setBaseUrl(System.getProperty("base.url"));
    }
}
