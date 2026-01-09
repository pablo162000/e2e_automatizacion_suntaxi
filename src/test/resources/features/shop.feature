Feature: Flujo de compra en Saucedemo
  @happypath
  Scenario: Compra exitosa con dos productos
    Given el usuario inicia sesion con usuario "standard_user" y password "secret_sauce"
    When agrega dos productos al carrito
    And visualiza el carrito
    And completa el formulario de compra con datos desde "testdata/checkout.json"
    Then debe ver la confirmacion "Thank you for your order!"