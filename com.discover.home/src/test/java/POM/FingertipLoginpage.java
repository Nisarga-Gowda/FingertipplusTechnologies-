package POM;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import discoverDollors.discoverDollor_pages.BaseTest;



public class FingertipLoginpage extends BaseTest {
	@FindBy(id="username") private WebElement username;
	@FindBy(id="password") private WebElement password;
	@FindBy(id="Login") private WebElement login;
//	@FindBy(xpath="(//span[@class='slds-truncate' and .='Objectives'])[1]") private WebElement objective;
	@FindBy(xpath="//a[@title='Objectives']") private WebElement objective;
	
	@FindBy(xpath="//button[@type='button' and .='New Objective']") private WebElement newObjective;
	
//	@FindBy(xpath="//input[@id='9272:0']") private WebElement objectiveName;
	@FindBy(xpath="(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]") private WebElement objectiveName;
	
	//@FindBy(id="9287:0") private WebElement objStatus;
	@FindBy(id="8091:0") private WebElement objStatus;
	
	//@FindBy(xpath="//input[@id='9325:0']") private WebElement objInitialValue;
	//input[@name='Channel_Name']
	@FindBy(xpath="(//input[@class='slds-input input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[1]") private WebElement objInitialValue;
	
	
	
	//@FindBy(xpath="//input[@id='9341:0']") private WebElement objTargetValue;
	@FindBy(xpath="//input[@class='slds-input input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input']") private WebElement objTargetValue;
	//@FindBy(xpath="//input[@id='input-998']") private WebElement objStartDate;
	@FindBy(xpath="//input[@name='input5']") private WebElement objStartDate;
	//@FindBy(xpath="//input[@id='input-1001']") private WebElement objEndDate;
	@FindBy(xpath="//input[@name='Due Date']") private WebElement objEndDate;
	
	@FindBy(xpath="//button[.='Save']") private WebElement objsave;
	
	
	
	
	
	@FindBy(xpath="//button[@class='slds-button slds-button_neutral button_with_icon' and .='New']") private WebElement newChannel;
	@FindBy(xpath="//input[@name='Channel_Name']") private WebElement channelName;
	@FindBy(xpath="//input[@placeholder='Topic Name']") private WebElement topicName;
	@FindBy(xpath="(//span[@class='ft-add-pill-btn '])[1]") private WebElement topicnameclick;
	@FindBy(xpath="(//span[@class='ft-add-pill-btn '])[2]") private WebElement Taxonomynameclcik;
	@FindBy(xpath="//input[@placeholder='Taxonomy Name']") private WebElement TaxonomyName;
	
	@FindBy(xpath="//button[.='Save']") private WebElement SaveChannel;
	
	
	public void CreatingChannelwithTaxandtopic(String channelname,String topicname,String Taxonomyname) throws Throwable
	
	{
		Thread.sleep(20000);
		newChannel.click();
		channelName.sendKeys(channelname);
		topicnameclick.click();
		topicName.sendKeys(topicname);
		Taxonomynameclcik.click();
		TaxonomyName.sendKeys(Taxonomyname);
		SaveChannel.click();
		
		
	}
	//@FindBy(xpath="//li[@class='slds-m-bottom--x-small' and @data-name='Automation Test']") private List<WebElement> ListOfSearch;
	@FindBy(xpath="//li[@class='slds-m-bottom--x-small']") private List<WebElement> ListOfSearch ;
	@FindBy(xpath="(//span[.='Test Automation']/../../../..)[1]") private WebElement ListOfChannel ;
	@FindBy(xpath="//input[@placeholder='Search Item']") private WebElement ChannelSearch;	
	@FindBy(xpath="//button[@name='New_Item']") private WebElement ChannelnewItemTab;	
	@FindBy(xpath="//h2[@class='slds-m-top--x-small' and .='New Decision']") private WebElement ChannelnewDecision;	
	
