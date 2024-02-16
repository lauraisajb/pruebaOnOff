package com.prueba.co.pages.vuelo;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VueloPage extends PageObject {
    @FindBy(xpath = "//a[contains(@class,'FLIGHTS')]/div")
    protected WebElementFacade sel_vuelo;

    @FindBy(xpath = "(//input[@placeholder='Ingresa desde dónde viajas'])[1]")
    protected WebElementFacade sel_origenVuelo;
    @FindBy(xpath = "(//em[normalize-space()='Cali'])[1]")
    protected WebElementFacade sel_origenVueloClick;

    @FindBy(xpath = "(//input[@placeholder='Ingresa hacia dónde viajas'])[1]")
    protected WebElementFacade sel_destinoVuelo;
    @FindBy(xpath = "(//em[normalize-space()='Bogotá'])[1]")
    protected WebElementFacade sel_destinoVueloClick;

    @FindBy(xpath = "(//input[@placeholder='Ida'])[1]")
    protected WebElementFacade sel_fechaIda;
    @FindBy(xpath = "(//div[contains(@class,'monthgrid')][text()='16'])[1]")
    protected WebElementFacade sel_numerofechaIda;

    @FindBy(xpath = "(//div[contains(@class,'monthgrid')][text()='20'])[1]")
    protected WebElementFacade sel_numerofechaRegreso;
    @FindBy(xpath = "(//em[@class='btn-text'][normalize-space()='Aplicar'])[1]")
    protected WebElementFacade btnAplicarFecha;

    @FindBy(xpath = "(//em[normalize-space()='Buscar'])[1]")
    protected WebElementFacade btnBuscar;

    @FindBy(xpath = "//h1[1]")
    protected WebElementFacade sel_h1;
}
