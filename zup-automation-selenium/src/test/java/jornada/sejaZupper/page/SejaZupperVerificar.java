package jornada.sejaZupper.page;


import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import core.setup.PaginaBase;


public class SejaZupperVerificar extends PaginaBase{
	
	public SejaZupperVerificar() {
		super(getDriver());
	}

	SejaZupperTela tela = new SejaZupperTela(getDriver());
	
	public void validarCarreiraZupper() {
		wait.until(ExpectedConditions.visibilityOf(tela.txtCarreira)).isDisplayed();
	}

}
