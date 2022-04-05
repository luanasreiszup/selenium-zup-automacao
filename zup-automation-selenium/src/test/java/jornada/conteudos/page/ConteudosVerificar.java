package jornada.conteudos.page;

import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import core.setup.PaginaBase;


public class ConteudosVerificar extends PaginaBase{
	
	public ConteudosVerificar() {
		super(getDriver());
	}

	ConteudosTela tela = new ConteudosTela(getDriver());
	
	public void validarConteudos() {
		wait.until(ExpectedConditions.visibilityOf(tela.txtConteudos)).isDisplayed();
	}

}
