package jornada.sobre.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.setup.PaginaBase;

public class SobreTela extends PaginaBase{

	public SobreTela(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@href='/sobre']")
	public WebElement btnSobre;

	@FindBy(xpath = "//a[@href='https://usebeagle.io/']")
	public WebElement btnBeagle;
	
	@FindBy(xpath = "//a[@href='https://charlescd.io/']")
	public WebElement btnCharles;
	
	@FindBy(xpath = "//a[@href='https://horusec.io/site/']")
	public WebElement btnHorusec;
	
	@FindBy(xpath = "//a[@href='https://ritchiecli.io/']")
	public WebElement btnRitchie;
}
