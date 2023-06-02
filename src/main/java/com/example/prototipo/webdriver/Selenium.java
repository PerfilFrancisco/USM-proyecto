package com.example.prototipo.webdriver;



import java.time.Duration;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
      
      private WebDriver driver;

      @Before(value = "")
      public void setUp(){
            System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver/chromedriver.exe");
            driver = new ChromeDriver(); 
            driver.manage().window().maximize();
            driver.get("http://localhost:8080/api/empresa/buscar");
      }

      @Test
      public void testPage(){
            WebElement searchbox = driver.findElement(By.name("q"));
            searchbox.clear();
            searchbox.sendKeys("quality-stream Introduccion a la automatizacion de pruebas de software");
            searchbox.submit();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      }

      @After(value = "")
      public void tearDown(){
            driver.quit();
      }
}
