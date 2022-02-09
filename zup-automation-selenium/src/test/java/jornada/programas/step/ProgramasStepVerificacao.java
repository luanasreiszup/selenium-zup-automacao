package jornada.programas.step;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import jornada.programas.page.ProgramasVerificar;

public class ProgramasStepVerificacao {
	
	ProgramasVerificar verificar = new ProgramasVerificar();
	
	@Quando("clico no menu Programas")
	public void clico_menu_programas() {
		verificar.clicarMenuProgramas();
	}
	
	
	@Entao("vejo botao conhecer programas da Zup Innovation")
	public void verifico_botao_programas_zup() {
		verificar.validarBotaoConhecerProgramas();
	}

}


