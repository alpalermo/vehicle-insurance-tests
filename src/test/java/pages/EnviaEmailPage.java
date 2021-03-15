package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnviaEmailPage {

	WebDriver driver;

    public EnviaEmailPage(WebDriver driver){
    	this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    
	@FindBy(xpath = "//*[@id=\"sendquote\"]")
	private WebElement sendquote;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement inputEmail;

	@FindBy(xpath = "//*[@id=\"phone\"]")
	private WebElement inputPhone;

	@FindBy(xpath = "//*[@id=\"username\"]")
	private WebElement inputUsername;

	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement inputPassword;

	@FindBy(xpath = "//*[@id=\"confirmpassword\"]")
	private WebElement inputConfirmPassword;

	@FindBy(xpath = "//*[@id=\"Comments\"]")
	private WebElement inputComments;

	@FindBy(xpath = "/html/body/div[4]/h2")
	private WebElement txtSendingEmailSuccess;

	@FindBy(xpath = "//*[@id=\"sendemail\"]")
	private WebElement btnSendemail;
	
    protected void waitElementIsDone(WebDriver driver, WebElement element) {
    	WebDriverWait wait = new WebDriverWait(driver, 5L);
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    }

	public void preencheTexto(String campo, String conteudo) {

		try {
			switch(campo) {
				case "email":
					this.waitElementIsDone(driver, this.inputEmail);
					this.inputEmail.sendKeys(conteudo);
					break;
				case "phone":
					this.waitElementIsDone(driver, this.inputPhone);
					this.inputPhone.sendKeys(conteudo);
					break;
				case "username":
					this.waitElementIsDone(driver, this.inputUsername);
					this.inputUsername.sendKeys(conteudo);
					break;
				case "password":
					this.waitElementIsDone(driver, this.inputPassword);
					this.inputPassword.sendKeys(conteudo);
					break;
				case "confirmpassword":
					this.waitElementIsDone(driver, this.inputConfirmPassword);
					this.inputConfirmPassword.sendKeys(conteudo);
					break;
				case "comments":
					this.waitElementIsDone(driver, this.inputComments);
					this.inputComments.sendKeys(conteudo);
					break;
				default: ;
			}

		} catch (Exception e) {
			//throw new Exception(e);
		}

	}

	public void verificoTexto(String texto) {
		try {
			switch(texto) {
				case "Sending e-mail success!":
					this.waitElementIsDone(driver, this.txtSendingEmailSuccess);
					Assert.assertEquals(texto, txtSendingEmailSuccess.getText());
					break;
				case "Select Quote":
					this.waitElementIsDone(driver, this.sendquote);
					Assert.assertTrue(sendquote.getText().contains(texto));
					break;
				default: ;
			}

		} catch (Exception e) {
			//throw new Exception(e);
		}
	}

	public void clicarNext() {
		btnSendemail.click();
	}

}

