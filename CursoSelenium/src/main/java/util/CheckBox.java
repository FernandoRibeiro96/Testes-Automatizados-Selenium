package util;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import page.PageObjects;

public class CheckBox extends PageObjects{
	
	@FindBy(id="elementosForm:comidaFavorita:0")
	private WebElement carne;
	
	@FindBy(id="elementosForm:comidaFavorita:1")
	private WebElement frango;
	
	@FindBy(id="elementosForm:comidaFavorita:2")
	private WebElement pizza;
	
	@FindBy(id="elementosForm:comidaFavorita:3")
	private WebElement vegetariano;

	public CheckBox(WebDriver driver) {
		super(driver);
	}
	
	public void marcarCampos() {
		carne.click();
		frango.click();
		pizza.click();
		vegetariano.click();
		Assert.assertTrue(carne.isSelected());
		
	}

}
