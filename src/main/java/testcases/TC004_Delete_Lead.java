package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_Delete_Lead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC004_DeleteLead";
		testDescription="Delete a lead";
		testNodes="Leads";
		category="Functional";
		authors="Gunjan";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void deletLead(String uname, String passwd, String phCoCode, String phNo)
	{
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(passwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickFindLeads()
		.clickPhoneTab()
		.enterPhoneCountryCode(phCoCode)
		.enterPhoneNo(phNo)
		.clickFindLdButton()
		.getTextFirstLead()
		.clickFirstResultingLead()
		.clickDelete()
		.clickFindLeads()
		.enterLeadId(firstLeadId)
		.clickFindLdButton()
		.verifyErrormsgText();
		

		
		
	}
}
