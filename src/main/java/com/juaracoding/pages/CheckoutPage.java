package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class CheckoutPage {

    private WebDriver driver;

    public CheckoutPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator find element

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement BtnCart;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement BtnCheckout;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement FillFirstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement FillLastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement FillKodePos;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement BtnContinue;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement BtnFinish;

    @FindBy(xpath = "//*[@id='checkout_complete_container']/h2")
    private WebElement TxtValid;

    @FindBy(xpath = "//*[@id='checkout_info_container']/div/form/div[1]/div[4]/h3")
    private WebElement TxtInvalid;

    @FindBy(xpath = "//*[@id='checkout_info_container']/div/form/div[1]/div[4]")
    private WebElement TxtInvaliLastName;

    //-----------------------------------------------------------------------------
    public void setBtnCart() {BtnCart.click();}
    public void setBtnCheckout(){BtnCheckout.click();}
    public void inputFirstname(){FillFirstName.sendKeys("Verdi");}
    public void inputLastName(){FillLastName.sendKeys("Daviarta");}
    public void inputKodePos(){FillKodePos.sendKeys("16451");}
    public void setBtnContinue(){BtnContinue.click();}
    public void setBtnFinish(){BtnFinish.click();}
    public String getTxtValidOrder(){return TxtValid.getText();}
    public String getTxtInvalidOrder(){return TxtInvalid.getText();}
    public String getTxtInvalidLastName(){return TxtInvaliLastName.getText();}



}
