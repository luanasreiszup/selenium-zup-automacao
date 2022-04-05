package jornada.vemPraZup.step;


import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import jornada.vemPraZup.page.VemPraZupVerificar;

public class VemPraZupStepVerificacao {
	
	VemPraZupVerificar verificar = new VemPraZupVerificar();
	
	
	@Entao("vejo as Carreiras da Zup Innovation")
	public void verifico_as_carreiras_zup() {
		verificar.validarAsCarreiras();
	}

}


