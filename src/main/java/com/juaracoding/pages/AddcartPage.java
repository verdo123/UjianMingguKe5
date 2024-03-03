package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddcartPage {
    private WebDriver driver;

    public AddcartPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    //Locator find element

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement BtnAddcart;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement txtAddtoCart;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    private WebElement clickProducts;

//    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]")
//    private WebElement cartPage;

    public void chooseProducts() {clickProducts.click();}
    public void clickBtnAddCart() {BtnAddcart.click();}
    public String getTxtValidAddCart(){return txtAddtoCart.getText();}

}



