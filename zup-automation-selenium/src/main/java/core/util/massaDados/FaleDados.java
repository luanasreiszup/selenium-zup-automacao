package core.util.massaDados;

import core.util.leitorJson.LeitorJson;

public class FaleDados {
	
	private String nome;
	private String email;
	private String assunto;
	private String mensagem;
	private String notificacao;

	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getAssunto() {
		return assunto;
	}
	public String getMensagem() {
		return mensagem;
	}
	
	public String getNotificacao() {
		return notificacao;
	}
	
	public FaleDados(String json_file, String id_massa) {
		this.nome = LeitorJson.PesquisaJson(json_file, id_massa, "nome");
		this.email = LeitorJson.PesquisaJson(json_file, id_massa, "email");
		this.assunto = LeitorJson.PesquisaJson(json_file, id_massa, "assunto");
		this.mensagem = LeitorJson.PesquisaJson(json_file, id_massa, "mensagem");
		this.notificacao = LeitorJson.PesquisaJson(json_file, id_massa, "noticacao");
	}
}
