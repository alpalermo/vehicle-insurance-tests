package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DadosSeguradoPage;
import utils.Browser;


public class DadosSegurado {
	
	 WebDriver driver;		
	 private DadosSeguradoPage insurantData;
	 
	 @Given("^usuario esta na segunda pagina$")
	 public void usuarioEstaNaSegundaPagina(){	 
		 insurantData = new DadosSeguradoPage(Browser.getWebDriver());
	 }
	 
	 @Then("^verifico que estou no tab 2$")
	 public void verificoTab(){
		  insurantData.verificoTexto("Enter Insurant Data");
	 }		 

	@And("preencho o campo \"([^\"]*)\" segurado com \"([^\"]*)\"$")
	public void preencherCampoSegurado(String campo, String conteudo) {
		insurantData.preencheTexto(campo, conteudo);

	}
	
	@And("^seleciono combo \"([^\"]*)\" segurado com \"([^\"]*)\"$")
	public void selecionoComboSegurado(String combo, String conteudo) {
		insurantData.selecaoCombo(combo, conteudo);

	}

	@And("seleciono data segurado com \"([^\"]*)\"$")
	public void preencherDataSegurado(String data) {
		insurantData.selecaoData(data);

	}
	
	@And("seleciono gender segurado com \"([^\"]*)\"$")
	public void selecionoGenderSegurado(String gender) {
		insurantData.selecaoGender(gender);

	}

	@And("seleciono hobby segurado com \"([^\"]*)\"$")
	public void selecionoHobbySegurado(String tipo) {
		insurantData.selecaoHobby(tipo);

	}
	
	@And("clico em Next tela segurado")
	public void clicoNextSegurado() {
		insurantData.clicarNext();
	}



}
