package com.Home.fingertip;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)
public class Channel_Searchbar extends BaseTest {
	@Test
	public void channel_searchbar() throws Throwable
	{
	Login l=new Login();
	l.login();
	
Thread.sleep(35000);
FingertipLoginpage f=new FingertipLoginpage(driver);
f.clickChannelSearch("Automation Test");
f.setListOfSearch();
WebDriverCommonLib w=new WebDriverCommonLib();
FileLibrary fl=new FileLibrary();
w.verify(fl.getPropValue(CHANNEL_PROP_PATH, "ChannelDecisionverification"), "Automation Test | Salesforce", "Decision Page");

Thread.sleep(25000);


}
}