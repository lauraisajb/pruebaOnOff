@Vuelo-Tag
Feature: Vuelo - Seleccion vuelo

  Background: Seleccionar la opcion vuelos

    Given el usuario navega al sitio web de vuelos

  Scenario: Realizar busqueda de vuelos
    When selecciona la opcion de vuelos
    And ingresa los datos del vuelo
    Then deberia ver en pantalla los vuelos disponibles