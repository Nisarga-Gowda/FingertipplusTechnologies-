package com.Home.fingertip;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Listeners(discoverDollors.discoverDollor_pages.MyListner.class)
public class Login extends BaseTest{
	@Test
	public void login() throws Throwable
	{
		FingertipLoginpage f=new FingertipLoginpage(driver);
		f.login("nisarga@fingertipplus.com.qa", "Nidhi1995@");
			
	}

}
