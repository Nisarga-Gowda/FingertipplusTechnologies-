package com.Home.fingertip;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import POM.Fingertip_TaskTab;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;

public class Channel_Task extends BaseTest{
	@Test
public void channel_task() throws Throwable 
{
	Channel_OpenExisitingChannel c=new Channel_OpenExisitingChannel();
	c.channel_openexisitingchannel();
	FingertipLoginpage f=new FingertipLoginpage(driver);
	Thread.sleep(20000);
	f.clickChannelnewItemTab();
	f.clickChannelnewTask();
	f.clickChannelNewItemContinue();
	Fingertip_TaskTab ft=new Fingertip_TaskTab(driver);
	FileLibrary fl=new FileLibrary();
	ft.settaskTitle(fl.getPropValue(CHANNEL_PROP_PATH, "TaskTitle"));
	ft.settaskComments(fl.getPropValue(CHANNEL_PROP_PATH, "TaskComments"));
	ft.setSaveTask();
	WebDriverCommonLib w=new WebDriverCommonLib();
	FileLibrary f1=new FileLibrary();
	Thread.sleep(20000);
	Reporter.log(w.getPageTite(),true);
	w.verify(w.getPageTite(), f1.getPropValue(CHANNEL_PROP_PATH, "TaskVerification"), "Task Page Opened");
}
}