	@FindBy(xpath="//button[@class='slds-button slds-button--neutral slds-button--brand' and .='Continue']") private WebElement  ChannelNewItemContinue;	
	@FindBy(xpath="//h2[@class=\"slds-m-top--x-small\" and .='New Plan']") private WebElement ChannelnewPlan;	
	@FindBy(xpath="//h2[@class='slds-m-top--x-small' and .='New Objective']") private WebElement ChannelnewObjective;	
	@FindBy(xpath="//h2[@class='slds-m-top--x-small' and .='New Task']") private WebElement ChannelnewTask;
	@FindBy(xpath="//h2[ @class='slds-text-heading--medium']") private WebElement verifywithoutTaxandTopic;
	@FindBy(xpath="//h2[@class='slds-text-heading--medium' and .='New Item']") private WebElement verifyPlanpopup;
	@FindBy(xpath="//h2[@class='slds-text-heading--medium' and .='New Task']") private WebElement verifyTaskpopup;
	public WebElement getverifyTaskpopup()
	{
		return  verifyTaskpopup;
	}
	
	@FindBy(xpath="//h2[@class='slds-text-heading--medium modal_header_text']") private WebElement verifyDecisionpopup;
	public WebElement getverifyDecisionpopup()
	{
		return  verifyDecisionpopup;
	}
	@FindBy(xpath="//h2[@class='slds-m-top--x-small' and .='New Objective']") private WebElement verifyobjectivepopup;
	public WebElement getverifyobjectivepopup()
	{
		return  verifyobjectivepopup;
	}
	
	public WebElement getverifyPlanpopup()
	{
		return  verifyPlanpopup;
	}
	@FindBy(xpath="//button[@class='slds-button slds-button_neutral slds-button slds-button--neutral refresh-btn ']") private WebElement channelRefresh;
	@FindBy(xpath="(//div[@class='slds-dropdown-trigger slds-dropdown-trigger_click slds-button_last'])[1]") private WebElement channelSort;
	@FindBy(xpath="//li[@class='slds-dropdown__item']") private List<WebElement> channelSortAllItems;
	@FindBy(xpath="//div[@class='scrollable channel-details-block uiScrollerWrapper']") private WebElement channelSortVerification;
	@FindBy(xpath="(//button[@class='slds-button slds-button_icon slds-button_icon-small slds-button_icon-border-filled'])[5]") private WebElement channelPin;
	@FindBy(xpath="//div[@class='slds-dropdown-trigger slds-dropdown-trigger_click slds-m-left--xx-small']") private WebElement channelSetting;
	
	@FindBy(xpath="//span[.='Edit Channel' and @class='slds-truncate']") private WebElement channelEdit;
	@FindBy(xpath="//button[@class='slds-button mb-btn--small']") private WebElement channelEditchannelIcon;
	@FindBy(xpath="//div[.='Answer Public' and @class='slds-media__body']") private WebElement channelChangeIcon;
	@FindBy(xpath="//button[@class='slds-button slds-button--neutral slds-button--brand' and .='Update']") private WebElement channelEditUpdate;
	
	@FindBy(xpath="//button[@class='slds-button slds-button--neutral slds-button--brand' and .='Delete']") private WebElement channelDeleteUpdate;
	public WebElement getchannelDeleteUpdate()
	{
		return channelDeleteUpdate;
	}
	
	public void clickchannelDeleteUpdate() 
	{
		channelDeleteUpdate.click();
	}
	
	public WebElement getchannelEditUpdate()
	{
		return channelEditUpdate;
	}
	
	public void clickchannelEditUpdate() 
	{
		channelEditUpdate.click();
	}
	public WebElement getchannelChangeIcon()
	{
		return channelChangeIcon;
	}
	
	public void clickchannelChangeIcon() 
	{
		channelChangeIcon.click();
	}
	
	public WebElement getchannelEditchannelIcon()
	{
		return channelEditchannelIcon;
	}
	
	public void clickchannelEditchannelIcon() throws Throwable
	{
		channelEditchannelIcon.click();
		Thread.sleep(5000);
		channelEditchannelIcon.sendKeys(Keys.DOWN);
		channelEditchannelIcon.sendKeys(Keys.DOWN);
		channelEditchannelIcon.sendKeys(Keys.DOWN);
		channelEditchannelIcon.sendKeys(Keys.ENTER);
		
	}
	
