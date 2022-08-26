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

public class AT11_isSelected {

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
        driver.get("https://echoecho.com/htmlforms09.htm");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Thread.sleep(20000);
        List<WebElement> RadioButtonsList = driver.findElements(By.name("Checkbox"));
        int RadioSize = RadioButtonsList.size();
        System.out.println("RadioSize :" + RadioSize);


        for (int i = 0; i < RadioSize; i++) {
            //THis is how we get attribute value
            String AttVal = RadioButtonsList.get(i).getAttribute("name");
            System.out.println("AttVal :" + AttVal);
            if (AttVal.equalsIgnoreCase("Checkbox")) {
                //isSelected--checkboxes, radiobuttons
                boolean Sel=RadioButtonsList.get(i).isSelected();
                System.out.println(" is selected : "+ Sel);
              //  break;
            }
        }
    }
}