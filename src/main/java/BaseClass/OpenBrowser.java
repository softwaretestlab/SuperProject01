package BaseClass;

import PropertiesFile.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowser {
    public static WebDriver driver;
    public static void NavToWebsite(String url) {

        //Setting up chromedriver.
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
         driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        // navigate to HN website
        //   driver.get("https://www.harveynorman.com.au/");
        driver.get(url);
    }
}