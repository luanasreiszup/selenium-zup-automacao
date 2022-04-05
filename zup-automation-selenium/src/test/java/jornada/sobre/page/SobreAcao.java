package jornada.sobre.page;

import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import core.setup.PaginaBase;

public class SobreAcao extends PaginaBase{

	public SobreAcao() {
		super(getDriver());

	}
	
	SobreTela tela = new SobreTela(getDriver());
	
	public void clicarMenuSobre() {
		wait.until(ExpectedConditions.visibilityOf(tela.btnSobre)).click();
	}
}
