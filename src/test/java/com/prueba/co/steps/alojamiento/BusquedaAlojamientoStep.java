package com.prueba.co.steps.alojamiento;

import com.prueba.co.pages.alojamiento.BusquedaAlojamientoPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class BusquedaAlojamientoStep extends BusquedaAlojamientoPage {

    @Step("seleccionar aolojamiento")
    public void clickHotel(){
        sel_alojamiento.click();

    }

    @Step("poner ciudad alojamiento")
    public void enterAlojamiento(){
        nameAlojamiento.click();
        nameAlojamiento.sendKeys("bogota");
        nameAlojamientoClick.click();
        nameAlojamiento.sendKeys(Keys.ENTER);
        sel_fechaEntrada.click();
        numeroFechaEntrada.click();
        numeroFechaSalida.click();
        btnAplicarFecha.click();
        btnBuscar.click();

    }

}
