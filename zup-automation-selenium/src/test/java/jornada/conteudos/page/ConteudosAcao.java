
package jornada.conteudos.page;

import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import core.setup.PaginaBase;


public class ConteudosAcao extends PaginaBase{
	
	public ConteudosAcao() {
		super(getDriver());
	}

	ConteudosTela tela = new ConteudosTela(getDriver());
	
	public void clicarMenuConteudos() {
		wait.until(ExpectedConditions.visibilityOf(tela.btnConteudos)).click();
	}
}


