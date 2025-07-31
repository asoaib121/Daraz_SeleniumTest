package Daraz.factory;

import Daraz.Enums.ConfigProperties;
import Daraz.utils.PropertyUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Jan 26, 2021
 * @author Amuthan Sakthivel
 * @version 1.0
 * @since 1.0
 */

public final class DriverFactory {

    private DriverFactory() {}

    public static WebDriver getDriver(String browser, String version) throws MalformedURLException {

        WebDriver driver=null;
        String runmode= PropertyUtils.get(ConfigProperties.RUNMODE);

        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            if(runmode.equalsIgnoreCase("remote")){
                ChromeOptions options = new ChromeOptions();
                options.setCapability("browserName","chrome");
               // options.setCapability("browserVersion",version);


                    driver =new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),options);
            }else{
                // Initialize ChromeDriver
               // WebDriverManager.chromedriver().setup();//4.00
                driver = new ChromeDriver();
            }
        }
        //interface open dual browser
        else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            if(runmode.equalsIgnoreCase("remote")){
                ChromeOptions options = new ChromeOptions();
                options.setCapability("browserName","firefox");
               // options.setCapability("browserVersion",version);


                   driver =new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),options);

            }else {
                //WebDriverManager.firefoxdriver().setup(); //4.00
                driver = new FirefoxDriver();
            }
        }

        return driver;
    }

}
