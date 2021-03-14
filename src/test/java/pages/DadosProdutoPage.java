package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DadosProdutoPage {

	WebDriver driver;

    public DadosProdutoPage(WebDriver driver){
    	this.driver = driver;
        PageFactory.initElements(driver,this);
    }
	
	@FindBy(xpath = "//*[@id=\"startdate\"]")
	private WebElement startdate;

	@FindBy(xpath = "//*[@id=\"insurancesum\"]")
	private WebElement insurancesum;

	@FindBy(xpath = "//*[@id=\"meritrating\"]")
	private WebElement meritrating;

	@FindBy(xpath = "//*[@id=\"damageinsurance\"]")
	private WebElement damageinsurance;

	@FindBy(xpath = "//*[@id=\"courtesycar\"]")
	private WebElement courtesycar;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]")
	private WebElement europrotection;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]")
	private WebElement legaldefenseinsurance;
		
	@FindBy(xpath = "//*[@id=\"nextselectpriceoption\"]")
	private WebElement nextselectpriceoption;
	
    protected void waitElementIsDone(WebDriver driver, WebElement element) {
    	WebDriverWait wait = new WebDriverWait(driver, 5L);
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    }
		
	public void selecaoCombo(String combo, String conteudo) {
		
		Select comboEscolhido = null;
		
        try {
            switch(combo) {
                case "insurancesum":
                	this.waitElementIsDone(driver, this.insurancesum);
                	comboEscolhido = new Select(this.insurancesum);
                    break;
                case "meritrating":
                	this.waitElementIsDone(driver, this.meritrating);
                	comboEscolhido = new Select(this.meritrating);
                    break;
				case "damageinsurance":
					this.waitElementIsDone(driver, this.damageinsurance);
					comboEscolhido = new Select(this.damageinsurance);
					break;
				case "courtesycar":
					this.waitElementIsDone(driver, this.courtesycar);
					comboEscolhido = new Select(this.courtesycar);
					break;
                default: ;
            }
    		
    		comboEscolhido.selectByVisibleText(conteudo);
        } catch (Exception e) {
            //throw new Exception(e);
        }
	}

	public void selecaoOptionalProducts(String tipo) {
		try {
			switch(tipo) {
				case "EuroProtection":
					this.waitElementIsDone(driver, this.europrotection);
					this.europrotection.click();
					break;
				case "LegalDefenseInsurance":
					this.waitElementIsDone(driver, this.legaldefenseinsurance);
					this.legaldefenseinsurance.click();
					break;
				default: ;
			}

		} catch (Exception e) {
			//throw new Exception(e);
		}
	}

	public void selecaoData(String data) {

	    //Preenche data como 09/25/2013

		startdate.sendKeys(data);
	}
	

	public void clicarNext() {
		
		nextselectpriceoption.click();
	}

}

