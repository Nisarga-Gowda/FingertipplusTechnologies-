package com.Home.fingertip;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)
public class Channel_EditChannel extends BaseTest{
	@Test
	public void channel_editchannel() throws Throwable
	{
	Channel_OpenExisitingChannel c=new  Channel_OpenExisitingChannel();
	c.channel_openexisitingchannel();
	Thread.sleep(10000);
	FingertipLoginpage f=new FingertipLoginpage(driver);
	f.clickchannelSetting();
	Thread.sleep(20000);
	f.clickchannelEdit();
	Thread.sleep(10000);
	f.clickchannelEditchannelIcon();
	Thread.sleep(10000);
	f.clickchannelChangeIcon();
	
	Thread.sleep(10000);
	f.clickchannelEditUpdate();
	Thread.sleep(20000);
	FileLibrary fl=new FileLibrary();
	 WebDriverCommonLib w=new WebDriverCommonLib();
	 w.verify(fl.getPropValue(CHANNEL_PROP_PATH, "ChannelVerification"), "Home | Salesforce", "Channel Edited");
	 Thread.sleep(10000);
}
}
