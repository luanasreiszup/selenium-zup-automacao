package jornada.carreiras.page;

import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import core.setup.PaginaBase;


public class CarreirasAcao extends PaginaBase{
	
	public CarreirasAcao() {
		super(getDriver());
	}

	CarreirasTela tela = new CarreirasTela(getDriver());
	
	public void clicarMenuCarreiras() {
		wait.until(ExpectedConditions.visibilityOf(tela.btnCarreiras)).click();
	}
}

