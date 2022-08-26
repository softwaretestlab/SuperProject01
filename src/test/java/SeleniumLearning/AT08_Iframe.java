package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT08_Iframe {
    @Test
    public void iframeListSelect() throws IOException, InterruptedException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Navigate to HN website
        driver.get("https://www.harveynorman.com.au/signup");
        // Here we got all the frames into a List
        List<WebElement> ListOfIframes  =driver.findElements(By.tagName("iframe"));
        // count of links
        int IframesCount = ListOfIframes.size();
        System.out.println("IframesCount :" + IframesCount);
        Thread.sleep(10000);
        for(int i=0; i<IframesCount;i++){
            driver.switchTo().frame(i);
            driver.findElement(By.name("firstName")).sendKeys("Test");
            break;
        }




    }

    public static class AT04_iframeConcept {
        @Test
        public void mpalearn() throws InterruptedException {
            //Setting up chromedriver.
            WebDriverManager.chromedriver().setup();
            //options
            ChromeOptions chromeOptions = new ChromeOptions();
            //we create an object of WebDriver
            WebDriver driver = new ChromeDriver(chromeOptions);
            //At this point browser will be opened
            //maximize browser
            driver.manage().window().maximize();
            //xpath version-1
            driver.get("https://stores.harveynorman.com.au/");
            Thread.sleep(10000);
            //iframe
            driver.switchTo().frame(0);
            //xpath version-2
            driver.findElement(By.xpath("//input[contains(@aria-label,'Search Location')]")).click();
            driver.findElement(By.xpath("//input[contains(@aria-label,'Search Location')]")).sendKeys("7 crop drive fraser rise");

        }

    }
}