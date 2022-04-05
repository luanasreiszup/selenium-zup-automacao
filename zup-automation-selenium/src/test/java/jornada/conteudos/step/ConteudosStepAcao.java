package jornada.conteudos.step;

import io.cucumber.java.pt.Quando;
import jornada.conteudos.page.ConteudosAcao;

public class ConteudosStepAcao {
	
	ConteudosAcao acao = new ConteudosAcao();
	
	@Quando("clico no menu Conteudos")
	public void clico_menu_conteudos() {
		acao.clicarMenuConteudos();
	}
	

}


