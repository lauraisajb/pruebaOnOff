package com.prueba.co.definitions.alojamientoDefinitions;

import com.prueba.co.pages.alojamiento.BusquedaAlojamientoPage;
import com.prueba.co.steps.alojamiento.BusquedaAlojamientoStep;
import com.prueba.co.steps.validation.ValidationAlojamientoStep;
import com.prueba.co.utilities.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class BusquedaAlojamientoDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    BusquedaAlojamientoStep selecAlojamiento;
    BusquedaAlojamientoStep dataAlojamientoHotelName;

    BusquedaAlojamientoPage page;
    ValidationAlojamientoStep validate;

    @Given("el usuario navega al sitio web de alojamientos")
    public void userNavigateTo(){
        url.navigateTo("https://www.despegar.com.co/");
    }

    @When("selecciona la opcion de alojamiento")
    public void userClickHotel(){
        selecAlojamiento.clickHotel();
    }

    @And("ingresa los datos de alojamiento")
    public void dataAlojamiento(){dataAlojamientoHotelName.enterAlojamiento();};

    @Then("debería ver en pantalla los hoteles disponibles")
    public void systemShowAlojamientoModule(){
        Assert.assertTrue(validate.isAlojamientoPage());
    }


}
