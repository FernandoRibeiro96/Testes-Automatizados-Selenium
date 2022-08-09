package main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.CheckBox;
import util.ComboBox;
import util.RadioBtn;
import util.TextFields;

public class TesteCampoTreinamento {

	static String url;
	static WebDriver driver;
	
	TextFields textFields;
	RadioBtn rdbtn;
	CheckBox checkBox;
	ComboBox comb;
	
	@Before
	public void iniciar() {
		url = "file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html";
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		
		textFields = new TextFields(driver);
		rdbtn = new RadioBtn(driver);
		checkBox = new CheckBox(driver);
		comb = new ComboBox(driver);
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
		rdbtn.radioMasculinoTeste();
		//rdbtn.radioFemininoTeste();
		checkBox.marcarCampos();
		comb.comboTeste();
		comb.multiplaEscolhaTeste();
		textFields.sugestoesTest("Acrescentar o bmx como esporte na grade curricular.");
	}
	
}
