Feature: Funcionalidad de Login

  Como usuario de SauceDemo
  Quiero validar la funcionalidad de inicio de sesión
  Para asegurarme de que el acceso a la aplicación funciona correctamente

  @CompleteLoginSuccessful
    #CompleteLoginSuccessfulSteps
  Scenario: Completar el login con credenciales exitosas
    Given pepe abre la página de SauceDemo
    When ingreso las credenciales válidas
      | User name     | Password     |
      | standard_user | secret_sauce |
    Then valido el ingreso exitoso