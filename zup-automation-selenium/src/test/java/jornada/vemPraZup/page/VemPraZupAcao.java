package jornada.vemPraZup.page;

import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import core.setup.PaginaBase;


public class VemPraZupAcao extends PaginaBase{
	
	public VemPraZupAcao() {
		super(getDriver());
	}

	VemPraZupTela tela = new VemPraZupTela(getDriver());
	
	public void clicarBotaoVemPraZup() {
		wait.until(ExpectedConditions.visibilityOf(tela.btnVemPraZup)).click();
	}
}

