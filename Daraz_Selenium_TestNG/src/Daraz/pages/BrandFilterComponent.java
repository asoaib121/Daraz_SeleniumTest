package Daraz.pages;

import Daraz.driver.DriverManager;
import Daraz.utils.DynamicXpathUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrandFilterComponent {

    // Dynamic XPath template for brand checkbox


    public void selectBrand(String brandName) {
        String brandCheckboxXPath = "//label[contains(.,'"+brandName+"')]";
        //String finalXpath = DynamicXpathUtils.getXpath(brandCheckboxXPath, brandName);
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));

        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(brandCheckboxXPath)));
        checkbox.click();
    }
}