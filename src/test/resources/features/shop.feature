Feature: Flujo de compra en Saucedemo

  @happypath
  Scenario Outline: Compra exitosa con dos productos
    Given el usuario inicia sesion con usuario "<usuario>" y password "<password>"
    When agrega dos productos al carrito
    And visualiza el carrito
    And completa el formulario de compra con datos desde "<archivo_datos>"
    Then debe ver la confirmacion "<mensaje_confirmacion>"

    Examples:
      | usuario        | password      | archivo_datos              | mensaje_confirmacion        |
      | standard_user  | secret_sauce  | testdata/checkout.json     | Thank you for your order!  |
