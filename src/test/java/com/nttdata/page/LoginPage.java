package com.nttdata.page;

import org.openqa.selenium.By;


import java.util.List;

public class LoginPage {


    //Localizadores de elementos
    public static By userInput = By.xpath("//input[@id='UserName']");
    public static By passInput = By.xpath("//input[@id='Password']");
    public static By loginButton = By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/input[1]");

    public static By not = By.id("onesignal-slidedown-cancel-button");

    public static By dialog = By.cssSelector("#onesignal-slidedown-container");
    public static By sendFree = By.xpath("//header/nav[@id='navbar']/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/span[1]/input[2]");
    public static By btnbuscar = By.xpath("//header/nav[@id='navbar']/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/span[1]/button[1]");
    public static By productsTitle = By.cssSelector("span.title");
    public static By itemsCards = By.cssSelector("div.inventory_item");

    public static By carrito = By.xpath("//body/section[@id='main-container']/div[@id='catalog']/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[16]/div[3]/div[1]/button[1]");

}