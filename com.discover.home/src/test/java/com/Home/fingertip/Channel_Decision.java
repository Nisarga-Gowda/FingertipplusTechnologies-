package com.Home.fingertip;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.FingerTipDecision;
import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;

public class Channel_Decision extends BaseTest{
	@Test
	public void channel_decision() throws Throwable
	{
	Login l=new Login();
	l.login();	
    Thread.sleep(35000);
    FingertipLoginpage f=new FingertipLoginpage(driver);
	FingerTipDecision fd=new FingerTipDecision(driver);
	  WebDriverCommonLib w=new WebDriverCommonLib();
    f.clickListOfChannel();
    f.clickChannelnewItemTab();
    f.clickChannelnewDecision();
    f.clickChannelNewItemContinue();
 
	FileLibrary f1=new FileLibrary();
    Thread.sleep(25000);
    fd.DecisionCreation(f1.getPropValue(CHANNEL_PROP_PATH, "DecisionTitle"),f1.getPropValue(CHANNEL_PROP_PATH,"TitleDescription"),f1.getPropValue(CHANNEL_PROP_PATH,"DecisionPraposal"));
    Thread.sleep(25000);
    w.verify(w.getPageTite(),f1.getPropValue(CHANNEL_PROP_PATH, "DecisionVerification") , "Decision from channel Created ");
   
}
}