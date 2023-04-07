
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ca3_2nd {
    ChromeDriver driver; 
    @BeforeClass 
    public void googletest() 
    { 
        WebDriverManager.chromedriver().setup(); 
        driver = new ChromeDriver(); 
        driver.get("https://mail.google.com/"); 
 
    } 
    @Test 
    public void login() 
    { 
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mohiuddin3551@gmail.com");


        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sdjhgudydvk");

    } 
    @AfterClass 
    public void submit() 
    { 
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    } 
}


