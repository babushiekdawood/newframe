package com.UIobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Babu on 09-08-2017.
 */
public class HomepageObject {
    protected final WebDriver driver;

    public HomepageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//a[@title='babuqa21 babuqa21']")

    protected WebElement LoggedUsername;

    protected String LoggedUsername1 = new StringBuilder()
            .append("//a[@title='babuqa1 babuqa1']")
            .append("[.='b.. b..']").toString();

   // protected WebElement LoggedUsername1;





}


