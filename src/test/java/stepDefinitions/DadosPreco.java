package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebDriver;
import pages.DadosPrecoPage;
import utils.Browser;


public class DadosPreco {
	
	 WebDriver driver;		
	 private DadosPrecoPage precoData;
	 
	 @Given("^usuario esta na quarta pagina$")
	 public void usuarioEstaNaQuartaPagina(){
		 precoData = new DadosPrecoPage(Browser.getWebDriver());
	 }
	 
	 @Then("^verifico que estou no tab 4$")
	 public void verificoTab(){
		 precoData.verificoTexto("Select Price Option");
	 }	

	@And("verifico presenca do texto \"([^\"]*)\"$")
	public void verificoTexto(String texto) {
		precoData.verificoTexto(texto);

	}

	@And("seleciono cotacao com \"([^\"]*)\"$")
	public void selecionoCotacao(String tipo) {
		precoData.selecaoPriceOption(tipo);

	}
	
	@And("clico em Next tela preco")
	public void clicoNextPreco() {
	 	precoData.clicarNext();
	}

}
