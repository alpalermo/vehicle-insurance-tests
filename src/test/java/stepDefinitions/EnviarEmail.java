package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.EnviaEmailPage;
import utils.Browser;


public class EnviarEmail {
	
	 WebDriver driver;		
	 private EnviaEmailPage envioEmail;
	 
	 @Given("^user is on Fifth Page$")
	 public void user_is_on_Home_Page(){
		 envioEmail = new EnviaEmailPage(Browser.getWebDriver());
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
