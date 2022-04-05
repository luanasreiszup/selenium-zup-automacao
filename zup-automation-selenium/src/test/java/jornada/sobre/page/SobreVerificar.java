package jornada.sobre.page;

import static core.setup.DriverFactory.getDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import core.setup.PaginaBase;


public class SobreVerificar extends PaginaBase{
	
	public SobreVerificar() {
		super(getDriver());
	}

	SobreTela tela = new SobreTela(getDriver());
	
	public void validarProjetos() {
		wait.until(ExpectedConditions.visibilityOf(tela.btnBeagle)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(tela.btnCharles)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(tela.btnHorusec)).isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(tela.btnRitchie)).isDisplayed();
	}

}
