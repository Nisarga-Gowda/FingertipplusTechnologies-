package com.Home.fingertip;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;

public class Channel_Refresh extends BaseTest{
	@Test
	public void channel_refresh() throws Throwable
	{
		Login l=new Login();
		l.login();	
	    Thread.sleep(35000);
	    FingertipLoginpage f=new FingertipLoginpage(driver);
	    f.clickListOfChannel();
	    Thread.sleep(10000);
	    f.clickchannelRefresh();
	
	WebDriverCommonLib w=new WebDriverCommonLib();
	FileLibrary fl=new FileLibrary();
	Reporter.log(w.getPageTite(),true);
	}

}
