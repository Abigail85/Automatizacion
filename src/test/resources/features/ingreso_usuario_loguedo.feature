# language: es
Característica:
  Como usuario logueado de automationpractice
  Ingreso en el login de la pagina yourLogo

  Escenario:email incorrecto
    Cuando un usuario "logueado" introduce su "email" de forma incorrecta
    Entonces debe ver como resultado un mensaje "email incorrecto"

  Escenario:password incorrecto
    Cuando un usuario "logueado" Introduce su "password" de forma incorrecta
    Entonces debe ver como resultado un mensaje "password incorrecto"

  Escenario: login correcto
    Cuando un usuario "logueado" Introduce su "email" correctamente y su "password" correctamente
    Entonces debe ver como resultado un mensaje "Bienvenido"


