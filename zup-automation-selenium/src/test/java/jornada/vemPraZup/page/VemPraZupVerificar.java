package jornada.vemPraZup.page;

import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import core.setup.PaginaBase;


public class VemPraZupVerificar extends PaginaBase{
	
	public VemPraZupVerificar() {
		super(getDriver());
	}

	VemPraZupTela tela = new VemPraZupTela(getDriver());
	
	public void validarAsCarreiras() {
		wait.until(ExpectedConditions.visibilityOf(tela.txtCarreiras)).isDisplayed();
	}

}
