package com.nttdata.stepsdefinitions;


import com.nttdata.steps.LoginSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepsDef {

    private WebDriver driver;
    private Scenario scenario;

    private LoginSteps loginSteps(WebDriver driver) {
        return new LoginSteps(driver);
    }

    @Before(order = 0)
    public void setUp() {
        //setUp
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Dado("que me encuentro en la página de login de Saucedemo")
    public void que_me_encuentro_en_la_página_de_login_de_sacedemo() {
        driver.get("https://juntoz.com/account/login");
        screenShot();
    }

    @Cuando("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicio_sesión_con_las_credenciales_usuario_y_contraseña(String user, String password) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        loginSteps.login();
        screenShot();
    }

    @Entonces("valido que debería aparecer el título de {string}")
    public void valido_que_debería_aparecer_el_título_de(String expectedTitle) {
        String title = loginSteps(driver).getTitle();
        //prueba: validamos el título del producto
        Assertions.assertEquals(expectedTitle, title);
    }

    @Y("también valido que al menos exista un item")
    public void también_valido_que_al_menos_exista_un_item() {
        int itemsListSize = loginSteps(driver).getItemSize();
        //prueba: validar que al menos exista un item
        screenShot();
        Assertions.assertTrue(itemsListSize > 0, "El tamaño de la lista es: " + itemsListSize);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void screenShot() {
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }

    @Y("selecciono la opcion envio gratis")
    public void seleccionoLaOpcionEnvioGratis() {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.send();
    }

    @Y("selecciono la opcion no gracias")
    public void seleccionoLaOpcionNoGracias() {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.not();
    }

    @Y("descarto el cuadro de dialogo")
    public void descartoElCuadroDeDialogo() {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.dialog();
    }

    @Y("presiono la tecla Escape")
    public void presionoLaTeclaEscape() {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.presionoLaTeclaEscape();
    }

    @Y("digito la palabra {string} en el buscador")
    public void digitoLaPalabraEnElBuscador(String send) {
        System.out.println("envio gratis");
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.buscarProducto(send);
        screenShot();
    }

    @Y("doy clic en el boton buscar")
    public void doyClicEnElBotonBuscar() {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.clickBuscar();
    }

    @Y("doy clic en el boton agregar al carrito")
    public void doyClicEnElBotonAgregarAlCarrito() {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.carrito();
    }

    @Y("desplazo el scroll hacia abajo")
    public void desplazoElScrollHaciaAbajo() {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.desplazarScrollHaciaAbajo();
    }
}