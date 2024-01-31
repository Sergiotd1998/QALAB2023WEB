package com.nttdata.page;

import org.openqa.selenium.By;


import java.util.List;

public class LoginPage {


    //Localizadores de elementos
    public static By userInput = By.xpath("//input[@id='UserName']");
    public static By passInput = By.xpath("//input[@id='Password']");
    public static By loginButton = By.xpath("//body/section[@id='main-container']/div[@id='home']/div[1]/div[1]/div[3]");
    public static By NoGracias = By.xpath("//button[@id='onesignal-slidedown-cancel-button']");
    public static By ClickEnviosGratis = By.cssSelector("body.juntoz-theme:nth-child(2) section:nth-child(6) div.no-margin-header div.container.d-none.d-sm-none.d-md-none.d-lg-block:nth-child(4) div.home-headband > div.cart-headband:nth-child(3)");
    public static By productsTitle = By.xpath("//span[@class='text-description']");
    public static By itemsCards = By.cssSelector("div.inventory_item");

}
