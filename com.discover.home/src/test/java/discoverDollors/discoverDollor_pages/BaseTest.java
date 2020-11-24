package discoverDollors.discoverDollor_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoconstants {
	public static WebDriver driver;
@BeforeClass
	public void openthebrowserentertheurl() throws Throwable
	{
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		
		
		FileLibrary fl=new FileLibrary();
		String browser = fl.getPropValue(Login_PROP_PATH,"browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver(c);
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("enter proper browser name");
		}
		driver.manage().window().maximize();	
		String appUrl=fl.getPropValue(Login_PROP_PATH, "url");
		driver.get(appUrl);
		//driver.get("http://test.salesforce.com/");
		
	}
	
}
