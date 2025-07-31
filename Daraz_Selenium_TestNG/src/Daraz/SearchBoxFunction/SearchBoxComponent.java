package Daraz.SearchBoxFunction;

import Daraz.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchBoxComponent {

    private final By searchBoxLocator = By.xpath("//div[@class=\"search-box__bar--29h6\"]/input[@class=\"search-box__input--O34g\"]");

    /**
     * This method enters the given keyword into the search box.
     * The keyword should be provided from outside (e.g., from Excel in your test).
     *
     * @param keyword The search text to enter
     */
    public void enterKeyword(String keyword) {
        WebDriver driver = DriverManager.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxLocator));
        searchBox.clear();
        searchBox.sendKeys(keyword);
    }
}
