package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Browser;

public class LoginPage extends BasePage {

	@FindBy(id = "usuario")
	//@FindBy(xpath = "//*[@id=\"usuario\"]")
	private WebElement usuario;

	@FindBy(id = "senha")
	private WebElement senha;
	
	//@FindBy(id = "bra-botao-id")
	@FindBy(id = "bra-botao-idundefined")
	private WebElement btnAcessar;

	public void campoUsuario(String cdUsuario) {
		this.waitElementIsDone(Browser.getWebDriver(), this.usuario);
		//this.usuario.click();
		this.usuario.sendKeys(cdUsuario);
	}

	public void campoSenha(String senha) {
		this.senha.sendKeys(senha);
	}
	
	public void clicarAcessar() {
		LoginPage loginPage = new LoginPage();
		loginPage.btnAcessar.click();
	}

}