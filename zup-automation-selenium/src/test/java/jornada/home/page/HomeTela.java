package jornada.home.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.setup.PaginaBase;

public class HomeTela extends PaginaBase{

	public HomeTela(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@href='https://www.zup.com.br/carreiras']")
	public WebElement btnCarreiras;
	
	@FindBy(xpath = "//a[@href='/sobre']")
	public WebElement btnSobre;
		
}
