package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class PayPalLoginPage extends ProjectMethods{


	public PayPalLoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.LINK_TEXT, using = "Next")
	WebElement nextLink;

	public PayPalCountryPage clickNext()
	{
		click(nextLink);
		return new PayPalCountryPage();
	}

}
