package com.example.prototipo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.prototipo.model.Empresa;
import com.example.prototipo.service.EmpresaService;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class PrototipoApplicationTests {

	@Autowired
	EmpresaService empresaService;

	private WebDriver driver;

	@BeforeEach
	public void setUp() {
	    // Configuración de Selenium
	    System.setProperty("webdriver.chrome.driver", "./src/test/java/com/example/resources/chromedriver.exe");
	    driver = new ChromeDriver();
	}
  
	@AfterEach
	public void tearDown() {
	    // Cerrar el navegador
	    driver.quit();
	}
  
	@Test
	public void testCrearEmpresa() {
	    // Crear una instancia de Empresa con datos de prueba
	    Empresa empresa = new Empresa();	    
	    empresa.setNombre_empresa("Empresa de Prueba");
	    empresa.setRut_empresa("123456789");
	    empresa.setEmail("email");
	    // Ejecutar la lógica de la clase (por ejemplo, guardar la empresa en la base de datos)
	    System.out.println("Empresa creada: " + empresa.getEmail());
	    // Navegar a la página de visualización de la empresa creada
	    driver.get("http://localhost:8080/api/empresa/buscarCorreo/"+ empresa.getEmail());
  
	    // Verificar que la página muestre correctamente los datos de la empresa
	    WebElement nombreEmpresaElement = driver.findElement(By.id("nombre_empresa"));
	    assertEquals(empresa.getNombre_empresa(), nombreEmpresaElement.getText());
  
	    WebElement rutEmpresaElement = driver.findElement(By.id("rut_empresa"));
	    assertEquals(empresa.getRut_empresa(), rutEmpresaElement.getText());
	}
  

}
