package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

public class Hooks {

    static WebDriver driver;

    @Before
    public static void setUp() {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();


    }


    // automation screenshot


    @AfterAll
    public static void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }
}
