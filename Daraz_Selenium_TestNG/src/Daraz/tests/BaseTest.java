package Daraz.tests;

import Daraz.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.util.Map;


public class BaseTest {

    protected BaseTest() {

    }
//    @BeforeSuite
//    public  void beforeSuite() {
//
//    }
//
//    @AfterSuite
//    public void afterSuite() throws IOException {
////        ExtentReport.flushReports();
//    }
//


    @SuppressWarnings("unchecked")
    @BeforeMethod
    protected void setup(Object[] data) throws MalformedURLException {
        Map<String,String> map=(Map<String,String>)data[0];
       Driver.initDriver(map.get("browser"),map.get("version"));
    }

    @AfterMethod
    protected void tearDown() {
        Driver.quitDriver();
    }
}
