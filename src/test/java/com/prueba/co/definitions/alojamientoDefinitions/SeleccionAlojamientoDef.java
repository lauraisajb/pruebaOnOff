package com.prueba.co.definitions.alojamientoDefinitions;

import com.prueba.co.steps.alojamiento.SeleccionAlojamientoStep;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SeleccionAlojamientoDef {

    @Steps(shared = true)
    SeleccionAlojamientoStep selecHotelHabitacion;
    @When("selecciona el hotel con la habitacion")
    public void userClickHotelHabitacion(){
        selecHotelHabitacion.clickHotelHabitacion();
    }
}
