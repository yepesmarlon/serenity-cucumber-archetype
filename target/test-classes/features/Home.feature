Feature: Validación de la funcionalidad Home de la página My Shop

  Como usuario de My Shop
  Quiero validar que la página de inicio se cargue correctamente
  Para asegurarme de que la tienda está disponible

  @ValidarOpcionSignInDelHome
  Scenario: Validar la opción de Sign In del Home de la página
    Given actor abre la URL de My Shop
    Then valida el texto de Sign in
      | Texto de Sign in |
      | Sign in          |