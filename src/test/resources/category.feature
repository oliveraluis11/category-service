Feature: Gestión de categorías

  Scenario: Crear una categoría
    When se crea una nueva categoría con nombre "Electrónica"
    Then la categoría con nombre "Electrónica" es creada correctamente

  Scenario: Actualizar el nombre de una categoría existente
    Given existe una categoría para actualizar con nombre "Electrónica"
    When se actualiza el nombre de la categoría "Electrónica" a "Electrodomésticos"
    Then el nombre de la categoría es actualizado correctamente

  Scenario: Eliminar una categoría existente
    Given existe una categoría para eliminar con nombre "Electrónica"
    When se elimina la categoría "Electrónica"
    Then la categoría es eliminada correctamente