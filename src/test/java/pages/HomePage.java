package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.Browser;

public class HomePage extends BasePage {
	
	//@FindBy(id = "circulo-nome")
	@FindBy(xpath = "//*[@id=\"outros-icon-mobile\"]/svg")
	private WebElement circleName;
	
	@FindBy(xpath = "//*[@id=\"info-nome-usuario\"]/abbr")
	private WebElement userName;
	
	public String getUserName() {
		this.waitElementIsDone(Browser.getWebDriver(), this.userName);
		
		return this.userName.getText();
	}

	public void moveMouseToUser() {
		this.waitElementIsDone(Browser.getWebDriver(), this.circleName);
		Actions action = new Actions(Browser.getWebDriver());
		action.moveToElement(this.circleName).perform();
	}

}

