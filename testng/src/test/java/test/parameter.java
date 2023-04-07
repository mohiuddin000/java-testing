package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})
    void setupdrive(String browser,String link){
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }


        driver.get(link);
        driver.manage().window().maximize();
    }

    @Test
    void gettitlefrompage() throws InterruptedException{
        driver.findElement(By.name("q")).sendKeys("Mobile");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(),"Mobile - Google Search");
    }

    @AfterClass
    void driveclose(){
        driver.close();
    }
}