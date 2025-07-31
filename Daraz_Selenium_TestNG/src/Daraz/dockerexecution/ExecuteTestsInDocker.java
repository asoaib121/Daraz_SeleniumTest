//package Daraz.dockerexecution;
//
//import com.google.common.util.concurrent.Uninterruptibles;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
///**
// * Jan 26,2021
// * @author Amuthan Saakthivel
// * @version 1.0
// * @since 1.0
// */
//
//public class ExecuteTestsInDocker {
//
//    @Test(dataProvider = "getData")
//    public void localTest(String Browser,String version) throws MalformedURLException {
//       // WebDriverManager.chromedriver().setup(); //executable
//
//        //Old System
//        // DesiredCapabilities cap= new DesiredCapabilities();
//        //cap.setBrowserName(BrowserType.CHROME);
//
//        //New System
////      ChromeOptions options = new ChromeOptions();
////      options.setCapability("browserName","chrome"); // set browser type.
////      options.addArguments("--start-maximized"); // Open browser
////      options.addArguments("--disable-notifications"); // Stop notification
//
//        //Update System
//        ChromeOptions options = new ChromeOptions();
//        options.setCapability("browserName", Browser);
//     //   options.setCapability("browserVersion",version);
//
//        WebDriver driver =new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);
//
//        driver.get("https://www.google.co.in/");
//        System.out.println("Title is: "+driver.getTitle());
//        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
//        driver.quit();
//    }
//
//    @DataProvider(parallel=true)
//    public Object[][] getData(){
//        return new Object [][]
//                {{"firefox","139.0.1"},{"chrome","137.0.7151.68"},{"chrome","137.0.7151.68"}};
//
//    }
//}
//// Just Normal demo test class.