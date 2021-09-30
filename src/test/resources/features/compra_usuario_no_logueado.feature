# language: es
Característica: Automation practice
  un usuario "no logueado"
  ingreso a yourlogo
  Para realizar una compra

  Escenario: compra Blouses
    Cuando un usuario " no logueado" Ingresa a "women/Blouses"
    Entonces debe ver como resultado 1 elemento  agregado al carrito de compras

  Escenario: compra T-shirt
    Cuando un usuario no logueado entra a "women/T-shirt"
    Entonces debe ver como resultado 1 elemento adicionado al carrito de compras

  Escenario: compra Casual Dresses
    Cuando un usuario " no logueado" Ingresa a "Dresses/Casual Dresses"
    Entonces debe ver como resultado 1 elemento sumado al carrito de compras

  Escenario: compra Evenning Dresses
    Cuando un usuario " no logueado" Ingresa a "Dresses/Evenning Dresses"
    Entonces debe ver como resultado 1 elemento anexado al carrito de compras

  Escenario: compra Summer Dresses
    Cuando un usuario " no logueado" Ingresa a "Dresses/Summer Dresses"
    Entonces debe ver como resultado 1 elemento añadido al carrito de compras
