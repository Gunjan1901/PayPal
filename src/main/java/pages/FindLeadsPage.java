package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	//public static String firstLeadId;

	public  FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using ="(//input[@name='firstName'])[3]")
	WebElement eleFirstName;

	@And("User entered First Name (.*)")
	public FindLeadsPage enterFirstName(String firstName)
	{
		type(eleFirstName, firstName);	
		return this;
	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	WebElement eleFindLdButton;

	@And("clicked on Find Leads")
	public FindLeadsPage clickFindLdButton()
	{
		click(eleFindLdButton);	
		return this;
	}

	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleFirstResultingLead;

	@And("clicked on first lead id from the Lead list displayed")
	public ViewLeadPage clickFirstResultingLead()
	{
		click(eleFirstResultingLead);
		return 	new ViewLeadPage();
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	WebElement phonetab;
	
	@And("click on phone tab")
	public FindLeadsPage clickPhoneTab()
	{
		click(phonetab);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneCountryCode']")
	WebElement phoneCountryCode;
	
	@And("user entered Country code (.*)")
	public FindLeadsPage enterPhoneCountryCode(String phoneCoCode)
	{
		type(phoneCountryCode, phoneCoCode);
		return this;
	}

	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	WebElement phoneNo;
	
	@And("user entered phone no (.*)")
	public FindLeadsPage enterPhoneNo(String phNo)
	{
		type(phoneNo, phNo);
	return this;	
	}
	
	/*@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleFirstResultingLeadId;*/
	
	@And("saved the lead Id of the first resulting lead from the Lead List displayed")
	public FindLeadsPage getTextFirstLead()
	{
	 firstLeadId = getText(eleFirstResultingLead);
	 System.out.println("FirstLeadid: " + firstLeadId);
	 return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	WebElement idField;
	
	@When("user entered the saved lead id in Lead id field(.*)")
	public FindLeadsPage enterLeadId(String fleadId)
	{
		fleadId=firstLeadId;
		type(idField,fleadId);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	WebElement elemsg;
	
	@Then("ErrorMessage is displayed")
	public FindLeadsPage verifyErrormsgText()
	{
		verifyExactText(elemsg, "No records to display");
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	WebElement eleEmail;
	
	public FindLeadsPage clickEmail()
	{
		click(eleEmail);
		return this;
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	WebElement eleMailBox;

	public FindLeadsPage enterEmail()
	{
		type(eleMailBox,"gunjanprakash19@gmail.com");
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	WebElement eleName;
	
	public FindLeadsPage getName()
	{
		 firstName = getText(eleName);
		 return this;
		}
	
	
	
	
	
	}


