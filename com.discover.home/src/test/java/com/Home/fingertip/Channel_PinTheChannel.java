package com.Home.fingertip;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)
public class Channel_PinTheChannel extends BaseTest{
	@Test
	public void channel_pinthechannel() throws Throwable
	{
	Login l=new Login();
	l.login();	
    Thread.sleep(35000);
    FingertipLoginpage f=new FingertipLoginpage(driver);
    Thread.sleep(25000);
    WebDriverCommonLib w=new WebDriverCommonLib();
    Actions hover = new Actions(driver);
	hover.moveToElement(f.getchannelPin()).click().build().perform();
	Thread.sleep(10000);
	FileLibrary fl=new FileLibrary();
	w.verify(fl.getPropValue(CHANNEL_PROP_PATH, "ChannelVerification"), "Home | Salesforce", "Channel Edited");
	Thread.sleep(10000);
}
}
