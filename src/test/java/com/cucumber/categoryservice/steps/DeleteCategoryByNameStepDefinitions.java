package com.cucumber.categoryservice.steps;

import com.cucumber.categoryservice.document.Category;
import com.cucumber.categoryservice.repository.CategoryRepository;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class DeleteCategoryByNameStepDefinitions {
    private Category existingCategory;
    private CategoryRepository categoryRepository;
    @Before
    public void setup(){
        this.categoryRepository = mock(CategoryRepository.class);
    }
    @Given("existe una categoría para eliminar con nombre {string}")
    public void crearCategoriaExistenteParaEliminar(String nombreCategoria) {
        this.existingCategory = Category
                .builder()
                .id("1")
                .name(nombreCategoria)
                .build();
    }

    @When("se elimina la categoría {string}")
    public void seEliminaLaCategoría(String arg0) {
        Mockito.doNothing().when(this.categoryRepository).deleteCategoryByName(arg0);
        this.categoryRepository.deleteCategoryByName(arg0);

    }

    @Then("la categoría es eliminada correctamente")
    public void verificarCategoriaEliminada() {
        Mockito.verify(this.categoryRepository, times(1)).deleteById(ArgumentMatchers.any());
    }


}
