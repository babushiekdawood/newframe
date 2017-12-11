package com.selenium;





import com.Action.Headeraction;
import com.Action.Homepageaction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * Created by in.Babushaik on 7/24/2017.
 */
public class Base {

    protected static WebDriver driver;
    public Headeraction headeraction;
    public Homepageaction homepageaction;
    public List<HashMap<String, String>> datamap;

    public Base(){

        initpages();
    }


public void initpages() {

    headeraction = new Headeraction (driver);
    homepageaction = new Homepageaction(driver);


     if (driver == null)

         createNewDriverInstance();
    }

    public void createNewDriverInstance(){

        if(driver==null) {
            String browser = new Propertyreader().readProperty("browser");

            if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "D:\\newframe\\Driver\\chromedriver\\chromedriver.exe");
                driver = new ChromeDriver();
                datamap = Datahelper.data(System.getProperty("H:\\BabuPENDrive\\Framework (1)\\Framework\\src\\main\\java\\Util\\Test.xls"), "sheet1");
            } else {
                System.out.println("can't read browser type");
            }
        }

    }
    public WebDriver getDriver(){

        return driver;
    }
    public void destroyDriver(){
        driver.quit();
        driver = null;
    }
}
