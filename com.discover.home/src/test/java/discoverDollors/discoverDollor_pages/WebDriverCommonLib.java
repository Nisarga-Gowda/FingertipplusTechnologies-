package discoverDollors.discoverDollor_pages;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class WebDriverCommonLib extends BaseTest{
	
	public void implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void explicitlyWait(String title)
	{
		WebDriverWait  wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.titleContains(title));
	}
	public void explicitlyWait(WebElement element)
	{
		WebDriverWait  wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(element));
	}
	public String getpagetitle()
	{
		return driver.getTitle();
	}
	public void verify(String expected,String actual,String pagename)
	{
		Assert.assertEquals(expected, actual);
		Reporter.log(pagename+" got displayed",true);
	}
	public String getPageTite()
	{
		return driver.getTitle();
	}
	public void selectOption(WebElement element,int index)
	{
		Select sc=new Select(element);
		sc.selectByIndex(index);
	}
	public void selectOption(WebElement element,String text)
	{
		Select sc=new Select(element);
		sc.selectByVisibleText(text);
	}
	public void selectOption(String value,WebElement element)
	{
		Select sc=new Select(element);
		sc.selectByValue(value);
	}
	public void mouseHover(WebElement element)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	public void verifyElement(WebElement  expected,String actual,String element)
	{
		SoftAssert s=new SoftAssert();
		s.assertEquals(actual,  expected);
		Reporter.log(element +" got displayed",true);
	}
	
		
	}


