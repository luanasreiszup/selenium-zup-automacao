package jornada.sejaZupper.step;


import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import jornada.sejaZupper.page.SejaZupperVerificar;

public class SejaZupperStepVerificacao {
	
	SejaZupperVerificar verificar = new SejaZupperVerificar();
	
	
	@Entao("vejo as carreiras do Zupper")
	public void verifico_carreiras_zupper() {
		verificar.validarCarreiraZupper();
	}

}


