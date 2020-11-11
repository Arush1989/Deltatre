package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class AutoQuotePage extends TestBase {

	/* Locating Web Elements */
	@FindBy(css = "[name='autoquote:zipcode']")
	WebElement zipCodeField;

	@FindBy(css = "[name='autoquote:e-mail']")
	WebElement emailField;

	@FindBy(css = "[name='autoquote:vehicle'][value='car']")
	WebElement automobileType_Car;

	@FindBy(css = "[name='autoquote:age']")
	WebElement ageField;

	@FindBy(css = "[value='Male']")
	WebElement gender_Male;

	@FindBy(css = "[value='Good']")
	WebElement drivingRecord_Good;

	@FindBy(css = "[name='autoquote:year']")
	WebElement yearField;

	@FindBy(css = "#ext-gen4")
	WebElement autoMakeDropDownButton;

	@FindBy(css = "#ext-gen8")
	WebElement autoMakeList;

	@FindBy(css = "#ext-gen6")
	WebElement autoModelDropDownButton;

	@FindBy(css = "#ext-gen12")
	WebElement autoModelList;
	
	@FindBy(css = "[value='Finance']")
	WebElement financialInfo_Financed;

	@FindBy(css = "[name='autoquote:next']")
	WebElement nextButton;
	
	@FindBy(css = "[name='quote-result:purchase-quote']")
	WebElement purchaseButton;

	/* Initializing Web Elements */
	public AutoQuotePage() {
		PageFactory.initElements(driver, this);
	}

	/* Performing actions on web elements */

	public void enterZipAndEmail() {
		zipCodeField.sendKeys(prop.getProperty("zip"));
		emailField.sendKeys(prop.getProperty("email"));
	}

	public void selectAutomobileType() {
		automobileType_Car.click();
	}

	public void enterAge() {
		ageField.clear();
		ageField.sendKeys(prop.getProperty("age"));
	}

	public void selectGenderMale() {
		gender_Male.click();
	}

	public void selectDrivingRecordGood() {
		drivingRecord_Good.click();
	}

	public void enterYear() {
		yearField.clear();
		yearField.sendKeys(prop.getProperty("year"));
	}

	public void clickNext() {
		nextButton.click();
	}

	public void selectAutoMake() {
		autoMakeDropDownButton.click();
		List<WebElement> allOptions = autoMakeList.findElements(By.cssSelector("#ext-gen8 .x-combo-list-item"));

		java.util.Iterator<WebElement> i = allOptions.iterator();
		while (i.hasNext()) {
			WebElement ele = i.next();
			if (ele.getText().equals(prop.getProperty("make"))) {
				ele.click();
			}
		}
	}

	
	public void selectAutoModel() {
		autoModelDropDownButton.click();
		List<WebElement> allOptions = autoModelList.findElements(By.cssSelector("#ext-gen12 .x-combo-list-item"));

		java.util.Iterator<WebElement> j = allOptions.iterator();
		while (j.hasNext()) {
			WebElement ele1 = j.next();
			if (ele1.getText().equals(prop.getProperty("model"))) {
				ele1.click();
			}
		}
	}
	
	public void selectFinancialInfo() {
		financialInfo_Financed.click();
	}
	
	public void clickPurchase() {
		purchaseButton.click();
	}

	public void fillAutoQuoteDetails() throws InterruptedException {
		enterZipAndEmail();
		selectAutomobileType();
		clickNext();
		enterAge();
		selectGenderMale();
		selectDrivingRecordGood();
		clickNext();
		enterYear();
		selectAutoMake();
		Thread.sleep(2000);
		selectAutoModel();
		Thread.sleep(2000);
		selectFinancialInfo();
		clickNext();
		clickPurchase();
	}

}
