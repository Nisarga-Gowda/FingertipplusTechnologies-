package com.Home.fingertip;

import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;

public class Channel_OpenExisitingChannel extends BaseTest {
	@Test
	public void channel_openexisitingchannel() throws Throwable
	{
	Login l=new Login();
	l.login();	
    Thread.sleep(35000);
    FingertipLoginpage f=new FingertipLoginpage(driver);
    f.clickListOfChannel();

}
}
