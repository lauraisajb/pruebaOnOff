package com.prueba.co.pages.paquete;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PaquetePage extends PageObject {
    @FindBy(xpath = "//a[contains(@class,'PACKAGES')]/div")
    protected WebElementFacade sel_paquete;

    @FindBy(xpath = "(//input[@placeholder='Ingresa desde dónde viajas'])[1]")
    protected WebElementFacade sel_origenPaquete;
    @FindBy(xpath = "(//input[@placeholder='Ingresa hacia dónde viajas'])[1]")
    protected WebElementFacade sel_destinoPaquete;

    @FindBy(xpath = "(//input[@placeholder='Ida'])[1]")
    protected WebElementFacade sel_fechaIda;

    @FindBy(xpath = "(//div[contains(@class,'monthgrid')][text()='16'])[2]")
    protected WebElementFacade sel_numeroFechaIda;
    @FindBy(xpath = "(//div[contains(@class,'monthgrid')][text()='20'])[2]")
    protected WebElementFacade sel_numeroFechaVuelta;
    @FindBy(xpath = "(//em[@class='btn-text'][normalize-space()='Aplicar'])[1]")
    protected WebElementFacade btn_aplicarFecha;
    @FindBy(xpath = "(//em[normalize-space()='Buscar'])[1]")
    protected WebElementFacade btn_buscar;

    @FindBy(xpath = "//h1[1]")
    protected WebElementFacade sel_h1;
}
