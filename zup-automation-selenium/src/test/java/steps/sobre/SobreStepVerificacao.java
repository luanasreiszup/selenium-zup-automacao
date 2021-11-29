package steps.sobre;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.sobre.SobreVerificar;

public class SobreStepVerificacao {
	
	SobreVerificar verificar = new SobreVerificar();
	
	@Quando("clico no menu Sobre")
	public void clico_menu_sobre() {
		verificar.clicarMenuSobre();
	}
	
	
	@Entao("vejo projetos da Zup Innovation")
	public void verifico_projetos_zup() {
		verificar.validarProjetos();
		System.out.println("Valeu!!!");
	}

}
