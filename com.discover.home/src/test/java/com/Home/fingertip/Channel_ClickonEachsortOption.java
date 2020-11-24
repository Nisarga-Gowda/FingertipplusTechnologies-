package com.Home.fingertip;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;

public class Channel_ClickonEachsortOption extends BaseTest {
	@Test
	public void channel_clickoneachsortoption() throws Throwable
	{
	Login l=new Login();
	l.login();	
    Thread.sleep(35000);
    FingertipLoginpage f=new FingertipLoginpage(driver);
    f.clickListOfChannel();
    Thread.sleep(15000);
    f.ClickoneAfteranother();
    WebDriverCommonLib w=new WebDriverCommonLib();
    w.verifyElement(f.getchannelSortVerification(), "object-icon", "Sorted"); 

}
}
