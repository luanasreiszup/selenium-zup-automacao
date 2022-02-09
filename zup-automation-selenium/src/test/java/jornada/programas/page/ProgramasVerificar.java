package jornada.programas.page;
import static core.setup.DriverFactory.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import core.setup.PaginaBase;
import jornada.programas.page.ProgramasTela;

public class ProgramasVerificar extends PaginaBase{
	
	public ProgramasVerificar() {
		super(getDriver());
	}

	ProgramasTela tela = new ProgramasTela(getDriver());
	
	public void validarBotaoConhecerProgramas() {
		wait.until(ExpectedConditions.visibilityOf(tela.btnConhecaProgramas)).isDisplayed();
	}
	
	public void clicarMenuProgramas() {
		wait.until(ExpectedConditions.visibilityOf(tela.btnProgramas)).click();
	}
}