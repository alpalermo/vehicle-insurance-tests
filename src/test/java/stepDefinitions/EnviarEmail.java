package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebDriver;
import pages.EnviaEmailPage;
import utils.Browser;


public class EnviarEmail {
	
	 WebDriver driver;		
	 private EnviaEmailPage envioEmail;
	 
	 @Given("^usuario esta na quinta pagina$")
	 public void usuarioEstaNaQuintaPagina(){
		 envioEmail = new EnviaEmailPage(Browser.getWebDriver());
	 }
	 
	 @Then("^verifico que estou no tab 5$")
	 public void verificoTab(){
		 envioEmail.verificoTexto("Send Quote");
	 }	

	@After
	public void after() throws Exception {
		//Browser.getWebDriver().close();
		//Browser.getWebDriver().quit();
	}

	@And("preencho campo \"([^\"]*)\" com \"([^\"]*)\" para envio de email$")
	public void preenhoCampos(String campo, String conteudo) {
		envioEmail.preencheTexto(campo, conteudo);

	}

	@And("verifico presenca do texto final \"([^\"]*)\"$")
	public void verificoTexto(String texto) {
		envioEmail.verificoTexto(texto);

	}
	
	@And("clico em Send para envio de email")
	public void clicoSend() {
	 	envioEmail.clicarNext();
	}

}
