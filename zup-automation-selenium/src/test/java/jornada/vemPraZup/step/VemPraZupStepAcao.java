package jornada.vemPraZup.step;


import io.cucumber.java.pt.Quando;
import jornada.vemPraZup.page.VemPraZupAcao;

public class VemPraZupStepAcao {
	
	VemPraZupAcao acao = new VemPraZupAcao();
	
	@Quando("clico no botao Vem Pra Zup")
	public void clico_botao_vem_pra_zup() {
		acao.clicarBotaoVemPraZup();
	}

}


