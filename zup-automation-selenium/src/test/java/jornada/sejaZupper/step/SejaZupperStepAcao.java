package jornada.sejaZupper.step;

import io.cucumber.java.pt.Quando;
import jornada.sejaZupper.page.SejaZupperAcao;

public class SejaZupperStepAcao {
	
	SejaZupperAcao acao = new SejaZupperAcao();
	
	@Quando("clico no botao Seja Zupper")
	public void clico_botao_seja_zupper() {
		acao.clicarBotaoSejaZupper();
	}
	

}


