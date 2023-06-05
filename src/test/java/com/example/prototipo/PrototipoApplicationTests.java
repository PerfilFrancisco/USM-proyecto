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
	    String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projectPath + "./resources/chromedriver.exe");    
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
	    empresa.setnombre("Empresa de Prueba");
	    empresa.setrutempresa("123456789");
	    empresa.setEmail("email");
	    // Ejecutar la lógica de la clase (por ejemplo, guardar la empresa en la base de datos)
	    empresaService.crearEmpresa(empresa);
	    // Navegar a la página de visualización de la empresa creada
	    driver.get("http://localhost:8080/api/empresa/buscarCorreo/"+ empresa.getEmail());
  
	    // Verificar que la página muestre correctamente los datos de la empresa
	    WebElement nombreEmpresaElement = driver.findElement(By.id("nombre_empresa"));
	    assertEquals(empresa.getnombre(), nombreEmpresaElement.getText());
  
	    WebElement rutEmpresaElement = driver.findElement(By.id("rut_empresa"));
	    assertEquals(empresa.getrutempresa(), rutEmpresaElement.getText());
	}
  

}
