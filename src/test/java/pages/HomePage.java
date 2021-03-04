package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.Browser;

public class HomePage extends BasePage {
	
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
	
	public void selecaoCombo(String combo, String conteudo) {
		
		Select comboMake;
		
        try {
            switch(combo) {
                case "make":
                	this.waitElementIsDone(Browser.getWebDriver(), this.make);
                    break;
                case "model":
                	this.waitElementIsDone(Browser.getWebDriver(), this.model);
                    break;
                case "numberofseats":
                	this.waitElementIsDone(Browser.getWebDriver(), this.numberofseats);
                    break;
                case "numberofseatsmotorcycle":
                	this.waitElementIsDone(Browser.getWebDriver(), this.numberofseatsmotorcycle);
                    break;
                case "fuel":
                	this.waitElementIsDone(Browser.getWebDriver(), this.fuel);
                    break;
                default: ;
            }
    		comboMake = new Select(Browser.getWebDriver().findElement(By.id(combo)));
    		comboMake.selectByVisibleText(conteudo);
        } catch (Exception e) {
            //throw new Exception(e);
        }

		//comboMake.selectByVisibleText(nome);
	}

	/*public void moveMouseToUser() {
		this.waitElementIsDone(Browser.getWebDriver(), this.circleName);
		Actions action = new Actions(Browser.getWebDriver());
		action.moveToElement(this.circleName).perform();
	}*/

}

