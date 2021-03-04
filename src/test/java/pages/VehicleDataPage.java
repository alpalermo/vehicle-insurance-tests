package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.Browser;

public class VehicleDataPage extends BasePage {
	
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
		
	@FindBy(xpath = "//*[@id=\"righthanddriveyes\"]")
	private WebElement righthanddriveyes;
	
	@FindBy(xpath = "//*[@id=\"righthanddriveno\"]")
	private WebElement righthanddriveno;
		
	@FindBy(xpath = "//*[@id=\"nextenterinsurantdata\"]")
	private WebElement nextenterinsurantdata;

	
	public void selecaoCombo(String combo, String conteudo) {
		
		Select comboEscolhido = null;
		
        try {
            switch(combo) {
                case "make":
                	this.waitElementIsDone(Browser.getWebDriver(), this.make);
                	comboEscolhido = new Select(this.make);
                    break;
                case "model":
                	this.waitElementIsDone(Browser.getWebDriver(), this.model);
                	comboEscolhido = new Select(this.model);
                    break;
                case "numberofseats":
                	this.waitElementIsDone(Browser.getWebDriver(), this.numberofseats);
                	comboEscolhido = new Select(this.numberofseats);
                    break;
                case "numberofseatsmotorcycle":
                	this.waitElementIsDone(Browser.getWebDriver(), this.numberofseatsmotorcycle);
                	comboEscolhido = new Select(this.numberofseatsmotorcycle);
                    break;
                case "fuel":
                	this.waitElementIsDone(Browser.getWebDriver(), this.fuel);
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
		
		WebElement elemento;
		
        try {
            switch(campo) {
                case "cylindercapacity":
                	this.waitElementIsDone(Browser.getWebDriver(), this.cylindercapacity);
                	this.cylindercapacity.sendKeys(conteudo);
                    break;
                case "engineperformance":
                	this.waitElementIsDone(Browser.getWebDriver(), this.engineperformance);
                	this.engineperformance.sendKeys(conteudo);
                    break;
                case "payload":
                	this.waitElementIsDone(Browser.getWebDriver(), this.payload);
                	this.payload.sendKeys(conteudo);
                    break;
                case "totalweight":
                	this.waitElementIsDone(Browser.getWebDriver(), this.totalweight);
                	this.totalweight.sendKeys(conteudo);
                    break;
                case "listprice":
                	this.waitElementIsDone(Browser.getWebDriver(), this.listprice);
                	this.listprice.sendKeys(conteudo);
                    break;
                case "licenseplatenumber":
                	this.waitElementIsDone(Browser.getWebDriver(), this.licenseplatenumber);
                	this.licenseplatenumber.sendKeys(conteudo);
                    break;
                case "annualmileage":
                	this.waitElementIsDone(Browser.getWebDriver(), this.annualmileage);
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
                	this.waitElementIsDone(Browser.getWebDriver(), this.righthanddriveyes);
                	this.righthanddriveyes.click();
                    break;
                case "no":
                	this.waitElementIsDone(Browser.getWebDriver(), this.righthanddriveno);
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

