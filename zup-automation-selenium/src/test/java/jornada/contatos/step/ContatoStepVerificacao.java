package jornada.contatos.step;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import jornada.contatos.page.ContatoVerificar;

public class ContatoStepVerificacao {
	
	ContatoVerificar verificar = new ContatoVerificar();
	
	
	@Entao("vejo Contatos da Zup Innovation")
	public void verifico_contato_zup() {
		verificar.validarContato();
	}

}


