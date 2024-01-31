#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de Saucedemo
    Cuando inicio sesión con las credenciales usuario: "sergiotd29@gmail.com" y contraseña: "Tantoasi1612"
    Y selecciono la opcion no gracias
    Y presiono la tecla Escape
    Y digito la palabra "envio gratis" en el buscador
    Y doy clic en el boton buscar
    Y doy clic en el boton agregar al carrito