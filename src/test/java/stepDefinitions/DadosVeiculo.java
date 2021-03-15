package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pages.DadosVeiculoPage;

import utils.Browser;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class DadosVeiculo {
	
	 WebDriver driver;		
	 private DadosVeiculoPage vehicleData;

	 @Given("^usuario esta na pagina inicial$")
	 public void usuarioEstaNaPrimeiraPagina() throws Exception {
		String browserType = System.getProperty("browser");
		Browser.openBrowser(browserType);
		driver = Browser.getWebDriver();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	 	vehicleData = new DadosVeiculoPage(driver);
	 }

	
    /*public DadosSeguro() throws Exception {        
    	vehicleData = new VehicleDataPage();
    }*/

	@Before
	public void before() throws Exception {
		String browserType = System.getProperty("browser");
		//Browser.openBrowser(browserType);
	}
	
	/*
	 * @After public void after() throws Exception { Browser.getWebDriver().close();
	 * Browser.getWebDriver().quit(); }
	 */

	@Given("que acesso a tela inicial")
	public void abrirPaginaInicial() {
		Browser.getWebDriver().get("http://sampleapp.tricentis.com/101/app.php");
	}
	
	@And("^seleciono combo \"([^\"]*)\" com \"([^\"]*)\"$")
	public void selecionoCombo(String combo, String conteudo) {
		vehicleData.selecaoCombo(combo, conteudo);

	}
	
	@And("^depois de um tempo de (\\d+) segundos$")
	public void um_tempo_de_segundos(final int tempo) throws Throwable {
		Thread.sleep(tempo * 1000);
	}


	@And("preencho o campo \"([^\"]*)\" com \"([^\"]*)\"$")
	public void preencherCampo(String campo, String conteudo) {
		vehicleData.preencheTexto(campo, conteudo);

	}

	@And("seleciono data com \"([^\"]*)\"$")
	public void preencherCampo(String data) {
		vehicleData.selecaoData(data);

	}
	
	@And("seleciono handDrive com \"([^\"]*)\"$")
	public void selecionoHandDrive(String tipo) {
		vehicleData.selecaoHandDrive(tipo);

	}
	
	@And("clico em Next")
	public void clicoNext() {
		vehicleData.clicarNext();
	}

}
