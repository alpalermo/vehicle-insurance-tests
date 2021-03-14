package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.VehicleDataPage;

import utils.Browser;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DadosVeiculo {
	
	 WebDriver driver;		
	 private VehicleDataPage vehicleData;	

	 @Given("^user is on Home Page$")
	 public void user_is_on_Home_Page() throws Exception {
	 	/*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir").replace("automacao",  "") + "/webdrivers/linux/chromedriver");
	 	driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	driver.get("http://sampleapp.tricentis.com/101/app.php");*/
		String browserType = System.getProperty("browser");
		Browser.openBrowser(browserType);
		driver = Browser.getWebDriver();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	 	vehicleData = new VehicleDataPage(driver);
	 //insurantData = new InsurantDataPage(driver);
	 }

	
    /*public DadosSeguro() throws Exception {        
    	vehicleData = new VehicleDataPage();
    }*/

	@Before
	public void before() throws Exception {
		String browserType = System.getProperty("browser");
		//Browser.openBrowser(browserType);
	}
	
	@After
	public void after() throws Exception {
		//Browser.getWebDriver().close();
		//Browser.getWebDriver().quit();
	}

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
	
    /*public DadosSeguro() throws Exception {        
    	vehicleData = new VehicleDataPage();
    }*/

}
