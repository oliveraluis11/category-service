package com.cucumber.categoryservice.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateNameCategoryStepDefinitions {

    @Given("existe una categoría para actualizar con nombre {string}")
    public void crearCategoriaExistenteParaActualizar(String nombreCategoria) {
        // Lógica para crear una categoría existente con el nombre proporcionado
    }

    @When("se actualiza el nombre de la categoría {string} a {string}")
    public void seActualizaElNombreDeLaCategoríaA(String arg0, String arg1) {
    }

    @Then("el nombre de la categoría es actualizado correctamente")
    public void verificarNombreCategoriaActualizado() {
        // Lógica para verificar que el nombre de la categoría ha sido actualizado correctamente
    }


}
