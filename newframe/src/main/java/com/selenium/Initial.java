package com.selenium;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by in.Babushaik on 7/26/2017.
 */
public class Initial{
public WebDriver driver;


    @Before()
    public void setup(){
        System.out.println("Intialize");

        driver = new Base().getDriver();
        driver.manage().window().maximize();

        }


@After
    public void cleanup() {

            new Base().destroyDriver();
    }
}
