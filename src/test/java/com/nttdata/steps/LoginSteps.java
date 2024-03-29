package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginSteps {

    private WebDriver driver;

    //constructor
    public LoginSteps(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Escribir el usuario
     *
     * @param user el usuario
     */
    public void typeUser(String user) {
        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.loginButton));


    }


    /**
     * Escribir el password
     *
     * @param password el password del usuario
     */
    public void typePassword(String password) {
        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login() {
        this.driver.findElement(LoginPage.loginButton).click();
    }

    public void send() {
        this.driver.findElement(LoginPage.sendFree).click();
    }

    public void not() {
        this.driver.findElement(LoginPage.not).click();
    }

    public void carrito() {
        this.driver.findElement(LoginPage.carrito).click();
    }

    public void dialog() {
        this.driver.findElement(LoginPage.dialog).click();
    }

    public int getItemSize() {
        List<WebElement> items = this.driver.findElements(LoginPage.itemsCards);
        return items.size();
    }

    public String getTitle() {
        return this.driver.findElement(LoginPage.productsTitle).getText();
    }

    public void presionoLaTeclaEscape() {
        // Utilizando la clase Actions para simular la pulsación de la tecla Escape.
        Actions actions = new Actions(driver);
        actions.sendKeys("\uE00C").perform();
    }

    public void clickBuscar() {
        WebElement botonBuscar = driver.findElement(LoginPage.btnbuscar);
        botonBuscar.click();
    }

    public void buscarProducto(String send) {
        WebElement busqueda = driver.findElement(LoginPage.sendFree);
        busqueda.sendKeys(send);

    }

    public void desplazarScrollHaciaAbajo() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Desplazar el scroll hacia abajo 500 píxeles (ajusta según tus necesidades)
        jsExecutor.executeScript("window.scrollBy(0, 500);");
    }
}