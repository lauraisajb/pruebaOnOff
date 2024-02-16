package com.prueba.co.steps.validation;

import com.prueba.co.pages.alojamiento.BusquedaAlojamientoPage;
import com.prueba.co.pages.paquete.PaquetePage;
import com.prueba.co.pages.vuelo.VueloPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ValidationPaqueteStep extends PaquetePage {
    @Step("validar pagina de paquete")
    public Boolean isPaquetePage(){
        String h1Text = sel_h1.getText();
        return  h1Text.contains("Paquetes");
    }
}
