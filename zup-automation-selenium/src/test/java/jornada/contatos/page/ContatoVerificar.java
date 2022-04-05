package jornada.contatos.page;

import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import core.setup.PaginaBase;


public class ContatoVerificar extends PaginaBase{
	
	public ContatoVerificar() {
		super(getDriver());
	}

	ContatoTela tela = new ContatoTela(getDriver());
	
	public void validarContato() {
		wait.until(ExpectedConditions.visibilityOf(tela.txtContato)).isDisplayed();
	}

}
