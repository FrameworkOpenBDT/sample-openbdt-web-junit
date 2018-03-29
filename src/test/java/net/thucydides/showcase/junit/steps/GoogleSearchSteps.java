package net.thucydides.showcase.junit.steps;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WebBrowserScreenElement;
import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.showcase.junit.pages.GoogleSearchPage;

@ContextConfiguration("/context.xml")
@Component
public class GoogleSearchSteps {

	@Autowired
	GoogleSearchPage page;
	
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