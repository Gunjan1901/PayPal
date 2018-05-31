package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_EditLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_EditLead";
		testDescription="Edit a lead";
		testNodes="Leads";
		category="Functional";
		authors="Gunjan";
		browserName="chrome";
		dataSheetName="TC005";
	}

	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String fName, String companyName, String data) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickFindLeads()
		.enterFirstName(fName)
		.clickFindLdButton()
		.clickFirstResultingLead()
		.clickEdit()
		.enterCompName(companyName)
		.enterDataUpdateBox(data)
		.clickSubmit()
		.verifyCompanyName(companyName);
	}
}
