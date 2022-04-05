package jornada.contatos.step;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import jornada.contatos.page.ContatoAcao;

public class ContatoStepAcao {
	
	ContatoAcao acao = new ContatoAcao();
	
	@Quando("clico no menu Contatos")
	public void clico_menu_contato() {
		acao.clicarMenuContato();
	}
	
	@E("preencho e envio os dado da mensagem")
	public void preencho_os_dados() throws InterruptedException {
		acao.preencherNome();
		acao.preencherEmail();
		acao.escolheAssunto();
		//acao.preencherMensagem();
		//acao.clicarBotaoEnviar();
	}

}


