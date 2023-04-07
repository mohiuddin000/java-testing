package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.AssertJUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class firstcode {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Mobile");
        Thread.sleep(3000);

        driver.findElement(By.name("btnK")).click();

        Thread.sleep(3000);
        AssertJUnit.assertEquals(driver.getTitle(), "Mobile - Google Search");

        driver.close();
    }


}
