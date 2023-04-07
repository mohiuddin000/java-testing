
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class projectParameter {
    
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser" , "url"})
    public void sauce(String browser , String link){
        
        if(browser.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
    }

        else if(browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
    
            driver = new EdgeDriver();
        }

        else if(browser.equalsIgnoreCase("firefox")){
                WebDriverManager.firefoxdriver().setup();
        
                driver = new FirefoxDriver();
            }

       driver.get(link);

       driver.manage().window().maximize();
        
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
    public void addCart(){
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
      String  a=driver.findElement(By.name("inventory_item_price")).getText();

      System.out.println(a);


    }

    @AfterClass
    public void close() throws InterruptedException{
        Thread.sleep(3000);
        driver.close();
    }


}
