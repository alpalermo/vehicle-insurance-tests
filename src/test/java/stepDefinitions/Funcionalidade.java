package stepDefinitions;

import org.junit.Assert;

import pages.HomePage;
import pages.LoginPage;
import utils.Browser;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Funcionalidade {

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

	@Given("que acessei na tela inicial")
	public void abrirPaginaDeLogin() {
		Browser.getWebDriver().get("http://localhost:4200/login");
	}


	@And("preenchi o campo Usuario")
	public void preencherUsuario() {
		LoginPage loginPage = new LoginPage();

		//loginPage.campoUsuario(Constants.USUARIO); 
	}

	@And("preenchi o campo Senha")
	public void preencherSenha() {
		LoginPage loginPage = new LoginPage();

		//loginPage.campoSenha(Constants.SENHA);
	}

	@And("clico no botão em acessar")
	public void clicarAcessar() {
		LoginPage loginPage = new LoginPage();

		loginPage.clicarAcessar();
	}
	
	@When("posiciono o mouse sobre o Usuário no menu")
	public void posicionoOMouseSobreUsuario() {
		HomePage homePage = new HomePage();
		homePage.moveMouseToUser();
		
	}

	@Then("sou redirecionado para Home")
	public void validateUser() throws InterruptedException {
		HomePage homePage = new HomePage();

		Assert.assertEquals("Rafael M. da Silva Filho", homePage.getUserName());
	}

//	private void efetuarLoginUm() {
//		LoginPage loginPage = new LoginPage();
//		Browser.getWebDriver().get("https://alelo-lannister.cit/content/pesim/home.html");
//		loginPage.typeCpf(Constants.CPF_Lannister);
//		loginPage.typeDia(Constants.DIA_Lannister);
//		loginPage.typeMes(Constants.MES_Lannister);
//		loginPage.typeAno(Constants.ANO_Lannister);
//		loginPage.typeSenha(Constants.SENHA);
//		loginPage.typeCaptcha(Constants.CAPTCHA);
//		loginPage.clickEntrar();
//	}

}
