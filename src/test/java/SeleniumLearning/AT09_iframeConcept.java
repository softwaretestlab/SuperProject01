package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AT09_iframeConcept {
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