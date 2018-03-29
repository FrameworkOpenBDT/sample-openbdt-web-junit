package net.thucydides.showcase.junit.features;

import org.junit.Test;

import io.openbdt.support.Feature;
import net.thucydides.core.annotations.Steps;
import net.thucydides.showcase.junit.steps.GoogleSearchSteps;

public class PesquisaSimplesGoogleFeature extends Feature{

    @Steps
    GoogleSearchSteps search;

    @Test
    public void pesquisa() {
    	search.abrirNavegador("https://www.google.com");
    	search.preencherCampoPesquisa("java");
    	search.iniciarPesquisa();
    	search.validarPesquisaConcluida();
    }
}

