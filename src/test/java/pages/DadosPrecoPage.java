package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DadosPrecoPage {

	WebDriver driver;

    public DadosPrecoPage(WebDriver driver){
    	this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    
	@FindBy(xpath = "//*[@id=\"selectpriceoption\"]")
	private WebElement selectpriceoption;
	
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")
	private WebElement radioOption1;

	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")
	private WebElement radioOption2;

	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")
	private WebElement radioOption3;

	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")
	private WebElement radioOption4;

	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[1]/td[1]")
	private WebElement txtPricePerYear;

	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[2]/td[1]")
	private WebElement txtOnlineClaim;

	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[3]/td[1]")
	private WebElement txtClaimsDiscount;

	@FindBy(xpath = "//*[@id=\"priceTable\"]/tbody/tr[4]/td[1]")
	private WebElement txtWorldwideCover;

	@FindBy(xpath = "//*[@id=\"quote-sub-container\"]/div/div[1]/div/div[2]")
	private WebElement viewQuote;

	@FindBy(xpath = "//*[@id=\"quote-sub-container\"]/div/div[2]/div/div[2]")
	private WebElement downloadQuote;

	@FindBy(xpath = "//*[@id=\"nextsendquote\"]")
	private WebElement btnNextsendquote;
	
    protected void waitElementIsDone(WebDriver driver, WebElement element) {
    	WebDriverWait wait = new WebDriverWait(driver, 5L);
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    }
		
	public void selecaoPriceOption(String tipo) {
		try {
			switch(tipo) {
				case "Silver":
					this.waitElementIsDone(driver, this.radioOption1);
					this.radioOption1.click();
					break;
				case "Gold":
					this.waitElementIsDone(driver, this.radioOption2);
					this.radioOption2.click();
					break;
				case "Platinum":
					this.waitElementIsDone(driver, this.radioOption3);
					this.radioOption3.click();
					break;
				case "Ultimate":
					this.waitElementIsDone(driver, this.radioOption4);
					this.radioOption4.click();
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
				case "Price Per Year":
					this.waitElementIsDone(driver, this.txtPricePerYear);
					Assert.assertEquals(texto, txtPricePerYear.getText());
					break;
				case "Online Claim":
					this.waitElementIsDone(driver, this.txtOnlineClaim);
					Assert.assertEquals(texto, txtOnlineClaim.getText());
					break;
				case "Claims Discount":
					this.waitElementIsDone(driver, this.txtClaimsDiscount);
					Assert.assertEquals(texto, txtClaimsDiscount.getText());
					break;
				case "Worldwide Cover":
					this.waitElementIsDone(driver, this.txtWorldwideCover);
					Assert.assertEquals(texto, txtWorldwideCover.getText());
					break;
				case "View Quote":
					this.waitElementIsDone(driver, this.viewQuote);
					Assert.assertEquals(texto, viewQuote.getText());
					break;
				case "Download Quote":
					this.waitElementIsDone(driver, this.downloadQuote);
					Assert.assertEquals(texto, downloadQuote.getText());
					break;
				case "Select Price Option":
					this.waitElementIsDone(driver, this.selectpriceoption);
					Assert.assertTrue(selectpriceoption.getText().contains(texto));
					break;
					
				default: ;
			}

		} catch (Exception e) {
			//throw new Exception(e);
		}
	}

	public void clicarNext() {
		btnNextsendquote.click();
	}

}

