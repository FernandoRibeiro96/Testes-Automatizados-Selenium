package main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.TextFields;

public class TesteCampoTreinamento {

	static String url;
	static WebDriver driver;
	
	TextFields textFields;
	
	@Before
	public void iniciar() {
		url = "file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html";
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		
		textFields = new TextFields(driver);
	}
	
	@After
	public void fecharNavegador() {
		//driver.quit();
	}
	
	public void pegandoUrl() {
		driver.get(url);
	}
	
	@Test
	public void campos() {
		pegandoUrl();
		textFields.nomeTest("Fernando");
		textFields.sobrenomeTest("Ribeiro");
	}
}
