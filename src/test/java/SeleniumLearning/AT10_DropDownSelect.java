package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AT10_DropDownSelect {

    @Test
    public void iframeReg() throws InterruptedException {

        //setup the chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.harveynorman.com.au/hp-15-6-inch-r5-5500u-8gb-512gb-ssd-laptop-1.html");
        //Wait few seconds for the page to load
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(20000);
      Select DropDownList= new Select(driver.findElement(By.id("select_999999900")));
        //1st method
        int DropDownListSize=DropDownList.getOptions().size();
        System.out.println("DropDownListSize : "+DropDownListSize);
//            for (int i=0;i<DropDownListSize;i++){
//                String DropDownVal=DropDownList.getOptions().get(i).getText().trim();
//                System.out.println("DropDownVal : "+DropDownVal);
//                if(DropDownVal.equalsIgnoreCase("2 years Product Care Replacement")){
//                    DropDownList.getOptions().get(i).click();
//                    break;
//                }
//            }

        //2nd method
        DropDownList.selectByVisibleText("2 years Product Care Replacement");

        //3rd method
        DropDownList.deselectByIndex(2);

    }
}
