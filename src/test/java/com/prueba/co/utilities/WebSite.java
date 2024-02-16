package com.prueba.co.utilities;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {

    @Steps(shared = true)
    PageObject despegar;

    @Step("Navegar")
    public void navigateTo(String url){
        despegar.setDefaultBaseUrl(url);
        despegar.open();
    }
}
