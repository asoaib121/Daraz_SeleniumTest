package Daraz.pages;

import Daraz.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductSelectionComponent {

    // Example: XPath of specific iPhone product — adjust as per your product
    private final By productLocator = By.xpath("(//*[@data-qa-locator='product-item'])[3]");

    public void clickOnProduct() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(productLocator));
        product.click();
    }
}