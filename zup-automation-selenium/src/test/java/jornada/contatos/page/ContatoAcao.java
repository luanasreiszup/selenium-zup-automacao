package jornada.contatos.page;

import static core.setup.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import core.setup.PaginaBase;


public class ContatoAcao extends PaginaBase{


	WebElement driver;
	Select combo;
	
	public ContatoAcao() {
		super(getDriver());
	}
	

	ContatoTela tela = new ContatoTela(getDriver());
	
	public void clicarMenuContato() {
		wait.until(ExpectedConditions.visibilityOf(tela.btnContato)).click();
	}
	
	public void preencherNome() {
		wait.until(ExpectedConditions.visibilityOf(tela.boxName)).sendKeys("NOME TESTE");
	}
	
	public void preencherEmail() {
		wait.until(ExpectedConditions.visibilityOf(tela.boxEmail)).sendKeys("teste@teste.com");
	}
		
	
	public void escolheAssunto() {
		tela.comboAssunto.click();
		tela.assunto.click();
	}


	public void preencherMensagem() {
		wait.until(ExpectedConditions.visibilityOf(tela.textArea)).sendKeys("Mensagem teste");
	}
	
	public void clicarBotaoEnviar() {
		wait.until(ExpectedConditions.visibilityOf(tela.btnEnviar)).click();
	}
}

