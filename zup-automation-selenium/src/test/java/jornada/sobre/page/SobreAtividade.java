package jornada.sobre.page;

public class SobreAtividade{
	
	SobreAcao acao = new SobreAcao();
	SobreVerificar verificar = new SobreVerificar();
	
	public void verificarProjetosZup() {
		acao.clicarMenuSobre();
		verificar.validarProjetos();
	}
}