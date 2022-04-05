package jornada.conteudos.page;

import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.setup.PaginaBase;

public class ConteudosTela extends PaginaBase{

	public ConteudosTela(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@href='https://www.zup.com.br/central-de-conteudos']")
	public WebElement btnConteudos;

	@FindBy(xpath = "/html/body/div[1]/div/section[1]/div/div[1]/div/div[1]/div/h1")
	public WebElement txtConteudos;
	
}