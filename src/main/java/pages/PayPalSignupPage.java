package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class PayPalSignupPage extends ProjectMethods {
	
	public PayPalSignupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using= "signup-button")
	public WebElement signup;
	public PayPalLoginPage clickSignup()
	{
		click(signup);
		return new PayPalLoginPage();
	}

}
