@Paquete-Tag
Feature: Paquetes - Seleccion paquetes

  Background: Seleccionar la opcion paquetes

    Given el usuario navega al sitio web de paquetes

  Scenario: Realizar busqueda de paquete
    When selecciona la opcion de paquetes
    And ingresa los datos del paquete
    Then deberia ver en pantalla los paquetes disponibles