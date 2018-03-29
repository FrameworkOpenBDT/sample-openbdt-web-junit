package net.thucydides.showcase.junit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import net.serenitybdd.core.pages.PageObject;

@Component
public class GoogleSearchPage extends PageObject{

	@FindBy(id = "lst-ib")
	private WebElement campoPesquisa;

	@FindBy(id = "hdtb-msb")
	private WebElement elementoValidacaoPesquisaConcluida;

	public WebElement getCampoPesquisa() {
		return campoPesquisa;
	}

	public WebElement getElementoValidacaoPesquisaConcluida() {
		return elementoValidacaoPesquisaConcluida;
	}
}
