package jornada.carreiras.step;

import io.cucumber.java.pt.Quando;
import jornada.carreiras.page.CarreirasAcao;

public class CarreirasStepAcao {
	
	CarreirasAcao acao = new CarreirasAcao();
	
	@Quando("clico no menu Carreiras")
	public void clico_menu_carreiras() {
		acao.clicarMenuCarreiras();
	}
	
	

}


