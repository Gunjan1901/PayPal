package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {

	public  EditLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	WebElement eleCompanyName;
	
	@And("entered the Company name (.*) in Company field to update new Company")
	public EditLeadPage enterCompName(String companyName)
	{
		type(eleCompanyName, companyName);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="updateLeadForm_importantNote")
	WebElement eleUpdateNoteBox;
	
	public EditLeadPage enterDataUpdateBox(String data)
	{
		type(eleUpdateNoteBox,data);
		return this;
	}
	@FindBy(how=How.XPATH, using="//input[@class='smallSubmit']")
	private WebElement eleSubmit;
	
	@When("clicked on submit button")
	public ViewLeadPage clickSubmit()
	{
		click(eleSubmit);
			return new ViewLeadPage();
		
	}

}
