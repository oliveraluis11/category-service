package com.cucumber.categoryservice.steps;

import com.cucumber.categoryservice.document.Category;
import com.cucumber.categoryservice.repository.CategoryRepository;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CreateCategoryStepDefinitions {
    private CategoryRepository categoryRepository;
    private Category newCategory;
    @Before
    public void setup() {
        categoryRepository = mock(CategoryRepository.class);
    }

    @When("se crea una nueva categoría con nombre {string}")
    public void seCreaUnaNuevaCategoríaConNombre(String arg0) {
        Category request = Category.builder().name(arg0).build();

        Mockito.when(categoryRepository
                .save(request)).thenReturn(
                Category
                        .builder()
                        .id("1")
                        .name(arg0)
                        .build()
        );

        this.newCategory = categoryRepository.save(request);

    }

    @Then("la categoría con nombre {string} es creada correctamente")
    public void verificarCategoriaCreada(String nombreCategoria) {
        Category request = Category.builder().name(nombreCategoria).build();
        verify(this.categoryRepository).save(request);
        Assert.assertEquals(this.newCategory.getId(), "1");
        Assert.assertEquals(this.newCategory.getName(), nombreCategoria);
    }


}
