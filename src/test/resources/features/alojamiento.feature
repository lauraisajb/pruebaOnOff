@Alojamiento-Tag
Feature: Alojamiento - Seleccion alojamiento

  Background: Seleccionar la opcion alojamiento

    Given el usuario navega al sitio web de alojamientos

    Scenario: Realizar busqueda de alojamiento
      When selecciona la opcion de alojamiento
      And ingresa los datos de alojamiento
      Then debería ver en pantalla los hoteles disponibles

   Scenario: Escoger el hotel e ingresar datos personales
     When selecciona el hotel con la habitacion
     And selecciona el tipo de pago
     Then deberia ver en pantalla el mensaje de detalle de pago

