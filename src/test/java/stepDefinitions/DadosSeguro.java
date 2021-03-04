package stepDefinitions;

import org.junit.Assert;

import pages.VehicleDataPage;
import pages.LoginPage;
import utils.Browser;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DadosSeguro {
	
	private VehicleDataPage vehicleData;
	
    /*public DadosSeguro() throws Exception {        
    	vehicleData = new VehicleDataPage();
    }*/

	@Before
	public void before() throws Exception {
		String browserType = System.getProperty("browser");
		Browser.openBrowser(browserType);
	}
	
	@After
	public void after() throws Exception {
		Browser.getWebDriver().close();
		Browser.getWebDriver().quit();
	}

	@Given("que acesso a tela inicial")
	public void abrirPaginaDeLogin() {
		Browser.getWebDriver().get("http://sampleapp.tricentis.com/101/app.php");
	}
	
	@And("^seleciono combo \"([^\"]*)\" com \"([^\"]*)\"$")
	public void selecionoMake(String combo, String conteudo) {
		vehicleData = new VehicleDataPage();
		vehicleData.selecaoCombo(combo, conteudo);

	}
	
	@And("^depois de um tempo de (\\d+) segundos$")
	public void um_tempo_de_segundos(final int tempo) throws Throwable {
		Thread.sleep(tempo * 1000);
	}


	@And("preenchi o campo \"([^\"]*)\" com \"([^\"]*)\"$")
	public void preencherCampo(String campo, String conteudo) {
		//VehicleDataPage vehicleData = new VehicleDataPage();
		vehicleData.preencheTexto(campo, conteudo);

	}

	@And("seleciono data com \"([^\"]*)\"$")
	public void preencherCampo(String data) {
		//VehicleDataPage vehicleData = new VehicleDataPage();
		vehicleData.selecaoData(data);

	}
	
	@And("seleciono handDrive com \"([^\"]*)\"$")
	public void selecionoHandDrive(String tipo) {
		//VehicleDataPage vehicleData = new VehicleDataPage();
		vehicleData.selecaoHandDrive(tipo);

	}
	
	@And("clico em Next")
	public void clicarAcessar() {
		vehicleData.clicarNext();
	}

	@Then("sou redirecionado para Home")
	public void validateUser() throws InterruptedException {
		VehicleDataPage homePage = new VehicleDataPage();

		//Assert.assertEquals("Rafael M. da Silva Filho", homePage.getUserName());
	}

}
