package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.AddcartPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class addtocart {
    private static WebDriver driver;

    private static AddcartPage addcartPage = new AddcartPage();

    public addtocart(){
        driver = Hooks.driver;
    }

    @Given("Pengguna mengakses halaman produk")
    public void Pengguna_mengkases_halaman_produk(){driver.get("https://www.saucedemo.com/inventory.html");}

    @When("Pengguna memilih produk yang diinginkan")
    public void Pengguna_memilih_produk_yang_diinginkan(){addcartPage.chooseProducts();}

    @And("Pengguna menekan tombol Add to cart")
    public void Pengguna_menekan_tombol_Add_to_cart(){addcartPage.clickBtnAddCart();}

    @Then("User berhasil menambahkan barang ke dalam keranjang")
    public void User_berhasil_menambahkan_barang_ke_dalam_keranjang(){
        Assert.assertEquals(addcartPage.getTxtValidAddCart(),"Remove");}

}
