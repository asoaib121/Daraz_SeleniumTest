package Daraz.pages;

import Daraz.SearchBoxFunction.SearchBoxComponent;
import Daraz.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public final class DarazHomePage {

    private final By searchButtonLocator = By.xpath("//div[@class=\"search-box__search--2fC5\"]");
    public class SearchButtonComponent {

        public void clickSearch() {
            WebDriver driver = DriverManager.getDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(searchButtonLocator)).click();
        }
    }

    private final SearchBoxComponent searchBoxComponent;
    private final SearchButtonComponent searchButtonComponent;

    public DarazHomePage() {
        searchBoxComponent = new SearchBoxComponent();
        searchButtonComponent = new SearchButtonComponent();
    }

    public void searchProduct(String keyword) {
        searchBoxComponent.enterKeyword(keyword);
        searchButtonComponent.clickSearch();
    }
}
