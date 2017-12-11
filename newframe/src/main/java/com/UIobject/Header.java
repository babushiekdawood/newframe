package com.UIobject;

import com.selenium.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by in.Babushaik on 4/21/2017.
 */
public class Header {
protected final WebDriver driver;
    public Header (WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//li[@id='js_login']//a[.='LOGIN']")
    protected WebElement Loginheaderbtn;
    @FindBy(how = How.XPATH, using = "//div[@class='overlay_title']//h3[.='Login:']")
    protected WebElement Loginpopupheading;
    @FindBy(how = How.ID, using = "LoginForm_UserName")
    protected WebElement Username;
    @FindBy(how = How.ID, using = "LoginForm_Password")
    protected WebElement password;
    @FindBy(how = How.XPATH, using = "//button[@type='submit'][.='LOGIN']")
    protected WebElement Loginbtn;

    /*public Header clicklogin(){

        Loginheaderbtn.click();
        return PageFactory.initElements(driver,Header.class);

    }*/

}

