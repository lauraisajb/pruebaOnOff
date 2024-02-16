package com.prueba.co.definitions.vueloDefinitions;


import com.prueba.co.steps.validation.ValidationVueloStep;
import com.prueba.co.steps.vuelo.VueloStep;
import com.prueba.co.utilities.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class VueloDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    VueloStep selecVuelo;
    VueloStep dataVuelo;

    ValidationVueloStep validate;

    @Given("el usuario navega al sitio web de vuelos")
    public void userNavigateTo(){
        url.navigateTo("https://www.despegar.com.co/");
    }

    @When("selecciona la opcion de vuelos")
    public void userClickVuelo(){
        selecVuelo.clickVuelo();
    }

    @And("ingresa los datos del vuelo")
    public void dataVuelo(){dataVuelo.enterVuelo();};

    @Then("deberia ver en pantalla los vuelos disponibles")
    public void systemShowVueloModule(){
        Assert.assertTrue(validate.isVueloPage());
    }
}
