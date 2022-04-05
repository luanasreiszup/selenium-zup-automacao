package jornada.conteudos.step;

import io.cucumber.java.pt.Entao;
import jornada.conteudos.page.ConteudosVerificar;

public class ConteudosStepVerificacao {
	
	ConteudosVerificar verificar = new ConteudosVerificar();
	
	
	@Entao("vejo Conteudos da Zup Innovation")
	public void verifico_conteudos_zup() {
		verificar.validarConteudos();
	}

}


