package com.Home.fingertip;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)

public class Channel_NewObjectivePopup extends BaseTest {
	@Test
	public void channel_newobjectivepopup() throws Throwable
	{
	Login l=new Login();
	l.login();	
	FingertipLoginpage f=new FingertipLoginpage(driver);
	Thread.sleep(25000);
	f.clickChannelnewItemTab();
	f.clickChannelnewObjective();
	f.clickChannelNewItemContinue();
	Thread.sleep(20000);
	WebDriverCommonLib w=new WebDriverCommonLib();
	Reporter.log(w.getPageTite(),true);
    w.verifyElement(f.getverifyobjectivepopup(), "New Objective","New Objective popup ");
    Thread.sleep(10000);
}}



