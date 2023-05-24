package com.example.prototipo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrototipoApplicationTests {

	@Autowired
	WebDriver driver;

	@Test
	void navigateToHomePage() {

		driver.get("http://localhost:8080/api/empresa/buscar"); 
		driver.quit();
	}

}
