package discoverDollors;

import org.testng.annotations.Test;

import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.PageRepo;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Test
public class Contact extends BaseTest{
	public void contact() throws Throwable
	{
		PageRepo p=new PageRepo(driver);
		p.setcontact();
		WebDriverCommonLib w = new WebDriverCommonLib();
		w.verifyElement(p.getverifycontact(), "Send Message", "Contact Page");
		
		
	}

}
