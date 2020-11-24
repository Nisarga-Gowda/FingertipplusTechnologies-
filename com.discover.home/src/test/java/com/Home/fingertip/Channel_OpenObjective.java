package com.Home.fingertip;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;

@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)
public class Channel_OpenObjective extends BaseTest {
	@Test
	public void channel_opentask() throws Throwable
	{
	Login l=new Login();
	l.login();
	FileLibrary fl=new FileLibrary();
Thread.sleep(35000);
FingertipLoginpage f=new FingertipLoginpage(driver);
f.clickChannelSearch(fl.getPropValue(CHANNEL_PROP_PATH, "ObjectiveName"));
Thread.sleep(10000);
f.setListOfSearch();
Thread.sleep(15000);
WebDriverCommonLib w=new WebDriverCommonLib();
Reporter.log(w.getPageTite(),true);
w.verify(fl.getPropValue(CHANNEL_PROP_PATH, "ObjectiveVerfication"), "Automation Objective | Salesforce", "Objective Page");

	}

}


