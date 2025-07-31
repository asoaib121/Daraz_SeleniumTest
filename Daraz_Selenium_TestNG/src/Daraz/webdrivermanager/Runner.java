package Daraz.webdrivermanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {
    public static void main(String[] args) {
        /*
        1.Different OS
        2.Different Browser version needs different driver versions
         */

        // WebDriverManager.chromedriver().clearResolutionCache().setup();
        WebDriverManager.chromedriver().proxy("http://username:password@my companyproxy.com:port").setup();
      //  WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriver driver=new ChromeDriver();
    }

}
