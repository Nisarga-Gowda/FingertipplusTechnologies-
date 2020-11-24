package com.Home.fingertip;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)

public class Channel_newDecisionpopup extends BaseTest{
	@Test
	public void channel_newdecisionpopup() throws Throwable

	{
		Login l=new Login();
		l.login();	
		FingertipLoginpage f=new FingertipLoginpage(driver);
		Thread.sleep(25000);
		f.clickChannelnewItemTab();
		f.clickChannelnewDecision();
		f.clickChannelNewItemContinue();
		Thread.sleep(20000);
		WebDriverCommonLib w=new WebDriverCommonLib();
		Reporter.log(w.getPageTite(),true);
		w.verifyElement(f.getverifyDecisionpopup(), "New Decision", "New decision popup opened");

	}

}
