package grid;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MultipleSystemRunningPractice_Chrome {

	RemoteWebDriver driver=new ChromeDriver();
	@Test
	public void ChromeGrid() throws MalformedURLException {
		// TODO Auto-generated method stub

		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL("http://10.0.0.141:4444/wd/hub"), dc);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("lst-ib").sendKeys("Sachin");
		//driver.findElementByXPath("//input[@value='Google Search']").click();
		driver.findElementByName("btnK").click();
		
		System.out.println("Grid working successfully with chrome");
		
		
	}

}
