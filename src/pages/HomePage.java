package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class HomePage extends TestBase {

	/* Locating web elements */
	@FindBy(css = "[name='login-form:email']")
	WebElement emailField;

	@FindBy(css = "[name='login-form:password']")
	WebElement passwordField;

	@FindBy(css = "[name='login-form:login']")
	WebElement loginButton;

	@FindBy(css = "[name='quick-link:jump-menu']")
	WebElement selectServiceDropdown;

	/* Initializing web elements */
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	/* Performing actions on web elements */

	public void loginUser() {
		emailField.sendKeys(prop.getProperty("email"));
		passwordField.sendKeys(prop.getProperty("password"));
		loginButton.click();
	}

	public void selectService() {
		Select services = new Select(selectServiceDropdown);
		services.selectByVisibleText(prop.getProperty("service"));
	}

}
