package util;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import page.PageObjects;

public class TextFields extends PageObjects{
	
	@FindBy(id="elementosForm:nome")
	private WebElement nome;
	
	@FindBy(id="elementosForm:sobrenome")
	private WebElement sobrenome;
	
	@FindBy(id="elementosForm:sugestoes")
	private WebElement sugestoes;
	
	public TextFields(WebDriver driver) {
		super(driver);
	}
	
	public void nomeTest(String nomeCampo) {
		nome.sendKeys(nomeCampo);
		Assert.assertEquals("Fernando", nome.getAttribute("value"));
	}
	
	public void sobrenomeTest(String sobrenomeCampo) {
		sobrenome.sendKeys(sobrenomeCampo);
		Assert.assertEquals("Ribeiro", sobrenome.getAttribute("value"));
	}
	
	public void sugestoesTest(String sugestao) {
		sugestoes.sendKeys(sugestao);
	}
}
