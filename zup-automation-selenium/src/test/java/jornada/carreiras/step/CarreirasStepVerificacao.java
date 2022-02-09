package jornada.carreiras.step;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import jornada.carreiras.page.CarreirasVerificar;

public class CarreirasStepVerificacao {
	
	CarreirasVerificar verificar = new CarreirasVerificar();
	
	@Quando("clico no menu Carreiras")
	public void clico_menu_carreiras() {
		verificar.clicarMenuCarreiras();
	}
	
	
	@Entao("vejo Carreiras da Zup Innovation")
	public void verifico_carreiras_zup() {
		verificar.validarEvoluirCarreira();
	}

}


