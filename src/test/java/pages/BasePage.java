package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;

public class BasePage {
	
	Long espera = 5l;
			
    public BasePage(){
        PageFactory.initElements(Browser.getWebDriver(),this);
    }

    protected void waitElementIsDone(WebDriver driver, WebElement element) {
    	WebDriverWait wait = new WebDriverWait(driver, espera);
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
