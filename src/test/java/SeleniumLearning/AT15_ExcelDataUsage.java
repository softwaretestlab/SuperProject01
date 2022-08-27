package SeleniumLearning;
import PropertiesFile.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.Xls_Reader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class AT15_ExcelDataUsage {

    @Test
    public void table() throws IOException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to GG AccountCreation page
        driver.get(ReadPropertiesFile.PropFile("GGHomePageUrl"));
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //C:\Users\softw\IdeaProjects\SuperProject01\src\main\java\Resources\TestDataHN1.xlsx
        Xls_Reader reader=new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\TestDataHN1.xlsx");
        // count of rows in the excel sheet
        int rowcount=reader.getRowCount("RegTestData");
        System.out.println("rowcount :"+rowcount);
        for(int j=2; j<=rowcount;j++){
            //Here we picked up data for Firstname from excel
          String FirstName=  reader.getCellData("RegTestData","FirstName",j);
            System.out.println("FirstName value is : "+ FirstName);
            //FirstName
            driver.findElement(By.id("regAddForm_firstName")).clear();
            driver.findElement(By.id("regAddForm_firstName")).sendKeys(FirstName);
            //password Address
            //Here we picked up data for LastName from excel
            String lastname=reader.getCellData("RegTestData","LastName",j);
            driver.findElement(By.id("regAddForm_lastName")).clear();
            driver.findElement(By.id("regAddForm_lastName")).sendKeys(lastname);
            //Here we picked up data for Email Address from excel
            String email_address=reader.getCellData("RegTestData","EmailAddress",j);
            driver.findElement(By.id("regAddForm_email1")).clear();
            driver.findElement(By.id("regAddForm_email1")).sendKeys(email_address);
            //Password
            String password=reader.getCellData("RegTestData","Password",j);
            driver.findElement(By.id("regAddForm_password")).clear();
            driver.findElement(By.id("regAddForm_password")).sendKeys(password);
            //reenter password
            String confirmation=reader.getCellData("RegTestData","RePassword",j);
            driver.findElement(By.id("regAddForm_passwordNew")).clear();
            driver.findElement(By.id("regAddForm_passwordNew")).sendKeys(confirmation);
            //put data back to excelsheet
            String textName=driver.findElement(By.xpath("//h1[contains(text(),'Create an Account')]")).getText();
            reader.setCellData("RegTestData","RegTestData",j,textName);
        }

    }


}