package com.Home.fingertip;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)

public class Channel_NewTaskpopup extends BaseTest{
	@Test

	public void channel_newtaskpopup() throws Throwable
	{
	Login l=new Login();
	l.login();	
	FingertipLoginpage f=new FingertipLoginpage(driver);
	Thread.sleep(35000);
	f.clickChannelnewItemTab();
	f.clickChannelnewTask();
	f.clickChannelNewItemContinue();
	Thread.sleep(20000);
	WebDriverCommonLib w=new WebDriverCommonLib();
	w.verifyElement(f.getverifyTaskpopup(), "New Task","New Task popup");

}}
