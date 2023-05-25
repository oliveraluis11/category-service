package com.cucumber.categoryservice.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteCategoryByNameStepDefinitions {
    @Given("existe una categoría para eliminar con nombre {string}")
    public void crearCategoriaExistenteParaEliminar(String nombreCategoria) {
        // Lógica para crear una categoría existente con el nombre proporcionado
    }

    @When("se elimina la categoría {string}")
    public void seEliminaLaCategoría(String arg0) {
    }

    @Then("la categoría es eliminada correctamente")
    public void verificarCategoriaEliminada() {
        // Lógica para verificar que la categoría ha sido eliminada correctamente
    }


}
