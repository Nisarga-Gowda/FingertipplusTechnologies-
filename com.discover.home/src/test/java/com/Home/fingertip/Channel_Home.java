package com.Home.fingertip;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.FileLibrary;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)
public class Channel_Home extends BaseTest{
	@Test
	public void channel_home() throws Throwable
	{
		Login l=new Login();
		l.login();
		WebDriverCommonLib w=new WebDriverCommonLib();
		FileLibrary fl=new FileLibrary();
		
		w.verify( w.getPageTite(),fl.getPropValue(Login_PROP_PATH, "HomeTitle"), "Lightning Experience");
		Thread.sleep(10000);

	}

}
