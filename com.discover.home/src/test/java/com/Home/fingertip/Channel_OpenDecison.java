package com.Home.fingertip;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)

public class Channel_OpenDecison extends BaseTest {
	@Test
	public void channel_opendecision() throws Throwable
	{
		Login l=new Login();
		l.login();
		FileLibrary fl=new FileLibrary();
	Thread.sleep(35000);
	FingertipLoginpage f=new FingertipLoginpage(driver);
	f.clickChannelSearch(fl.getPropValue(CHANNEL_PROP_PATH, "DecisionTitle"));
	f.setListOfSearch();
	WebDriverCommonLib w=new WebDriverCommonLib();
	Reporter.log(w.getPageTite(),true);
	w.verify(fl.getPropValue(CHANNEL_PROP_PATH, "Decisionverification2"), "Decision from channel | Salesforce", "Decision Page");


}
}
