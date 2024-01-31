#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de juntoz
    Cuando inicio sesión con las credenciales usuario: "sergiotd29@gmail.com" y contraseña: "Tantoasi1612"
    Entonces valido que debería aparecer el título de "Sergio"