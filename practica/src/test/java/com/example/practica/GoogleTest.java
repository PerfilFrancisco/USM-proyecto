package com.example.practica;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class GoogleTest {

      @Autowired
      private WebDriver webDriver;
      
      @Test
      void PerfomLogin(){
           webDriver.navigate().to("https://www.google.com/");
      }
}
