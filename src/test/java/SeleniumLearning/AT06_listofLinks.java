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

public class AT06_listofLinks {
    @Test
    public void Linkslist() throws IOException, InterruptedException {
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
        driver.get("https://www.thegoodguys.com.au/");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Here we got all the links into a List
        List<WebElement> ListOfLinks=driver.findElements(By.tagName("a"));
        //count of links
        int LinksCount =ListOfLinks.size();
        System.out.println("LinksCount :" + LinksCount);

        for(int i=0;i<LinksCount;i++){
           String LinkNameIs= ListOfLinks.get(i).getText().trim();
            System.out.println("LinkNameIs : "+LinkNameIs);
            if(LinkNameIs.equalsIgnoreCase("Afterpay")){
                ListOfLinks.get(i).click();
                break;
            }
        }
       // Thread.sleep(10000);
        //will quite webdriver
       // driver.quit();
    }

    }
