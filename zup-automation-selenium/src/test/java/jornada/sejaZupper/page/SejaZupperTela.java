package jornada.sejaZupper.page;


import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.setup.PaginaBase;

public class SejaZupperTela extends PaginaBase{

	public SejaZupperTela(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@href='https://www.zup.com.br/carreiras']")
	public WebElement btnSejaZupper;

	@FindBy(xpath = "/html/body/div[1]/div/section[6]/div/div[1]/div/div[1]/div/h2")
	public WebElement txtCarreira;
	
}

