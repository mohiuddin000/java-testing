
package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class project2 {
    
    ChromeDriver driver;

    @BeforeClass
    public void sauce(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

      //  driver.get("https://www.facebook.com/");

        driver.get("https://www.saucedemo.com/inventory.html");
        
    }


    @Test(priority = 1)
    public void login_pass(){

       /*  driver.findElement(By.cssSelector("#email")).sendKeys("aniket");

       driver.findElement(By.cssSelector("#pass")).sendKeys("secret_sauce");*/

       //driver.findElement(By.cssSelector("input[name=email]")).sendKeys("aniket");

       driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("standard_user");
       driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("secret_sauce");

     //  driver.findElement(By.xpath("//input[@id='user-name']" )).sendKeys("standard_user");
            
    }
    //X path(relative path)
    //*[@id="email"]
    // //tagname[@attribute name = "attribute value"]
    
    //full X path(absolute)
  /*  /html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input */ 

     @Test(priority = 2)
    public void login(){

       // Absolute
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();

        /*Relative
        driver.findElement(By.xpath("//input[@id='login-button']")).click();*/
    
    }

    /*@Test(priority = 3)
    public void addCart() throws InterruptedException{
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
      /*   String  a=driver.findElement(By.className("inventory_details_price")).getText();



      System.out.println(a);

      List<WebElement> list =driver.findElements(By.partialLinkText("Lab"));

      list.get(1).click();
      Thread.sleep(3000);

    }*/
    
    @AfterClass
    public void close() throws InterruptedException{
        Thread.sleep(3000);
        driver.close();
    }



}

