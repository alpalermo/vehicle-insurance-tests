package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.DadosProdutoPage;
import utils.Browser;


public class DadosProduto {
	
	 WebDriver driver;		
	 private DadosProdutoPage productData;
	 
	 @Given("^user is on Third Page$")
	 public void user_is_on_Home_Page(){
		 productData = new DadosProdutoPage(Browser.getWebDriver());
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
