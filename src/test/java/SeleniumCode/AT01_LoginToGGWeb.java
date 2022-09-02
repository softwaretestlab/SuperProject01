package SeleniumCode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_LoginToGGWeb {
    @Test
    public static void Nav() throws IOException {
        OpenBrowser.NavToWebsite(ReadPropertiesFile.PropFile("GGHomePageUrl01"));
        //implicit wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public static void ClickOnLogin() throws IOException {
        OpenBrowser.driver.findElement(By.xpath("//i[@class='nav-supplementary-icon ggdsicon-user-slim-o']")).click();
    }
    @Test
    public static void EnterLogins() throws IOException {
        OpenBrowser.driver.findElement(By.id("WC_AccountDisplay_FormInput_logonId_In_Logon_1")).sendKeys("test");

    }
}
