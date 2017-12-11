package com.selenium;


import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by in.Babushaik on 4/17/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/Test1.feature",tags={"@done"},format = {"pretty", "html:target/Destination"})

public class Executor {

    }


