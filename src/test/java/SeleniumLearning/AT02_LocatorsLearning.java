package SeleniumLearning;

import PropertiesFile.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT02_LocatorsLearning {

    @Test
    public void locLearn() throws IOException {
        //Setting up chromedriver.
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        // navigate to HN website
      //  driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");

        driver.get(ReadPropertiesFile.PropFile("GGHomePageUrl"));
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //by id
        driver.findElement(By.id("regAddForm_firstName")).sendKeys("FirstName");
        //by name
        driver.findElement(By.name("lastName")).sendKeys("LastName");
        //by linktext
        driver.findElement(By.linkText("1 Hr Click & Collect")).click();

            }
}
