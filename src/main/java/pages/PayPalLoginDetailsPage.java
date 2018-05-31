package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PayPalLoginDetailsPage extends ProjectMethods {
	
	public PayPalLoginDetailsPage()
	{
PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using ="paypalAccountData_firstName")
	WebElement fName;
	
	public PayPalLoginDetailsPage enterFirstName()
	{
		type(fName, "Gunjan");
		return this;
	}
	@FindBy(how=How.ID, using ="paypalAccountData_lastName")
	WebElement lName;
	
	public PayPalLoginDetailsPage enterLastName()
	{
		type(lName, "Prakash");
		return this;
	}
	
	@FindBy(how=How.ID, using ="paypalAccountData_email")
	WebElement email;
	
	public PayPalLoginDetailsPage enterEmail()
	{
		type(email, "gunjanprakash19@gmail.com");
		return this;
	}
	
	@FindBy(how=How.ID, using ="paypalAccountData_password")
	WebElement passwd;
	
	public PayPalLoginDetailsPage enterpasswd()
	{
		type(passwd, "Paypal@1901");
		return this;
	}
	
	@FindBy(how=How.ID, using ="paypalAccountData_confirmPassword")
	WebElement passwd1;
	
	public PayPalLoginDetailsPage enterpasswd1()
	{
		type(passwd1, "Paypal@1901");
		return this;
	}
	
	@FindBy(how=How.ID, using ="/appData/action")
	WebElement submit;
	
	public PayPalLoginDetailsPage clickSubmit()
	{
		click(submit);
		return this;
	}
}
