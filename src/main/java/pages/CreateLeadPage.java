package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement eleCompanyName;
	
	@When("company name is entered(.*)")
	public CreateLeadPage typeCompanyName(String comName)
	{
		type(eleCompanyName,comName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement eleFirstName;
	
	@And("first name is entered(.*)")
	public CreateLeadPage typeFirstName(String fName) {
		
		type(eleFirstName,fName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement eleLastName;
	
	@And("last name is entered(.*)")
	public CreateLeadPage typeLastName(String lName)
	{
		type(eleLastName,lName);
		return this;
		}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	WebElement eleSubmit;
	
	@And("click on Create Lead")
	public ViewLeadPage clickCreateLead()
	{
		click(eleSubmit);
		return new ViewLeadPage();
	}
	
	
}
