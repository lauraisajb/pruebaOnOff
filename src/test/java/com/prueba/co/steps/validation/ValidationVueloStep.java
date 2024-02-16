package com.prueba.co.steps.validation;

import com.prueba.co.pages.alojamiento.BusquedaAlojamientoPage;
import com.prueba.co.pages.vuelo.VueloPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ValidationVueloStep extends VueloPage {
    @Step("validar pagina de vuelos")
    public Boolean isVueloPage(){
        String h1Text = sel_h1.getText();
        return  h1Text.contains("Vuelos");
    }
}
