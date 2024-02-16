package com.prueba.co.definitions.paqueteDefinitions;

import com.prueba.co.steps.paquete.PaqueteStep;
import com.prueba.co.steps.validation.ValidationPaqueteStep;
import com.prueba.co.utilities.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class PaqueteDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    PaqueteStep selecPaquete;

    ValidationPaqueteStep validate;

    @Given("el usuario navega al sitio web de paquetes")
    public void userNavigateTo(){
        url.navigateTo("https://www.despegar.com.co/");
    }

    @When("selecciona la opcion de paquetes")
    public void userClickPaquete(){
        selecPaquete.clickPaquete();
    }
    @And("ingresa los datos del paquete")
    public void dataPaquete(){selecPaquete.enterPaquete();}

    @Then("deberia ver en pantalla los paquetes disponibles")
    public void systemShowPaqueteModule(){
        Assert.assertTrue(validate.isPaquetePage());
    }
}
