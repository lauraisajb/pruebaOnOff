package com.prueba.co.steps.paquete;

import com.prueba.co.pages.paquete.PaquetePage;
import net.thucydides.core.annotations.Step;

public class PaqueteStep extends PaquetePage {

    @Step("seleccionar paquetes")
    public void clickPaquete(){
        sel_paquete.click();

    }
    @Step("poner datos paquete")
    public void enterPaquete(){
        sel_origenPaquete.click();
        sel_origenPaquete.clear();
        sel_origenPaquete.sendKeys("cali");
        sel_origenPaquete.click();
        sel_destinoPaquete.click();
        sel_destinoPaquete.sendKeys("bogota");
        sel_destinoPaquete.click();
        sel_fechaIda.click();
        sel_numeroFechaIda.click();
        sel_numeroFechaVuelta.click();
        btn_aplicarFecha.click();
        btn_buscar.click();
    }

}
