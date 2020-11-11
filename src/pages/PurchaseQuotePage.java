package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class PurchaseQuotePage extends TestBase {
	
	/* Locating Web Elements */
	@FindBy(css = "[name='purchaseQuote:cardnumber']")
	WebElement creditCardNumField;
	
	@FindBy(css = "[name='purchaseQuote:expiration']")
	WebElement creditCardExpDate;
	
	@FindBy(css = "[name='purchaseQuote:purchase']")
	WebElement purchaseButton;
	
	@FindBy(css = "#content-main h1")
	WebElement purchaseConfirmation;
	
	/* Initializing Web Elements */
	public PurchaseQuotePage() {
		PageFactory.initElements(driver, this);
	}
	
	/* Performing actions on web elements */
	public void enterCreditCardInfo() {
		creditCardNumField.sendKeys(prop.getProperty("credit_card_number"));
		creditCardExpDate.sendKeys(prop.getProperty("credit_card_expiry"));
	}
	
	public void purchaseQuote() {
		enterCreditCardInfo();
		purchaseButton.click();
	}
	
	public boolean isPurchaseConfirmationPresent() {
		try {
			purchaseConfirmation.isDisplayed();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public String getConfirmationText() {
		return purchaseConfirmation.getText();
	}

}
