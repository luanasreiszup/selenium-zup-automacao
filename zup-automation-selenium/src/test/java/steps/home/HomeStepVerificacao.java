package steps.home;

import io.cucumber.java.pt.Entao;
import pages.home.HomeVerificar;

public class HomeStepVerificacao {
	
	HomeVerificar verificar = new HomeVerificar();
	
	@Entao("vejo os botoes principais da home")
	public void verificar_botao_home() {
		verificar.validarButtons();
		System.out.println("Valeu!!!");
	}

}