	public WebElement getchannelEdit()
	{
		return channelEdit;
	}
	
	public void clickchannelEdit()
	{
		channelEdit.click();
		
	}
	@FindBy(xpath="//span[.='Delete Channel' and @class='slds-truncate']") private WebElement channelDeleteChannel;
	public WebElement getchannelDeleteChannel()
	{
		return channelDeleteChannel;
	}
	
	public void clickchannelDeleteChannel()
	{
		channelDeleteChannel.click();
		
	}
	public WebElement getchannelSetting()
	{
		return channelSetting;
	}
	
	public void clickchannelSetting()
	{
		channelSetting.click();
		
	}
	public WebElement getchannelPin()
	{
		return  channelPin;
	}
	
	public void clickchannelPin()
	{
		channelPin.click();
		
	}

	public WebElement getchannelSortVerification()
	{
		return  channelSortVerification;
	}
	
	
	public WebElement getchannelSort()
	{
		return  channelSort;
	}
	
	public void clickchannelSort()
	{
		channelSort.click();
		
	}

	public List<WebElement> getchannelSortAllItems()
	{
		return  channelSortAllItems;
	}
	
	public void clickchannelSortAllItems() 
	{
		
			channelSortAllItems.get(1).click();		
		
	}
	public void ClickoneAfteranother() throws Throwable
	{
		channelSort.click();
		channelSortAllItems.get(0).click();
		Thread.sleep(25000);
		channelSort.click();
		channelSortAllItems.get(1).click();
		Thread.sleep(25000);
		channelSort.click();
		channelSortAllItems.get(2).click();
		Thread.sleep(25000);
		channelSort.click();
		channelSortAllItems.get(3).click();
		Thread.sleep(25000);
		channelSort.click();
		channelSortAllItems.get(4).click();
		Thread.sleep(25000);
	}
	
	
	
	public WebElement getchannelRefresh()
	{
		return  channelRefresh;
	}
	
	public void clickchannelRefresh()
	{
		channelRefresh.click();
	}
	public WebElement getverifywithoutTaxandTopic()
	{
		return  verifywithoutTaxandTopic;
	}
	
	public WebElement getChannelnewTask()
	{
		return  ChannelnewTask;
	}
	public void clickChannelnewTask()
	{
		ChannelnewTask.click();
		
	}
	
	public WebElement getChannelnewObjective()
	{
		return  ChannelnewObjective;
	}
	public void clickChannelnewObjective()
	{
		ChannelnewObjective.click();
		
	}
	public WebElement getChannelnewPlan()
	{
		return  ChannelnewPlan;
	}
	public void clickChannelnewPlan()
	{
		 ChannelnewPlan.click();
		
	}
	public WebElement getChannelNewItemContinue()
	{
		return  ChannelNewItemContinue;
	}
	public void clickChannelNewItemContinue()
	{
		 ChannelNewItemContinue.click();
		
	}
	
	public WebElement getChannelnewDecision()
	{
		return ChannelnewDecision;
	}
	public void clickChannelnewDecision()
	{
		ChannelnewDecision.click();
		
	}
	
	public WebElement getChannelnewItemTab()
	{
		return ChannelnewItemTab;
	}
	public void clickChannelnewItemTab()
	{
		ChannelnewItemTab.click();
		
	}
	
	public WebElement getListOfChannel()
	{
		return ListOfChannel;
	}
	public void clickListOfChannel()
	{
		ListOfChannel.click();
		
	}
	public WebElement getChannelSearch()
	{
		return ChannelSearch;
	}
	public void clickChannelSearch(String value)
	{
		ChannelSearch.sendKeys(value);
		
	}
	public List<WebElement> getListOfSearch()
	{
		return ListOfSearch;
	}
	public void setListOfSearch()
	{	
		ListOfSearch.get(0).click();
		 
		//ListOfChannels.get(ListOfChannels.size()-1).click();
	}
	
	
	
	
	public WebElement getTaxonomyName()
	{
		return TaxonomyName;
	}
	public void setTaxonomyName(String value) throws Throwable
	{
		TaxonomyName.sendKeys(value);
		Thread.sleep(5000);
		TaxonomyName.sendKeys(Keys.ENTER);

	}
	
