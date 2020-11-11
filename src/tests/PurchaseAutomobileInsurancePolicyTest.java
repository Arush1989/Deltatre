package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AutoQuotePage;
import pages.HomePage;
import pages.PurchaseQuotePage;
import utils.TestUtil;

/***  This is an end to end test to validate the successful purchase of an automobile insurance policy   ****/

public class PurchaseAutomobileInsurancePolicyTest  extends TestBase {
	
	HomePage homePage;
	AutoQuotePage autoQuotePage;
	PurchaseQuotePage purchaseQuotePage;
	
	TestUtil util = new TestUtil();
	
	@BeforeClass
	public void beforeTest() throws InterruptedException {
		initialize();   //Method to launch the browser
		openHomePage();
		
		homePage = new HomePage();
		autoQuotePage = new AutoQuotePage();
		purchaseQuotePage = new PurchaseQuotePage();
	}

	@Test
	public void verifyUserCanGetQuoteForFullProductProtection() throws InterruptedException {
		homePage.loginUser();
		homePage.selectService();
		autoQuotePage.fillAutoQuoteDetails();
		purchaseQuotePage.purchaseQuote();
		Assert.assertTrue(purchaseQuotePage.isPurchaseConfirmationPresent());
		Assert.assertEquals(purchaseQuotePage.getConfirmationText(), "Congratulations!");
	}

	@AfterClass
	public void tearDown() throws IOException {
		util.takeScreenshotAtEndOfTest();
		driver.quit();
	}

}
