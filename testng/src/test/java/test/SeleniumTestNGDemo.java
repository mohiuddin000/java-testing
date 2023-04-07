package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestNGDemo {
 
    @Test
    public void sampleTestMethod() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/watch?v=AxouQUrqwsY");

        Thread.sleep(3000);
        driver.quit();
    }
}
