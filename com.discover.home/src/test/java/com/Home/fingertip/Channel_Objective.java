package com.Home.fingertip;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)
public class Channel_Objective extends BaseTest{
	@Test
	public void channel_objective() throws Throwable
	{
		  Channel_OpenExisitingChannel c=new Channel_OpenExisitingChannel();
		  c.channel_openexisitingchannel();
		  FileLibrary fl=new FileLibrary();
		  Thread.sleep(35000);
		  FingertipLoginpage f=new FingertipLoginpage(driver);
		  f.clickChannelnewItemTab();
		  f.clickChannelnewObjective();
		  f.clickChannelNewItemContinue();
	
		  f.creatingObject(fl.getPropValue(CHANNEL_PROP_PATH, "ObjectiveName"), fl.getPropValue(CHANNEL_PROP_PATH, "IntialValue"), fl.getPropValue(CHANNEL_PROP_PATH, "TargetValue"),fl.getPropValue(CHANNEL_PROP_PATH, "StartDate"),fl.getPropValue(CHANNEL_PROP_PATH, "EndDate"));
		  WebDriverCommonLib w=new WebDriverCommonLib();
		  w.verify(fl.getPropValue(CHANNEL_PROP_PATH, "ObjectiveVerification"), "Automation Objective | Salesforce", "Objective Page");
		  Thread.sleep(10000);}
	
	
	

}
