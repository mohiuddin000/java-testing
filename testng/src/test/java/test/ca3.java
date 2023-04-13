package test;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class ca3 {

     WebDriver driver;

    @BeforeTest
    @Parameters({"browser", "url"})
    public void setup(String browser, String url) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "path/to/msedgedriver.exe");
            driver = new EdgeDriver();
        }
       
       
    }

    @Test
    public void loginTest() throws IOException {
        FileInputStream file = new FileInputStream("resources/config.properties");
        Properties prop = new Properties();
        prop.load(file);
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
       
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();


        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);

        
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        
        driver.findElement(By.xpath("//div[contains(text(),'Compose')]"));
    }

    @AfterTest
    public void tearDown() {
       
        driver.quit();
    }
}
