package com.prueba.co.pages.alojamiento;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class BusquedaAlojamientoPage extends PageObject {
    @FindBy(xpath = "//a[contains(@class,'HOTELS')]/div")
    protected WebElementFacade sel_alojamiento;

    @FindBy(xpath = "(//h1[1]")
    protected WebElementFacade valAlojamiento;

    @FindBy(xpath = "(//div[@class='input-container']//input[@class='input-tag'])[ last()-4]")
    protected  WebElementFacade nameAlojamiento;
    @FindBy(xpath = "(//li[@class='item -active'])[1]")
    protected WebElementFacade nameAlojamientoClick;
    @FindBy(xpath = "(//div[@class='input-container']//input[@class='input-tag'])[ last()-3]")
    protected WebElementFacade sel_fechaEntrada;

    @FindBy(xpath = "(//div[@class='sbox5-monthgrid-datenumber-number'][normalize-space()='16'])[1]")
    protected WebElementFacade numeroFechaEntrada;

    @FindBy(xpath = "(//div[@class='sbox5-monthgrid-datenumber-number'][normalize-space()='20'])[1]")
    protected WebElementFacade numeroFechaSalida;

    @FindBy(xpath = "(//em[@class='btn-text'][normalize-space()='Aplicar'])[1]")
    protected WebElementFacade btnAplicarFecha;

    @FindBy(xpath = "(//em[normalize-space()='Buscar'])[1]")
    protected WebElementFacade btnBuscar;




}
