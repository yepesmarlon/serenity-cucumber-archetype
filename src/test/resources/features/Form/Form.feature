Feature: Funcionalidad de Formulario

  Como usuario de LetCode
  Quiero validar la funcionalidad del formulario
  Para asegurarme de que la funcionalidad de envío de datos funciona como se espera

  @CompleteFormSuccessful
    #CompleteFormSuccessfulSteps
  Scenario: Enviar el formulario con todos los datos válidos
    Given pepe abre la página de LetCode
    When selecciona la opción del formulario
    And ingresa los datos del formulario
      | Campos del formulario | Información del formulario |
      | First Name            | Pepe                       |
      | Last Name             | Romero                     |
      | Email                 | pepe@gmail.com             |
      | Country code          | Colombia (+57)             |
      | Phone Number          | 3001111111                 |
      | Address Line-1        | 3001111111                 |
      | Address Line-2        | 3001111111                 |
      | State                 | Cundinmarca                |
      | Postal-Code           | 110811                     |
      | Country               | Bogota                     |
      | Date Of Birth         | 03/03/1999                 |
      | Gender                | Male                       |
      | Accept Conditions?    | Yes                        |
#    Then se visualiza un mensaje de confirmación exitoso


