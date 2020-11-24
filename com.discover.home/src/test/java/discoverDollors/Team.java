package discoverDollors;

import org.testng.annotations.Test;

import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.PageRepo;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Test
public class Team extends BaseTest{
	public void team() throws Throwable
	{
		PageRepo pr=new PageRepo(driver);
		pr.setteam();
		WebDriverCommonLib w = new WebDriverCommonLib();
		w.verifyElement(pr.getverifyteam(), "Team", "team page");
		
	}

}
