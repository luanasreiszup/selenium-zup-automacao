package jornada.home.step;


import jornada.home.page.HomeVerificar;
import io.cucumber.java.pt.Entao;


public class HomeStepVerificacao {
	
	HomeVerificar verificar = new HomeVerificar();
	
	@Entao("vejo os botoes principais da home")
	public void verificar_botao_home() {
		verificar.validarButtons();
		System.out.println("Valeu!!!");
	}

}
