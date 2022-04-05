package jornada.programas.page;


import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.setup.PaginaBase;

public class ProgramasTela  extends PaginaBase{

	public ProgramasTela(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@href='https://www.zup.com.br/nossos-programas']")
	public WebElement btnProgramas;

	@FindBy(xpath = "//a[@href='#programas']")
	public WebElement btnConhecaProgramas;
	
}

