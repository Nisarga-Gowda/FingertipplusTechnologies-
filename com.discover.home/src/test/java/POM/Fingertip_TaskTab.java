package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import discoverDollors.discoverDollor_pages.BaseTest;

public class Fingertip_TaskTab extends BaseTest{
	
	@FindBy(xpath="//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input']") private WebElement taskTitle;
	@FindBy(xpath="//textarea[@class='slds-textarea textarea uiInput uiInputTextArea uiInput--default uiInput--textarea']") private WebElement taskComments;
	@FindBy(xpath="(//button[@class='slds-button slds-button--neutral slds-button--brand'])[3]") private WebElement SaveTask;
	@FindBy(xpath="(//span[@class='ft-add-pill-btn '])[1]") private WebElement topicname;
	@FindBy(xpath="(//span[@class='ft-add-pill-btn '])[2]") private WebElement Taxonomyname;
	@FindBy(xpath="//input[@placeholder='Taxonomy Name']") private WebElement TaxonomyName;
	
	public WebElement gettaskTitle()
	{
		return taskTitle;
	}
	public void settaskTitle(String tasktitle)
	{
		taskTitle.sendKeys(tasktitle);
	}
	public WebElement gettaskComments()
	{
		return taskComments;
	}
	public void settaskComments(String taskcomments)
	{
		taskComments.sendKeys(taskcomments);
	}
	public WebElement getSaveTask()
	{
		return SaveTask;
	}
	public void setSaveTask()
	{
		SaveTask.click();

	}
	
	
	public Fingertip_TaskTab(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
