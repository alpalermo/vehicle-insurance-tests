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

public class DadosVeiculoPage {
	
	WebDriver driver;
	
    public DadosVeiculoPage(WebDriver driver){
    	this.driver = driver;
        PageFactory.initElements(driver,this);
    }

	
	@FindBy(xpath = "//*[@id=\"make\"]")
	private WebElement make;
	
	@FindBy(xpath = "//*[@id=\"model\"]")
	private WebElement model;	

	@FindBy(xpath = "//*[@id=\"numberofseats\"]")
	private WebElement numberofseats;

	@FindBy(xpath = "//*[@id=\"numberofseatsmotorcycle\"]")
	private WebElement numberofseatsmotorcycle;
	
	@FindBy(xpath = "//*[@id=\"fuel\"]")
	private WebElement fuel;
	
	@FindBy(xpath = "//*[@id=\"cylindercapacity\"]")
	private WebElement cylindercapacity;
	
	@FindBy(xpath = "//*[@id=\"engineperformance\"]")
	private WebElement engineperformance;
	
	@FindBy(xpath = "//*[@id=\"payload\"]")
	private WebElement payload;
	
	@FindBy(xpath = "//*[@id=\"totalweight\"]")
	private WebElement totalweight;
	
	@FindBy(xpath = "//*[@id=\"listprice\"]")
	private WebElement listprice;
	
	@FindBy(xpath = "//*[@id=\"licenseplatenumber\"]")
	private WebElement licenseplatenumber;
	
	@FindBy(xpath = "//*[@id=\"annualmileage\"]")
	private WebElement annualmileage;
		
	@FindBy(xpath = "//*[@id=\"dateofmanufacture\"]")
	private WebElement dateofmanufacture;
		
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]")
	private WebElement righthanddriveyes;
	
	@FindBy(xpath = "//*[@id=\"righthanddriveno\"]")
	private WebElement righthanddriveno;
		
	@FindBy(xpath = "//*[@id=\"nextenterinsurantdata\"]")
	private WebElement nextenterinsurantdata;
	
    protected void waitElementIsDone(WebDriver driver, WebElement element) {
    	WebDriverWait wait = new WebDriverWait(driver, 5L);
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    }
	
	public void selecaoCombo(String combo, String conteudo) {
		
		Select comboEscolhido = null;
		
        try {
            switch(combo) {
                case "make":
                	this.waitElementIsDone(driver, this.make);
                	comboEscolhido = new Select(this.make);
                    break;
                case "model":
                	this.waitElementIsDone(driver, this.model);
                	comboEscolhido = new Select(this.model);
                    break;
                case "numberofseats":
                	this.waitElementIsDone(driver, this.numberofseats);
                	comboEscolhido = new Select(this.numberofseats);
                    break;
                case "numberofseatsmotorcycle":
                	this.waitElementIsDone(driver, this.numberofseatsmotorcycle);
                	comboEscolhido = new Select(this.numberofseatsmotorcycle);
                    break;
                case "fuel":
                	this.waitElementIsDone(driver, this.fuel);
                	comboEscolhido = new Select(this.fuel);
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
                case "cylindercapacity":
                	this.waitElementIsDone(driver, this.cylindercapacity);
                	this.cylindercapacity.sendKeys(conteudo);
                    break;
                case "engineperformance":
                	this.waitElementIsDone(driver, this.engineperformance);
                	this.engineperformance.sendKeys(conteudo);
                    break;
                case "payload":
                	this.waitElementIsDone(driver, this.payload);
                	this.payload.sendKeys(conteudo);
                    break;
                case "totalweight":
                	this.waitElementIsDone(driver, this.totalweight);
                	this.totalweight.sendKeys(conteudo);
                    break;
                case "listprice":
                	this.waitElementIsDone(driver, this.listprice);
                	this.listprice.sendKeys(conteudo);
                    break;
                case "licenseplatenumber":
                	this.waitElementIsDone(driver, this.licenseplatenumber);
                	this.licenseplatenumber.sendKeys(conteudo);
                    break;
                case "annualmileage":
                	this.waitElementIsDone(driver, this.annualmileage);
                	this.annualmileage.sendKeys(conteudo);
                    break;
                default: ;
            }

        } catch (Exception e) {
            //throw new Exception(e);
        }

	}
	
	public void selecaoData(String data) {

	    //Preenche data como 09/25/2013
		
	    dateofmanufacture.sendKeys(data);
	}
	
	public void selecaoHandDrive(String tipo) {
        try {
            switch(tipo) {
                case "yes":
                	this.waitElementIsDone(driver, this.righthanddriveyes);
                	this.righthanddriveyes.click();
                    break;
                case "no":
                	this.waitElementIsDone(driver, this.righthanddriveno);
                	this.righthanddriveno.click();
                    break;    
                default: ;
            }

        } catch (Exception e) {
            //throw new Exception(e);
        }
	}
	
	public void clicarNext() {
		
		nextenterinsurantdata.click();
	}

}

