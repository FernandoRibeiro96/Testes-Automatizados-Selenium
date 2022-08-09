package util;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import page.PageObjects;

public class ComboBox extends PageObjects{
	
	@FindBy(id="elementosForm:escolaridade")
	private WebElement escolaridade;
	
	@FindBy(id="elementosForm:esportes")
	private WebElement esportes;

	public ComboBox(WebDriver driver) {
		super(driver);
	}
	
	public void comboTeste() {
		Select combo = new Select(escolaridade);
		//combo.selectByIndex(2);
		//combo.selectByVisibleText("1o grau incompleto");
		//Assert.assertEquals("1o grau incompleto", combo.getFirstSelectedOption().getText());
		List<WebElement> options = combo.getOptions();
		
		boolean encontrou = false;
		for(WebElement option: options) {
			if(option.getText().equals("2o grau incompleto")) {
				encontrou = true;
				break;
			}
			
		}
		Assert.assertTrue(encontrou);
	}
	
	public void multiplaEscolhaTeste() {
		Select multiEsc = new Select(esportes);
		multiEsc.selectByVisibleText("Natacao");
		multiEsc.selectByVisibleText("Corrida");
		multiEsc.selectByVisibleText("Futebol");
		
		List<WebElement> allSelectOptions = multiEsc.getAllSelectedOptions();
		Assert.assertEquals(3, allSelectOptions.size());
	}

}
