package com.prueba.co.pages.alojamiento;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SeleccionAlojamientoPage extends PageObject {
    @FindBy(xpath = "(//em[@class='btn-text'][normalize-space()='Ver detalle'])[2]")
    protected WebElementFacade selecHotelHabitacion;

}
