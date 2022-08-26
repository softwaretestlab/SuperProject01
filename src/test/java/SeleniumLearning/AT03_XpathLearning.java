package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AT03_XpathLearning {

    @Test
    public void xpath() throws InterruptedException {
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
        driver.get("https://www.harveynorman.com.au/");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(10000);
//        //click on gift card from menu
//        driver.findElement(By.xpath("//a[@href='https://www.harveynorman.com.au/gift-cards']")).click();
//        Thread.sleep(10000);
//        //scroll to element
//        //  Try to use JavascriptExecutor to bring the element within the Viewport:
//        //xpath Learning
//        //Version-1 -- Xpath
//        //clicking on computers and tablets
//        WebElement myElement =driver.findElement(By.xpath("//a[@title='Harvey Norman - Computers & Tablets']"));
//        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
//        jse2.executeScript("arguments[0].scrollIntoView()", myElement);
//
//        //xpath Learning
//        //Version-1 -- Xpath
//        //clicking on computers and tablets
//        driver.findElement(By.xpath("//a[@title='Harvey Norman - Computers & Tablets']")).click();

        //Version-2 -- contains
     //   driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("computer");

        //Version-3 -- contains(text())
        driver.findElement(By.xpath("//span[contains(text(),'Store finder')]")).click();



        //a[contains(text(),'Sitemap')]



    }
}
