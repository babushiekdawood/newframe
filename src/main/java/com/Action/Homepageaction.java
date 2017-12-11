package com.Action;

import com.UIobject.HomepageObject;
import com.toolbox.Element;
import com.toolbox.Sync;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SourceType;

/**
 * Created by Babu on 13-08-2017.
 */
public class Homepageaction extends HomepageObject {

    public Homepageaction(WebDriver driver) {
        super(driver);
    }

    WebDriver driver;
    public boolean LoginHomepage() {

        boolean loginHomepage = false;
        try {
                Sync.implicitewait();
                WebElement loggedusername1 = Sync.Waitforelement(driver,By.xpath(LoggedUsername1));
                Element.Verify(driver, loggedusername1);

                WebElement log=Element.Verifystr(driver,By.xpath(LoggedUsername1));
                Element.Verify(driver, log);
                System.out.println("Element is Visible");

                WebElement element= driver.findElement(By.xpath(LoggedUsername1));


                loginHomepage = true;
                }
        catch (Exception e){
            System.out.println(e);
        }
        return loginHomepage;
    }

}
