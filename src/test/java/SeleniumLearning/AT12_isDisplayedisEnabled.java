package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT12_isDisplayedisEnabled {

    @Test
    public void NavHn() throws InterruptedException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to HN website
        driver.get("https://echoecho.com/htmlforms12.htm");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Thread.sleep(20000);
        //isDisplayed--boolean operator
       boolean dis= driver.findElement(By.name("shorttext")).isDisplayed();
        System.out.println(" displayed is or no : "+dis);
        //isEnabled--boolean operator
        boolean ena= driver.findElement(By.name("shorttext")).isEnabled();
        System.out.println(" displayed is or no : "+ena);
    }
}