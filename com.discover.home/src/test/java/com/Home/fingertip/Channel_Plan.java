package com.Home.fingertip;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingerTipPlan;
import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;

@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)
public class Channel_Plan extends BaseTest{
	@Test
	public void channel_plan() throws Throwable
	{
		Channel_OpenExisitingChannel c=new Channel_OpenExisitingChannel();
		c.channel_openexisitingchannel();
	    FingertipLoginpage f=new FingertipLoginpage(driver);
	    Thread.sleep(35000);
	    f.clickChannelnewItemTab();
	    f.clickChannelnewPlan();
	    f.clickChannelNewItemContinue();
	    FingerTipPlan fp=new FingerTipPlan(driver);
	    WebDriverCommonLib w=new WebDriverCommonLib();
	    FileLibrary fl=new FileLibrary();
		Thread.sleep(25000);
	    fp.creatingPlan(fl.getPropValue(CHANNEL_PROP_PATH, "PlanTitle"), fl.getPropValue(CHANNEL_PROP_PATH, "PlanDescription"));
	    Thread.sleep(25000);
	    w.verify(w.getPageTite(), fl.getPropValue(CHANNEL_PROP_PATH, "PlanVerification"), "Plan Page");
	   
	    Thread.sleep(25000);
	    
	    
	}

}
