package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebDriver;
import pages.DadosProdutoPage;
import utils.Browser;


public class DadosProduto {
	
	 WebDriver driver;		
	 private DadosProdutoPage productData;
	 
	 @Given("^usuario esta na terceira pagina$")
	 public void usuarioEstaNaTerceiraPagina(){
		 productData = new DadosProdutoPage(Browser.getWebDriver());
	 }
	 
	 @Then("^verifico que estou no tab 3$")
	 public void verificoTab(){
		 productData.verificoTexto("Enter Product Data");
	 }

	@And("^seleciono combo \"([^\"]*)\" produto com \"([^\"]*)\"$")
	public void selecionoComboProduto(String combo, String conteudo) {
		productData.selecaoCombo(combo, conteudo);

	}

	@And("seleciono data produto com \"([^\"]*)\"$")
	public void preencherDataProduto(String data) {
		productData.selecaoData(data);

	}

	@And("seleciono optional products com \"([^\"]*)\"$")
	public void selecionoOptionalProducts(String tipo) {
		productData.selecaoOptionalProducts(tipo);

	}
	
	@And("clico em Next tela produto")
	public void clicoNextProduto() {
		productData.clicarNext();
	}



}
