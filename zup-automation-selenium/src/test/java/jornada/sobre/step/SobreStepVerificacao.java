package jornada.sobre.step;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import jornada.sobre.page.SobreAtividade;
import jornada.sobre.page.SobreVerificar;


public class SobreStepVerificacao {
	

	SobreAtividade atividade = new SobreAtividade();
		
	@Entao("vejo projetos da Zup Innovation")
	public void verifico_projetos_zup() {
		atividade.verificarProjetosZup();
	}

}
