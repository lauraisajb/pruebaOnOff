package com.prueba.co.steps.validation;

import com.prueba.co.pages.alojamiento.BusquedaAlojamientoPage;
import net.thucydides.core.annotations.Step;

public class ValidationAlojamientoStep extends BusquedaAlojamientoPage {
    @Step("validar pagina de alojamientos")
    public Boolean isAlojamientoPage() {
        String h1Text = valAlojamiento.getText();
        return h1Text.contains("Alojamientos");
    }
}
