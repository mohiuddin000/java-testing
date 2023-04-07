package test;

 
        import io.github.bonigarcia.wdm.WebDriverManager; 
        import org.openqa.selenium.By; 
      //  import org.openqa.selenium.WebDriver; 
        import org.openqa.selenium.chrome.ChromeDriver; 
        import org.testng.annotations.AfterClass; 
        import org.testng.annotations.BeforeClass; 
        import org.testng.annotations.Test; 
 
public class webDRiver 
{ 
 
    ChromeDriver driver; 
    @BeforeClass 
    public void googletest() 
    { 
        WebDriverManager.chromedriver().setup(); 
        driver = new ChromeDriver(); 
        driver.get("https://www.saucedemo.com/"); 
 
    } 
    @Test 
    public void login() 
    { 
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user"); 
 
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce"); 
 
    } 
    @AfterClass 
    public void submit() 
    { 
        driver.findElement(By.cssSelector("input#login-button")).click(); 
    } 
}
