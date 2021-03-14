package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.InsurantDataPage;
import pages.VehicleDataPage;
import utils.Browser;

import java.util.concurrent.TimeUnit;


public class DadosSegurado {
	
	 WebDriver driver;		
	 private InsurantDataPage insurantData;
	 
	 @Given("^user is on Second Page$")
	 public void user_is_on_Home_Page(){	 
	 insurantData = new InsurantDataPage(Browser.getWebDriver());
	 }

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
