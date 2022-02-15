package jornada.programas.step;

import io.cucumber.java.pt.Quando;
import jornada.programas.page.ProgramasAcao;

public class ProgramasStepAcao {
	
	ProgramasAcao acao = new ProgramasAcao();
	
	@Quando("clico no menu Programas")
	public void clico_menu_programas() {
		acao.clicarMenuProgramas();
	}
	

}

