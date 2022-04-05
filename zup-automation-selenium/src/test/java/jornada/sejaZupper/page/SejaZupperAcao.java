package jornada.sejaZupper.page;


import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import core.setup.PaginaBase;


public class SejaZupperAcao extends PaginaBase{
	
	public SejaZupperAcao() {
		super(getDriver());
	}

	SejaZupperTela tela = new SejaZupperTela(getDriver());
	
	public void clicarBotaoSejaZupper() {
		wait.until(ExpectedConditions.visibilityOf(tela.btnSejaZupper)).click();
	}
}

