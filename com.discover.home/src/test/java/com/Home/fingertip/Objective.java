package com.Home.fingertip;

import org.testng.annotations.Test;

import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;

public class Objective extends BaseTest{
	@Test
	public void objective() throws Throwable
	{
		Login l=new Login();
		l.login();
		FingertipLoginpage f=new FingertipLoginpage(driver);
		f.clickObjective();
		Thread.sleep(25000);
		f.clicknewObjective();
		Thread.sleep(25000);
	    f.setobjectiveName("XYX");
	    
	    f.setobjInitialValue("1");
	    
	    f.setobjTargetValue("10");
	 
	    f.setobjStartDate("3.11.2020");
	 
	    f.setobjEndDate("5.11.2020");
	    f.clickobjsave();
	}

}
