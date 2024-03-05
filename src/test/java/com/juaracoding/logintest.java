package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class logintest {

    private static WebDriver driver;

    private static LoginPage loginPage = new LoginPage();

    public logintest(){
        driver = Hooks.driver;
    }

    public static ExtentTest extentTest;


    @Given("Pengguna mengakses halaman login")
    public void Pengguna_mengakses_halaman_login() {
        driver.get("https://www.saucedemo.com/");
        extentTest.log(LogStatus.PASS,"Pengguna mengakses halaman login");
    }

    @When("Pengguna memasukan username yang valid")
    public void Pengguna_memasukan_username_yang_valid(){
        loginPage.inputUsername("standard_user");
        extentTest.log(LogStatus.PASS,"Pengguna memasukan username yang valid");
    }

    @And("Pengguna memasukkan password kredensial yang valid")
    public void Pengguna_memasukkan_password_kredensial_yang_valid(){
        loginPage.inputPassword("secret_sauce");
        extentTest.log(LogStatus.PASS,"Pengguna memasukkan password kredensial yang valid");
    }

    @And("Pengguna menekan tombol Login")
    public void Pengguna_menekan_tombol_Login(){
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS,"Pengguna menekan tombol Login");
    }

    @Then("User berhasil login dan diarahkan ke halaman utama")
    public void User_berhasil_login_dan_diarahkan_ke_halaman_utama(){
        Assert.assertEquals(loginPage.getTxtDashboard(),"Products");
        extentTest.log(LogStatus.PASS,"User berhasil login dan diarahkan ke halaman utama");
    }


//Negative Case ------------------------------------------------------------------------------


    @Given("Pengguna berada pada halaman login")
    public void Pengguna_berada_pada_halaman_login(){
        loginPage.formBtnLogout();
        extentTest.log(LogStatus.PASS,"Pengguna berada pada halaman login");
    }

    @And("Pengguna memasukkan password kredensial yang tidak valid")
    public void Pengguna_memasukkan_password_kredensial_yang_tidak_valid(){
        loginPage.inputPassword("admin123");
        extentTest.log(LogStatus.PASS,"Pengguna memasukkan password kredensial yang tidak valid");
    }

    @Then("User tidak berhasil login dan mendapatkan feedback invalid credential")
    public void User_tidak_berhasil_login_dan_mendapatkan_feedback_invalid_credential(){
        Assert.assertEquals(loginPage.getTxtInvalid(),"Epic sadface: Username and password do not match any user in this service");
        extentTest.log(LogStatus.PASS,"User tidak berhasil login dan mendapatkan feedback invalid credential");
    }

}

