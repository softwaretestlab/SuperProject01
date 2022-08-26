package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AT14_SwitchTabs {
    @Test
    public void SwitchTabLearn() throws InterruptedException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options 01
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to HN website
        driver.get("https://www.harveynorman.com.au/customer/account/login");
        //implict wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //click on CustomiseMe, new tab will open
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[contains(text(),'CustomiseMe')]")).click();
        //implict wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //getWindowHandles--> will tell us the list of opened tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        int tabSize =tabs.size();
        System.out.println("tabs count " + tabSize); // 2 tabs open
        //1st Method --right way
//        for(int i=0;i<tabSize;i++){
//            Thread.sleep(10000);
//            driver.switchTo().window(tabs.get(i));
//            break;
//        }

        //2nd method -- just for practise purpose
        int i=0;
        do{
            Thread.sleep(10000);
            driver.switchTo().window(tabs.get(i));
            Thread.sleep(10000);
            driver.navigate().refresh();
            i++;
            break;

        }while(i<tabSize);
      //  driver.quit();
    }


}
