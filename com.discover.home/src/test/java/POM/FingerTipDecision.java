package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import discoverDollors.discoverDollor_pages.BaseTest;

public class FingerTipDecision extends BaseTest{
	@FindBy(xpath ="//div[@class='slds-context-bar__label-action slds-p-left--none']/../../a/span[text()='Decisions']") private WebElement decision;
	public WebElement getdecision()
	{
		return decision;
	}
	public void clickdecision()
	{
	
			  JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",decision);
				  Actions hover = new Actions(driver);
				  hover.moveToElement(decision).click().build().perform();

	}
	@FindBy(xpath ="//button[.='New Decision']") private WebElement newDecision;	
	
	public WebElement getnewDecision()
	{
		return newDecision;
	}
	public void clicknewDecision()
	{
		newDecision.click();
}

@FindBy(xpath ="//button[@class='slds-button slds-button--neutral slds-button--brand']") private WebElement DecisionContinue;	

public WebElement getDecisionContinue()
{
	return DecisionContinue;
}
public void clickDecisionContinue()
{
	DecisionContinue.click();
}

@FindBy(xpath ="//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input']") private WebElement DecisionTitle;	

public WebElement getDecisionTitle()
{
	return DecisionTitle;
}
public void clickDecisionTitle(String value)
{
	DecisionTitle.sendKeys(value);
}

@FindBy(xpath ="//textarea[@placeholder='Explain the actual decision to be made or proposed.']") private WebElement Decisionpraposal;	
public WebElement getDecisionpraposal()
{
	return Decisionpraposal;
}
public void clickDecisionpraposal(String value)
{
	Decisionpraposal.sendKeys(value);
}
@FindBy(xpath ="//textarea[@placeholder='Describe the inspiring problem or idea of the decision to start the collaboration and involve people.']") private WebElement DecisionDescription;

public WebElement getDecisionDescription()
{
	return DecisionDescription;
}
public void clickDecisionDescription(String value)
{
	DecisionDescription.sendKeys(value);
}
@FindBy(xpath ="//a[.='People']") private WebElement DecisionPeople;	

public WebElement getDecisionPeople()
{
	return DecisionPeople;
}
public void clickDecisionPeople()
{
	DecisionPeople.click();
}

@FindBy(xpath ="//button[@title='Share' and @class='slds-button slds-button--neutral slds-button slds-button--neutral slds-button--brand uiButton']") private WebElement DecisionShare;	

public WebElement getDecisionShare()
{
	return DecisionShare;
}
public void clickDecisionShare()
{
	DecisionShare.click();
}

@FindBy(xpath ="//title[.='Automation Test | Salesforce']") private WebElement Decisionverify;	

public WebElement getDecisionverify()
{
	return Decisionverify;
}
public void clickDecisionverify()
{
	Decisionverify.click();
}

@FindBy(xpath ="(//button[@class='slds-button slds-button--icon-border-filled slds-button--icon-small ft-ie-plus-icon'])[4]") private WebElement DecisionTaxonomy;	
public WebElement getDecisionTaxonomy()
{
	return DecisionTaxonomy;
}
public void clickDecisionTaxonomy(String value) throws Throwable
{
	DecisionTaxonomy.sendKeys(value);
	Thread.sleep(5000);
	DecisionTaxonomy.sendKeys(Keys.ENTER);
}
@FindBy(xpath ="//a[@class='slds-path__link  ft-link cFT_LifecycleStep' and .='Propose']") private WebElement DecisionPrapose;	
public WebElement getDecisionPrapose()
{
	return DecisionPrapose;
}
public void clickDecisionPrapose()
{
	DecisionPrapose.click();
	
}

@FindBy(xpath ="//textarea[@class='k-textbox textarea uiInput uiInputTextArea uiInput--default uiInput--textarea']") private WebElement DecisionPraposepopup;	
public WebElement getDecisionPraposepopup()
{
	return DecisionPraposepopup;
}
public void clickDecisionPraposepopup(String value)
{
	DecisionPraposepopup.sendKeys(value);
}

