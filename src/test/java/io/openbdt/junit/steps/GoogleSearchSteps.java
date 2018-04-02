package io.openbdt.junit.steps;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WebBrowserScreenElement;
import io.openbdt.junit.pages.GoogleSearchPage;
import junit.framework.Assert;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/context.xml")
public class GoogleSearchSteps {

	private GoogleSearchPage page;
	
	Logger LOG = Logger.getLogger(GoogleSearchSteps.class);
	
	@Autowired
	private WebBrowserScreenElement viewElement; // OBJETO QUE CONTÉM MÉTODOS PRÓPRIOS DO FRAMEWORK

	@Step
	public void abrirNavegador(String url) {
		viewElement.open(url);
	}
	
	@Step
	public void preencherCampoPesquisa(String key) {
		viewElement.sendText(page.getCampoPesquisa(), key);
	}
	
	@Step
	public void iniciarPesquisa() {
		viewElement.submit(page.getCampoPesquisa());
	}
	
	@Step
	public void validarPesquisaConcluida() {
		Assert.assertTrue(viewElement.isDisplayed(page.getElementoValidacaoPesquisaConcluida()));
	}
}