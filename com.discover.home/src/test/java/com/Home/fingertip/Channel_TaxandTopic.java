package com.Home.fingertip;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)
public class Channel_TaxandTopic extends BaseTest {
	@Test
	public void channel_Taxandtopic() throws Throwable
	{
	Login l=new Login();
	l.login();
	FingertipLoginpage f=new FingertipLoginpage(driver);
	Thread.sleep(25000);
	FileLibrary f1=new FileLibrary();
   // f.CreatingChannelwithTaxandtopic(f1.getPropValue(CHANNEL_PROP_PATH, "ChannelName"),f1.getPropValue(CHANNEL_PROP_PATH, "TopicName"),f1.getPropValue(CHANNEL_PROP_PATH, "TaxonomyName"));
	Thread.sleep(25000);
	f.clicknewChannel();
	f.setchannelName(f1.getPropValue(CHANNEL_PROP_PATH, "ChannelName"));
	f.clicktopicnameclick();
	f.settopicName(f1.getPropValue(CHANNEL_PROP_PATH, "TopicName"));
	f.setTaxonomynameclcik();
	Thread.sleep(25000);
	f.setTaxonomyName(f1.getPropValue(CHANNEL_PROP_PATH, "TaxonomyName"));
	Thread.sleep(15000);
	
		f.clickSaveChannel();
        Thread.sleep(25000);
	
	WebDriverCommonLib w=new WebDriverCommonLib();
	w.verify(w.getPageTite(), f1.getPropValue(CHANNEL_PROP_PATH, "ChannelPageVerification"), "Channel Created");

	Thread.sleep(25000);
	}
	
}
