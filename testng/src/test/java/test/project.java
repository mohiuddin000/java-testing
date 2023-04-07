package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class project {
    
    ChromeDriver driver;

    @BeforeClass
    public void sauce(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        
    }


    @Test(priority = 1)
    public void login_pass(){

        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
    }

    @Test(priority = 2)
    public void login(){
        driver.findElement(By.cssSelector("input#login-button")).click();
    }

    @Test(priority = 3)
    public void addCart() throws InterruptedException{
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
      /*   String  a=driver.findElement(By.className("inventory_details_price")).getText();

      System.out.println(a);*/

      List<WebElement> list =driver.findElements(By.partialLinkText("Lab"));

      list.get(1).click();
      Thread.sleep(3000);

    }

    @AfterClass
    public void close() throws InterruptedException{
        Thread.sleep(3000);
        driver.close();
    }



}
