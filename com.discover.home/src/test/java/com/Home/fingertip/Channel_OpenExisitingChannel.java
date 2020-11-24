package com.Home.fingertip;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)
public class Channel_OpenExisitingChannel extends BaseTest {
	@Test
	public void channel_openexisitingchannel() throws Throwable
	{
	Login l=new Login();
	l.login();	
    Thread.sleep(35000);
    FingertipLoginpage f=new FingertipLoginpage(driver);
    f.clickListOfChannel();
    Thread.sleep(10000);
}
}
