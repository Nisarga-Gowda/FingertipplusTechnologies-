package com.Home.fingertip;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;

public class Channel_PinTheChannel extends BaseTest{
	@Test
	public void channel_pinthechannel() throws Throwable
	{
	Login l=new Login();
	l.login();	
    Thread.sleep(35000);
    FingertipLoginpage f=new FingertipLoginpage(driver);
   // 
    Thread.sleep(25000);
    WebDriverCommonLib w=new WebDriverCommonLib();
//    w.mouseHover(f.getchannelPin());
//   f.clickchannelPin();
//   
       Actions hover = new Actions(driver);
	  hover.moveToElement(f.getchannelPin()).click().build().perform();
	FileLibrary fl=new FileLibrary();
	  w.verify(fl.getPropValue(CHANNEL_PROP_PATH, "ChannelVerification"), "Home | Salesforce", "Channel Edited");
}
}
