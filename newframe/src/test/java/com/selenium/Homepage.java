package com.selenium;


import com.Action.Headeraction;
import com.UIobject.Header;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by in.Babushaik on 7/5/2017.
 */
public class Homepage {

private Base base;

    public Homepage(Base base){
        this.base=base;
    }




    @Given("^Open the TrustnetDirect Website$")
    public void open_the_TrustnetDirect_Website() {
        System.out.println("Opened");
//base.driver.navigate().to("https://www.trustnetdirect.com");
        assertTrue(base.headeraction.Homepage());


    }

    @And("^Click the Login button$")
    public void click_the_Login_button() {
        assertTrue(base.headeraction.Clicklogin());
        System.out.println("Clicked");
    }
    @And("^User able to see the Login Popup$")
    public void user_able_to_see_the_Login_Popup() {

        System.out.println("Pop-up visible");
        assertTrue(base.headeraction.Loginpopupverify());
    }

    @When("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterTheAnd(String Username, String Password) {
        assertTrue(base.headeraction.EnterUsername(Username));
        assertTrue(base.headeraction.EnterPassword(Password));
    }

    @Then("^User logged in Succesfully$")
    public void userLoggedInSuccesfully()  {

        assertTrue(base.homepageaction.LoginHomepage());
    }

    @And("^Click the Loginpopup Login button$")
    public void clickTheLoginpopupLoginButton() {
      assertTrue(base.headeraction.ClickloginpopupLogin());
    }


    }


