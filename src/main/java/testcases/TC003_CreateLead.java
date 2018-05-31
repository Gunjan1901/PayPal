package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create a new lead";
		testNodes="Leads";
		category="Functional";
		authors="Gunjan";
		browserName="chrome";
		dataSheetName="TC003";
	}
	//@Test(dataProvider="fetchData",invocationCount=3)
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String cName, String fName, String lName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickCreateLead()
		.verifyFirstName(fName);
	}
}


