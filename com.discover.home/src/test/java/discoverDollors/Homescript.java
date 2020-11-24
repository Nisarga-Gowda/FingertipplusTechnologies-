package discoverDollors;
import org.testng.annotations.Test;

import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.PageRepo;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Test
public class Homescript extends BaseTest {
	
	public void home() throws Throwable
	{
		PageRepo pr=new PageRepo(driver);
		pr.setsolution();
		WebDriverCommonLib wc=new WebDriverCommonLib();
		wc.verifyElement(pr.getverifysolution(), "What We Do", "solution page");
		
}	
		
	}


