package jornada.carreiras.page;

import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import core.setup.PaginaBase;


public class CarreirasVerificar extends PaginaBase{
	
	public CarreirasVerificar() {
		super(getDriver());
	}

	CarreirasTela tela = new CarreirasTela(getDriver());
	
	public void validarEvoluirCarreira() {
		wait.until(ExpectedConditions.visibilityOf(tela.txtEvoluirCarreira)).isDisplayed();
	}

}
