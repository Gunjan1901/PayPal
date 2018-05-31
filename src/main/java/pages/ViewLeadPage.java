package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
//import pages_BDDFramework_Cucumber.ViewLeadPage;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	WebElement eleVLFirstName;
	
	public ViewLeadPage verifyFirstName(String VLFirstName)
	{
		verifyExactText(eleVLFirstName, VLFirstName);
		return this;
	}

	@FindBy(how=How.LINK_TEXT,using="Edit")
	WebElement eleEditButton;

	@And("clicked on Edit in View Leads Page")
	public EditLeadPage clickEdit()
	{
		click(eleEditButton);
		return new EditLeadPage();
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	WebElement eleEditedComName;
	
	@Then("the lead details is updated and saved (.*)")
	public ViewLeadPage verifyCompanyName(String companyName)
	{
		verifyPartialText(eleEditedComName, companyName);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	WebElement deleteTab;
	
	@And("clicked on Delete in View Leads Page")
	public MyLeadPage clickDelete()
	{
		click(deleteTab);
		return new MyLeadPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	WebElement eledup;
	
	public DuplicateLeadPage clickDuplicateLead()
	{
		click(eledup);
		return new DuplicateLeadPage();
	}
}
