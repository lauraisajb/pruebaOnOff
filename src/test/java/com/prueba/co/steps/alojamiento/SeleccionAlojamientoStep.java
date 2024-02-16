package com.prueba.co.steps.alojamiento;

import com.prueba.co.pages.alojamiento.SeleccionAlojamientoPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class SeleccionAlojamientoStep extends SeleccionAlojamientoPage {
    WebDriver driver;
    @Step("seleccionar hotel")
    public void clickHotelHabitacion(){
        selecHotelHabitacion.click();
        driver.switchTo().newWindow(WindowType.TAB);

    }

}
