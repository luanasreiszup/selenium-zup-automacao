package jornada.sobre.step;

import io.cucumber.java.pt.Quando;
import jornada.sobre.page.SobreAcao;


public class SobreStepAcao {
	
	SobreAcao acao = new SobreAcao();
	
	@Quando("clico no menu Sobre")
	public void clico_menu_sobre() {
		acao.clicarMenuSobre();
	}
	


}
