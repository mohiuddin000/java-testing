package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class ca3 {

    private WebDriver driver;

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
    public void loginTest() {
       
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mohiuddin3551@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sdjhgudydvk");

        
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        
        driver.findElement(By.xpath("//div[contains(text(),'Compose')]"));
    }

    @AfterTest
    public void tearDown() {
       
        driver.quit();
    }
}
