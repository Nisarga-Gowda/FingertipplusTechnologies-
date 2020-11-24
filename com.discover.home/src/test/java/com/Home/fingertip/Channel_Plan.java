package com.Home.fingertip;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingerTipPlan;
import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;

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
	    fp.creatingPlan("Plan from channel", "Creating plan from channel-Automation");
	    
	}

}
