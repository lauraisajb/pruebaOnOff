package com.prueba.co.steps.vuelo;

import com.prueba.co.pages.vuelo.VueloPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class VueloStep extends VueloPage {

    @Step("seleccionar vuelos")
    public void clickVuelo(){
        sel_vuelo.click();

    }
    @Step("poner datos vuelo")
    public void enterVuelo(){
        sel_origenVuelo.click();
        sel_origenVuelo.clear();
        sel_origenVuelo.sendKeys("cali");
        sel_origenVueloClick.click();
        sel_destinoVuelo.click();
        sel_destinoVuelo.sendKeys("bogota");
        sel_destinoVueloClick.click();
        sel_destinoVueloClick.sendKeys(Keys.ENTER);
        sel_fechaIda.click();
        sel_numerofechaIda.click();
        sel_numerofechaRegreso.click();
        btnAplicarFecha.click();
        btnBuscar.click();

    }
}