	public WebElement getSaveChannel()
	{
		return SaveChannel;
	}
	public void clickSaveChannel()
	{
		SaveChannel.click();

	}
	public WebElement gettopicnameclick()
	{
		return topicnameclick;
	}
	public void clicktopicnameclick()
	{
		topicnameclick.click();

	}
	public WebElement getTaxonomynameclcik()
	{
		return Taxonomynameclcik;
	}
	public void setTaxonomynameclcik()
	{
		Taxonomynameclcik.click();

	}
	
	public WebElement gettopicName()
	{
		return topicName;
	}
	public void settopicName(String value) throws Throwable
	{
		topicName.sendKeys(value);
		Thread.sleep(5000);
		topicName.sendKeys(Keys.ENTER);

	}
	
	
	public WebElement getchannelName()
	{
		return channelName;
	}
	public void setchannelName(String value)
	{
		channelName.sendKeys(value);

	}
	
	public WebElement getnewChannel()
	{
		return  newChannel;
	}
	public void clicknewChannel()
	{
		newChannel.click();

	}
	
	public WebElement getobjsave()
	{
		return  objsave;
	}
	public void clickobjsave()
	{
		objsave.click();

	}
	
	public WebElement getobjStartDate()
	{
		return objStartDate;
	}
	public void setobjStartDate(String value)
	{
		objStartDate.sendKeys(value);

	}
	public WebElement getobjEndDate()
	{
		return objEndDate;
	}
	public void setobjEndDate(String value)
	{
		objEndDate.sendKeys(value);

	}
	public WebElement getobjTargetValue()
	{
		return objTargetValue;
	}
	public void setobjTargetValue(String value)
	{
		objTargetValue.sendKeys(value);

	}
	public WebElement getobjInitialValue()
	{
		return objInitialValue;
	}
	public void setobjInitialValue(String value)
	{
		objInitialValue.sendKeys(value);

	}
	public WebElement getobjStatus()
	{
		return objStatus;
	}
	public void setobjStatus()
	{
		objStatus.click();

	}
	public WebElement getobjectiveName()
	{
		return objectiveName;
	}
	public void setobjectiveName(String un)
	{
		objectiveName.sendKeys(un);

	}
	 public WebElement getnewObjective()
		{
			return  newObjective;
		}
		public void clicknewObjective()
		{
			 newObjective.click();

		}
	
	public WebElement getusername()
	{
		return username;
	}
	public void setusername(String un)
	{
		username.sendKeys(un);

	}
	public WebElement getpassword()
	{

	return password;

	}
	public void setpassword(String pw)
	{

		password.sendKeys(pw);

	}
	public WebElement getlogin()
	{
	return login;


	}
	public void clicklogin()
	{
		login.click();

	}
	public void login(String un,String pwd)
	{
		username.sendKeys(un);

		password.sendKeys(pwd);

		login.click();

	}
	
	public WebElement getObjective()
	{
	return objective;


	}
	public void clickObjective()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",objective);
		  Actions hover = new Actions(driver);
		  hover.moveToElement(objective).click().build().perform();
		 

	}
	

	public void creatingObject(String ObjectiveName ,String IntialValue,String TargetValue,String StartDate,String EndDate)
	{
		objectiveName.sendKeys(ObjectiveName);
		objInitialValue.sendKeys(IntialValue);
		objTargetValue.sendKeys(TargetValue);
		
		objStartDate.sendKeys(StartDate);
		objEndDate.sendKeys(EndDate);
		objsave.click();
	}
	
public void CreatingChannelwithTaxandtopic1(String channelname,String topicname,String Taxonomyname) throws Throwable
	
	{
		Thread.sleep(20000);
		newChannel.click();
		channelName.sendKeys(channelname);
		topicnameclick.click();
		topicName.sendKeys(topicname);
		Taxonomynameclcik.click();
		TaxonomyName.sendKeys(Taxonomyname);
		SaveChannel.click();
	}
		

public FingertipLoginpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}