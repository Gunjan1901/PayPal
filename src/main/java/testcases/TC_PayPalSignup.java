package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PayPalSignupPage;
import wdMethods.ProjectMethods;

public class TC_PayPalSignup extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC_PayPalSignup";
		testDescription="Signing up on Paypal";
		testNodes="Leads";
		category="Functional";
		authors="Gunjan";
		browserName="chrome";
		//dataSheetName="TC010";
	}

	//@Test(dataProvider="fetchData")
	@Test
	public void signup()
	{
		
		new PayPalSignupPage()
		.clickSignup()
		.clickNext()
		.countryValue()
		.enterFirstName()
		.enterLastName()
		.enterEmail()
		.enterpasswd()
		.enterpasswd1()
		.clickSubmit();
	}
}