		@FindBy(xpath ="(//span[@class=\"slds-checkbox--faux\"])[1]") private WebElement DecisionPraposepopupcheckbox;	
		public WebElement getDecisionPraposepopupcheckbox()
		{
			return DecisionPraposepopupcheckbox;
		}
		public void clickDecisionPraposepopupcheckbox()
		{
			DecisionPraposepopupcheckbox.click();
			
		}
	
		@FindBy(xpath ="//button[.='Propose']") private WebElement DecisionPraposesave;	
		public WebElement getDecisionPraposesave()
		{
			return DecisionPraposesave;
		}
		public void clickDecisionPraposesave()
		{
			DecisionPraposesave.click();
			
		}
		@FindBy(xpath ="//a[@class='slds-path__link  ft-link cFT_LifecycleStep' and .='Decide']") private WebElement DecisionDecidePhase;	
		public WebElement getDecisionDecidePhase()
		{
			return DecisionDecidePhase;
		}
		public void clickDecisionDecidePhase()
		{
			DecisionDecidePhase.click();
			
		}
	
		@FindBy(xpath ="	//button[@class='slds-button slds-button--neutral slds-button--brand approve_btn' and .='Approve']") private WebElement DecisionApproval;	
		public WebElement getDecisionApproval()
		{
			return DecisionApproval;
		}
		public void clickDecisionApproval()
		{
			DecisionApproval.click();
			
		}
		
		@FindBy(xpath ="//span[@class='slds-path__title' and .='Execute']") private WebElement  DecisionexecutePhase;	
		public WebElement getDecisionexecutePhase()
		{
			return  DecisionexecutePhase;
		}
		public void clickDecisionexecutePhase()
		{
			 DecisionexecutePhase.click();
			
		}
		
		@FindBy(xpath ="//span[@class='slds-path__title' and .='Evaluate']") private WebElement  DecisionevaluatePhase;	
		public WebElement getDecisionevaluatePhase()
		{
			return   DecisionevaluatePhase;
		}
		public void clickDecisionevaluatePhase()
		{
			 DecisionevaluatePhase.click();
			
		}
		
		@FindBy(xpath ="//a[@class='slds-path__link  ft-link cFT_LifecycleStep' and .='Close']") private WebElement  DecisionclosePhase;	
		public WebElement getDecisionclosePhase()
		{
			return  DecisionclosePhase;
		}
		public void clickDecisionclosePhase()
		{
			DecisionclosePhase.click();
			
		}

		@FindBy(xpath ="//button[@class='slds-button slds-button--neutral slds-button--brand' and .='Save']") private WebElement  DecisionclosePhasesave;	
		public WebElement getDecisionclosePhasesave()
		{
			return  DecisionclosePhasesave;
		}
		public void clickDecisionclosePhasesave()
		{
			DecisionclosePhasesave.click();
			
		}
		
		@FindBy(xpath ="//a[.='Set Timing']") private WebElement DecisionsetTiming;	
		public WebElement getDecisionsetTiming()
		{
			return DecisionsetTiming;
		}
		public void clickDecisionsetTiming()
		{
			DecisionsetTiming.click();
			
		}
		
		@FindBy(xpath ="(//button[@class=\"slds-button slds-button--icon-border-filled action_btn\" and .='Action'])[2]") private WebElement DecisionActionmenu;	
		public WebElement getDecisionActionmenu()
		{
			return DecisionActionmenu;
		}
		public void clickDecisionActionmenu()
		{
			DecisionActionmenu.click();
			
		}
		
		public void DecisionCreation(String value1,String value2,String Value3) throws Throwable
		{
			DecisionTitle.sendKeys(value1);
			DecisionDescription.sendKeys(value2);
			Decisionpraposal.sendKeys(Value3);
			Thread.sleep(25000);
			DecisionPeople.click();
			Thread.sleep(25000);
			DecisionShare.click();

		}
		
	public FingerTipDecision(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
