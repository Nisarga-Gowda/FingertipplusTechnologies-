package com.Home.fingertip;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)
public class Channel_Taxonomy extends BaseTest{
	@Test
	public void channel_Taxonomy() throws Throwable
	{
		Login l=new Login();
		l.login();
		FingertipLoginpage f=new FingertipLoginpage(driver);
		Thread.sleep(25000);
		f.clicknewChannel();
		FileLibrary f1=new FileLibrary();
		f.setchannelName(f1.getPropValue(CHANNEL_PROP_PATH, "ChannelName"));
		f.setTaxonomynameclcik();
		f.setTaxonomyName(f1.getPropValue(CHANNEL_PROP_PATH, "TaxonomyName"));
		f.clickSaveChannel();
		Thread.sleep(25000);
		WebDriverCommonLib w=new WebDriverCommonLib();
		w.verify(w.getPageTite(), f1.getPropValue(CHANNEL_PROP_PATH, "ChannelPageVerification"), "Channel Created");
		Thread.sleep(25000);
	}
}
