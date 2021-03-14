package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Browser;

public class DadosSeguradoPage {
	
	WebDriver driver;
	
    public DadosSeguradoPage(WebDriver driver){
    	this.driver = driver;
        PageFactory.initElements(driver,this);
    }
	
	@FindBy(xpath = "//*[@id=\"firstname\"]")
	private WebElement firstname;
	
	@FindBy(xpath = "//*[@id=\"lastname\"]")
	private WebElement lastname;	

	@FindBy(xpath = "//*[@id=\"birthdate\"]")
	private WebElement birthdate;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]")
	private WebElement gendermale;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]")
	private WebElement genderfemale;
	
	@FindBy(xpath = "//*[@id=\"streetaddress\"]")
	private WebElement streetaddress;
	
	@FindBy(xpath = "//*[@id=\"country\"]")
	private WebElement country;
	
	@FindBy(xpath = "//*[@id=\"zipcode\"]")
	private WebElement zipcode;
	
	@FindBy(xpath = "//*[@id=\"city\"]")
	private WebElement city;
	
	@FindBy(xpath = "//*[@id=\"occupation\"]")
	private WebElement occupation;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]")
	private WebElement speeding;

	@FindBy(xpath = "//*[@id=\"bungeejumping\"]")
	private WebElement bungeejumping;
	
	@FindBy(xpath = "//*[@id=\"website\"]")
	private WebElement website;
		
	@FindBy(xpath = "//*[@id=\"nextenterproductdata\"]")
	private WebElement nextenterproductdata;
	
    protected void waitElementIsDone(WebDriver driver, WebElement element) {
    	WebDriverWait wait = new WebDriverWait(driver, 5L);
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    }
		
	public void selecaoCombo(String combo, String conteudo) {
		
		Select comboEscolhido = null;
		
        try {
            switch(combo) {
                case "country":
                	this.waitElementIsDone(driver, this.country);
                	comboEscolhido = new Select(this.country);
                    break;
                case "occupation":
                	this.waitElementIsDone(driver, this.occupation);
                	comboEscolhido = new Select(this.occupation);
                    break;
                default: ;
            }
    		
    		comboEscolhido.selectByVisibleText(conteudo);
        } catch (Exception e) {
            //throw new Exception(e);
        }

	}
	
	public void preencheTexto(String campo, String conteudo) {
		
        try {
            switch(campo) {
                case "firstname":
                	this.waitElementIsDone(driver, this.firstname);
                	this.firstname.sendKeys(conteudo);
                	break;
                case "lastname":
                	this.waitElementIsDone(driver, this.lastname);
                	this.lastname.sendKeys(conteudo);
                    break;
                case "streetaddress":
                	this.waitElementIsDone(driver, this.streetaddress);
                	this.streetaddress.sendKeys(conteudo);
                    break;
                case "zipcode":
                	this.waitElementIsDone(driver, this.zipcode);
                	this.zipcode.sendKeys(conteudo);
                    break;
                case "city":
                	this.waitElementIsDone(driver, this.city);
                	this.city.sendKeys(conteudo);
                    break;
                case "website":
                	this.waitElementIsDone(driver, this.website);
                	this.website.sendKeys(conteudo);
                    break;
                default: ;
            }

        } catch (Exception e) {
            //throw new Exception(e);
        }

	}
	
	public void selecaoData(String data) {

	    //Preenche data como 09/25/2013
		
	    birthdate.sendKeys(data);
	}
	
	public void selecaoGender(String tipo) {
        try {
            switch(tipo) {
                case "male":
                	this.waitElementIsDone(driver, this.gendermale);
                	this.gendermale.click();
                    break;
                case "female":
                	this.waitElementIsDone(driver, this.genderfemale);
                	this.genderfemale.click();
                    break;    
                default: ;
            }

        } catch (Exception e) {
            //throw new Exception(e);
        }
	}

	public void selecaoHobby(String tipo) {
		try {
			switch(tipo) {
				case "Speeding":
					this.waitElementIsDone(driver, this.speeding);
					this.speeding.click();
					break;
				case "BungeeJumping":
					this.waitElementIsDone(driver, this.bungeejumping);
					this.bungeejumping.click();
					break;
				default: ;
			}

		} catch (Exception e) {
			//throw new Exception(e);
		}
	}
	
	public void clicarNext() {
		
		nextenterproductdata.click();
	}

}

