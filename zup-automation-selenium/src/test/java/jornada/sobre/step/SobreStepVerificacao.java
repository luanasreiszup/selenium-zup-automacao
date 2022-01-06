package jornada.sobre.step;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import jornada.sobre.page.SobreVerificar;


public class SobreStepVerificacao {
	
	SobreVerificar verificar = new SobreVerificar();
	
	@Quando("clico no menu Sobre")
	public void clico_menu_sobre() {
		verificar.clicarMenuSobre();
	}
	
	
	@Entao("vejo projetos da Zup Innovation")
	public void verifico_projetos_zup() {
		verificar.validarProjetos();
	}

}