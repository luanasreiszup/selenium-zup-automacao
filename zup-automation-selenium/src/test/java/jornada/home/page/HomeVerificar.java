package jornada.home.page;

import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import core.setup.PaginaBase;

public class HomeVerificar extends PaginaBase{
	
	public HomeVerificar() {
		super(getDriver());
	}

	HomeTela tela = new HomeTela(getDriver());
	
	public void validarButtons() {
		wait.until(ExpectedConditions.visibilityOf(tela.btnCarreiras)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(tela.btnSobre)).isDisplayed();
	}
}
