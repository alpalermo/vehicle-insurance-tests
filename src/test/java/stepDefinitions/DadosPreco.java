package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.DadosPrecoPage;
import utils.Browser;


public class DadosPreco {
	
	 WebDriver driver;		
	 private DadosPrecoPage precoData;
	 
	 @Given("^user is on Forth Page$")
	 public void user_is_on_Home_Page(){
		 precoData = new DadosPrecoPage(Browser.getWebDriver());
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
