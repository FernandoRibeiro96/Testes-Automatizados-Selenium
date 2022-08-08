package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import page.PageObjects;

public class RadioBtn extends PageObjects{
	
	@FindBy(id="elementosForm:sexo:0")
	private WebElement rdMasculino;
	
	@FindBy(id="elementosForm:sexo:1")
	private WebElement rdFeminino;

	public RadioBtn(WebDriver driver) {
		super(driver);
	}
	
	public void radioMasculinoTeste() {
		rdMasculino.click();
	}
	
	public void radioFemininoTeste() {
		rdFeminino.click();
	}

}
