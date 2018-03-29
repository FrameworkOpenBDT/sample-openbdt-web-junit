package net.thucydides.showcase.junit.features;

import org.junit.Test;

import io.openbdt.support.Feature;
import net.thucydides.core.annotations.Steps;
import net.thucydides.showcase.junit.steps.GoogleLoginSteps;

public class GoogleLoginFeature extends Feature {

	@Steps
	private GoogleLoginSteps loginGoogle;
	
	@Test
	public void falhaNoLogin() {
		loginGoogle.abrirNavegador("https://google.com");
		loginGoogle.clicarEmFazerLogin();
		loginGoogle.aguardarCarregamentoDaPagina();
		loginGoogle.inserirEmail("test@test.com");
		loginGoogle.avancarParaInserirASenha();
		loginGoogle.inserirSenha("test");
		loginGoogle.avancarParaConfirmarLogin();
		loginGoogle.verificarMensagemDeFalha();
	}
}
