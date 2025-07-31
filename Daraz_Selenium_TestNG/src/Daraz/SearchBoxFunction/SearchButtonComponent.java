//package Daraz.SearchBoxFunction;
//
//import Daraz.driver.DriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class SearchButtonComponent {
//
//    private final By searchButtonLocator = By.xpath("//div[@class=\"search-box__search--2fC5\"]");
//
//    public void clickSearch() {
//        WebDriver driver = DriverManager.getDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(searchButtonLocator)).click();
//    }
//}
