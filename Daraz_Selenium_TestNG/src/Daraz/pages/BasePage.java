package Daraz.pages;

import Daraz.Enums.WaitStrategy;
import Daraz.driver.DriverManager;
import Daraz.factory.ExplicitWaitFactory;
import Daraz.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class BasePage {

    protected void click(By by, WaitStrategy waitstrategy,String elementname){

        //we want to make sure user can only choose from list of predefined options
        WebElement element= ExplicitWaitFactory.performExplicitWaitFactory(waitstrategy, by);

        //use action.because don't click element direct
        new Actions(DriverManager.getDriver())
                .moveToElement(element)
                .pause(Duration.ofMillis(300))
                .click(element)
                .pause(Duration.ofMillis(300))
                .perform();

        //element.click();
        try {
            ExtentLogger.pass(elementname+ "is clicked",true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected void sendKeys (By by,String value, WaitStrategy waitstrategy,String elementname)  {

        WebElement element=  ExplicitWaitFactory.performExplicitWaitFactory(waitstrategy, by);
        element.sendKeys(value);
        try {
            ExtentLogger.pass(value + "is entered successfully in" +elementname,true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }
}