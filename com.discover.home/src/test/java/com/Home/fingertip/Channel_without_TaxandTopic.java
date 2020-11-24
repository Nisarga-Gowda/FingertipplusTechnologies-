package com.Home.fingertip;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)

public class Channel_without_TaxandTopic extends BaseTest{
	@Test
	public void channelwithouttaxandtopic() throws Throwable
	{
		Login l=new Login();
		l.login();
		Thread.sleep(25000);
		FingertipLoginpage f=new FingertipLoginpage(driver);
		f.clicknewChannel();
		FileLibrary f1=new FileLibrary();
		WebDriverCommonLib w=new WebDriverCommonLib();
		f.setchannelName(f1.getPropValue(CHANNEL_PROP_PATH, "ChannelName"));
		f.clickSaveChannel();
		Thread.sleep(25000);
		w.verifyElement(f.getverifywithoutTaxandTopic(), f1.getPropValue(CHANNEL_PROP_PATH, "New Channel"),"Channel is not created - Needs at least topic or Taxonomy");
		Thread.sleep(25000);
	}
	

}
