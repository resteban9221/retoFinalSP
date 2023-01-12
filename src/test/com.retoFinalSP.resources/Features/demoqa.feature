Feature: Prueba General Practica
  Background:
    Given Ir a la pagina https://demoqa.com/

  @flujo1
  Scenario: Agregar y elmininar un registro de web tables
    When  Ingresar a la opcion elements->web tables
    And   Agregar un nuevo registro
    And   Eliminar cualquier registro que este en la tabla,
    Then  Verificar que quede ingresado el registro

  @flujo2
    Scenario: Seleccionar fechas
      When  Ingresar a la opcion Widgets->Date Picker
      And   seleccionar fecha en las opciones (Select Date y Date And Time)
      Then  Verificar que quede fecha seleccionada

  @flujo3
  Scenario: Interactuar con 4 tipos de ventanas emergentes
    When  Ingresar a la opcion Alerts,Frame & Windows->Alerts
    And   Activar y cerrar 4 tipos de ventanas emergentes
    And   Activar y cerrar alertButton
    And   Activar y cerrar timerAlertButton
    And   Activar y cerrar confirmButton
    And   Activar y cerrar promtButtonInputName
    And   Verificar que en la ultima opcion aparezca el nombre
    Then  Ventanas emergentes todas cerradas
