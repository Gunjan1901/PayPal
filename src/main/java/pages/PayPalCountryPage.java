package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class PayPalCountryPage extends ProjectMethods
{

	public PayPalCountryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "country")
	WebElement country;
	
	public PayPalLoginDetailsPage countryValue()
	{
		selectDropDownUsingText(country, "Australia");
		return new PayPalLoginDetailsPage();
	}
}
