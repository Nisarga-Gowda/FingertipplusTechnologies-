package com.Home.fingertip;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)
public class Channel_DeleteChannel extends BaseTest{
	@Test
	public void channel_deletechannel() throws Throwable
	{
		Channel_OpenExisitingChannel c=new  Channel_OpenExisitingChannel();
		c.channel_openexisitingchannel();
		FingertipLoginpage f=new FingertipLoginpage(driver);
		Thread.sleep(20000);
		f.clickchannelSetting();
		f.clickchannelDeleteChannel();
		Thread.sleep(20000);
		f.clickchannelDeleteUpdate();
		 WebDriverCommonLib w=new WebDriverCommonLib();
		 FileLibrary fl=new FileLibrary();
		 Reporter.log(w.getPageTite(),true);
		 
	 w.verify(fl.getPropValue(CHANNEL_PROP_PATH, "ChannelPageVerification"), "Home | Salesforce", "Channel deleted");
	 Thread.sleep(10000);	
	}

}
