package com.juaracoding;

import com.juaracoding.pages.AddcartPage;
import com.juaracoding.pages.CheckoutPage;
import com.juaracoding.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class checkout {

    private static WebDriver driver;
    private static LoginPage loginPage = new LoginPage();

    private static AddcartPage addcartPage = new AddcartPage();
    private static CheckoutPage checkoutPage = new CheckoutPage();


    public checkout(){
        driver = Hooks.driver;
    }

    @And("Pengguna masuk ke halaman cart")
    public void Pengguna_masuk_ke_halaman_cart(){
        driver.get("https://www.saucedemo.com/");
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickBtnLogin();
        addcartPage.chooseProducts();
        addcartPage.clickBtnAddCart();
        checkoutPage.setBtnCart();
    }

    @And("Pengguna mengklik tombol checkout")
    public void Pengguna_mengklik_tombol_checkout(){checkoutPage.setBtnCheckout();}

    @And("Pengguna mengisi nama depan")
    public void Pengguna_mengisi_nama_depan(){checkoutPage.inputFirstname();}

    @And("Pengguna mengisi nama belakang")
    public void Pengguna_mengisi_nama_belakang(){checkoutPage.inputLastName();}

    @And("Pengguna mengisi kode pos")
    public void Pengguna_mengisi_kode_pos(){checkoutPage.inputKodePos();}

    @And("Pengguna mengklik tombol continue")
    public void Pengguna_mengklik_tombol_continue(){checkoutPage.setBtnContinue();}

    @And("Pengguna mengklik tombol finish")
    public void Pengguna_mengkil_tombol_finish(){checkoutPage.setBtnFinish();}

    @Then("User berhasil melakukan checkout")
    public void User_berhasil_melakukan_checkout(){
        Assert.assertEquals(checkoutPage.getTxtValidOrder(),"Thank you for your order!");
    }

//Negative Case ------------------------------------------------------------------------------

    @Then("User tidak berhasil melakukan checkout")
    public void User_tidak_berhasil_melakukan_checkout(){
        Assert.assertEquals(checkoutPage.getTxtInvalidOrder(),"Error: First Name is required");
    }

    @And("Pengguna mengisi firstname")
    public void Pengguna_mengisi_firstname(){checkoutPage.inputFirstname();}

    @Then("User tidak berhasil melakukan checkout dengan status last name is required")
    public void User_tidak_berhasil_melakukan_checkout_dengan_status_last_name_is_required(){
        Assert.assertEquals(checkoutPage.getTxtInvalidLastName(),"Error: Last Name is required");
    }

}
