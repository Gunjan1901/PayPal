package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
public class TC006_DuplicateLead extends ProjectMethods {

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
	public void duplicateLead(String uname, String passwd, String phCoCode, String phNo)
	{
}
}
