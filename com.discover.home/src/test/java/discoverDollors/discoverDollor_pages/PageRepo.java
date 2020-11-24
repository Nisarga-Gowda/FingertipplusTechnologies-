package discoverDollors.discoverDollor_pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageRepo {
	
	@FindBy(xpath="(//a[.='Solutions'])[1]") private WebElement solution;
	@FindBy(xpath="(//a[.='Team'])[1]") private WebElement team;
	@FindBy(xpath="(//a[.='News'])[1]") private WebElement news;
	@FindBy(xpath="(//a[.='Contact'])[1]") private WebElement contact;
	@FindBy(xpath="(//a[.='Careers'])[1]") private WebElement careers;
	@FindBy(xpath="//h2[.='What We Do']") private WebElement solutionverify;
	@FindBy(xpath="//h2[.='News updates']") private WebElement newsverify;
	@FindBy(xpath="//h2[.='Team']") private WebElement teamverify;
	@FindBy(xpath="//h2[.='Send Message']") private WebElement contactverify;
	@FindBy(xpath="//h2[.='Careers']") private WebElement careerverify;
	public WebElement getsolution()
	{
		return solution;
		
	}
	public void setsolution()
	{
		solution.click();
		
	}
	public WebElement getverifysolution()
	{
		return solutionverify;
		
	}
	public void setverifysolution()
	{
		solutionverify.getText();
		
	}
	
	
	
	public WebElement getNews()
	{
		return news;
	}
	public void setnews()
	{
		news.click();
	}
	public WebElement getverifynews()
	{
		return newsverify;
	}
	public void setverifynews()
	{
		newsverify.getText();
	}
	
	
	
	public WebElement getteam()
	{
		return team;
		
	}
	public void setteam()
	{
		team.click();
		
	}
	public WebElement getverifyteam()
	{
		return teamverify;
		
	}
	public void setverifyteam()
	{
		teamverify.getText();
		
	}
	
	
	public WebElement getcareer()
	{
		return careers;
		
	}
	public void setcareers()
	{
		careers.click();
		
	}
	public WebElement getverifycareers()
	{
		return careerverify;
		
	}
	public void setverifycareers()
	{
		careerverify.getText();
		
	}
	
	
	public WebElement getcontact()
	{
		return contact;
		
	}
	public void setcontact()
	{
		contact.click();
		
	}
	public WebElement getverifycontact()
	{
		return contactverify;
		
	}
	public void setverifycontact()
	{
		contactverify.getText();
		
	}
	
	public PageRepo(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	

}
