package com.example.prototipo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.example.prototipo.model.Administrador;
import com.example.prototipo.model.Empresa;
import com.example.prototipo.model.Evaluacion;
import com.example.prototipo.repository.AdministradorRepository;
import com.example.prototipo.repository.EmpresaRepository;
import com.example.prototipo.repository.EvaluacionRepository;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class PrototipoApplicationTests {

	private static ExtentReports extent;
	private ExtentTest test;

	@Autowired
	private EmpresaRepository empresaRepository;

	@Autowired
	private AdministradorRepository administradorRepository;

	private Evaluacion evaluacion;	
	@Autowired
	private EvaluacionRepository evaluacionRepository;

	@BeforeClass
	public static void setUpClass() {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReports.html");            
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@Before
	public void setUp() {
		test = extent.createTest("PrototipoApplicationTests", "Pruebas automatizadas");        
	}

	@DisplayName("Prueba de registro de empresa")
	@Test
	public void testRegistroEmpresa(){
		try {
			Empresa empresa = new Empresa(
				"Empresa de prueba",
				"etapa sello",
				"email",
				"nombre contraparte",
				"fecha ingreso",
				"rut dni",
				"razon social",
				"tipo sello",
				"telefono contraparte",
				false,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				"rut empresa test",
				null,
				null
			);
		Empresa empresaGuardada = empresaRepository.save(empresa);		
		assertNotNull(empresaGuardada);			
			test.log(Status.PASS, "testRegistroEmpresa pasó exitosamente");
		} catch (Exception e) {
			// Si algo sale mal, agrega un evento FAIL al reporte
			test.log(Status.FAIL, "testRegistroEmpresa falló con la excepción: " + e.getMessage());
		}	
	}

	@DisplayName("test para crear una evaluacion")
	@Test
	public void testEvaluacion(){
		try {
			evaluacion = new Evaluacion(null,
			null, 
			null, 
			null, 
			null, 
			null,
			null,
			null,
			null, 
			null, 
			null, 
			null, 
			null, 
			null, 
			null);
			Evaluacion evaluacionGuardada = evaluacionRepository.save(evaluacion);
			assertNotNull(evaluacionGuardada);			
			test.log(Status.PASS, "testEvaluacion pasó exitosamente");
		} catch (Exception e) {
			// Si algo sale mal, agrega un evento FAIL al reporte
			test.log(Status.FAIL, "testEvaluacion falló con la excepción: " + e.getMessage());
		}		
	}

	@Test
	public void testLogin(){
		try{
			Administrador user = new Administrador("nombre","contraseña");
			Administrador userComprobacion = administradorRepository.save(user);
			assertNotNull(userComprobacion);
			test.log(Status.PASS, "testLogin pasó exitosamente");
		} catch (Exception e) {
			// Si algo sale mal, agrega un evento FAIL al reporte
			test.log(Status.FAIL, "testLogin falló con la excepción: " + e.getMessage());
		}	
	}

	@After
	public void tearDown() {	
		extent.flush();						
	}
}
