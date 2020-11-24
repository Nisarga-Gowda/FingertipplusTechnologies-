package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import discoverDollors.discoverDollor_pages.BaseTest;

public class FingerTipPlan extends BaseTest {
	
	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement planName;
	
	public WebElement getplanName()
	{
		return planName;
	}
	public void clickplanName(String value)
	{
		planName.sendKeys(value);
		
	}
	@FindBy(xpath="//textarea[@class='slds-textarea' and @placeholder='Please enter description here']") private WebElement PlanDescription;
	public WebElement getPlanDescription()
	{
		return PlanDescription;
	}
	public void clickPlanDescription(String value)
	{
		PlanDescription.sendKeys(value);
		
	}
	
	
	@FindBy(xpath="(//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right'])[1]") private WebElement PlanStartdate;
	public WebElement getPlanStartdate()
	{
		return PlanStartdate;
	}
	public void clickPlanStartdate(String value)
	{
		PlanStartdate.sendKeys(value);
		
	}
	@FindBy(xpath="//button[@class='slds-button slds-button--neutral slds-button--brand' and .='Save']") private WebElement saveTheplanPOPUP;
	public WebElement getsaveTheplanPOPUP()
	{
		return  saveTheplanPOPUP;
	}
	public void clicksaveTheplanPOPUP()
	{
		 saveTheplanPOPUP.click();
		
	}
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	@FindBy(xpath="//input[@class='slds-input' and @placeholder='Please enter plan name here']") private WebElement objTargetValue;
//	
	
	
	public void creatingPlan(String planname,String description)
	{
		planName.sendKeys(planname);
		PlanDescription.sendKeys(description);
		//PlanStartdate.sendKeys(startdate);
		saveTheplanPOPUP.click();
		
	}
	
	public FingerTipPlan(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
