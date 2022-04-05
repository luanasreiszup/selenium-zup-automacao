package jornada.contatos.page;

import static core.setup.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import core.setup.PaginaBase;

public class ContatoTela extends PaginaBase{

	
	public ContatoTela(WebDriver driver) {
		super(driver);
	}
		
	
	@FindBy(xpath = "//a[@href='https://www.zup.com.br/contato']")
	public WebElement btnContato;

	@FindBy(xpath = "/html/body/div[1]/div/section[1]/div[2]/div[2]/div/div[1]/div/h1")
	public WebElement txtContato;
	
	@FindBy(name = "name-1")
	public WebElement boxName;
	
	@FindBy(name = "email-1")
	public WebElement boxEmail;
	
	@FindBy(xpath = "//*[@id=\"select2-forminator-form-7123__field--select-1-container\"]")
	public WebElement comboAssunto;
	
	@FindBy(xpath = "//*[@id=\"select2-forminator-form-7123__field--select-1-container\"][@title=\"Departamento pessoal e RH\"]")
	public WebElement assunto;
	
	@FindBy(name = "textarea-1")
	public WebElement textArea;
	
	
	@FindBy(xpath = "/html/body/div[1]/div/section[4]/div[2]/div/div/section/div[2]/div[2]/div/div/div/div/form/div[7]/div/div/button")
	public WebElement btnEnviar;
	

		
	

	
}