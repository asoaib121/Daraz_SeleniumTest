package Daraz.tests;

import Daraz.Enums.AuthorType;
import Daraz.Enums.CategoryType;
import Daraz.annotations.FrameworkAnnotation;
import Daraz.pages.DarazHomePage;
import Daraz.pages.BrandFilterComponent;
import Daraz.pages.ProductSelectionComponent;
import Daraz.utils.DataProviderUtils;
import org.testng.annotations.Test;

import java.util.Map;

public class DarazTest extends BaseTest {


    @FrameworkAnnotation(
            author = {AuthorType.Shoaib},
            category = {CategoryType.REGRESSION}
    )
    @Test(dataProvider = "getData", dataProviderClass = DataProviderUtils.class)
    public void searchSelectProductTest(Map<String, String> data) {

        DarazHomePage homePage = new DarazHomePage();

        // Step 1-2: Search from Excel data
        homePage.searchProduct(data.get("searchTerm"));

        // Step 3: Select Brand from Excel
        new BrandFilterComponent().selectBrand(data.get("brandName"));

        // Step 4: Click on a specific product (hardcoded XPath)
        new ProductSelectionComponent().clickOnProduct();
    }
}
