package com.decision.fingertip;

import com.Home.fingertip.Login;

import POM.FingerTipDecision;
import discoverDollors.discoverDollor_pages.BaseTest;

public class Decison_NewDecision extends BaseTest {
	public void decision() throws Throwable
	{
			Login l=new Login();
			l.login();
			Thread.sleep(35000);
			FingerTipDecision f=new FingerTipDecision(driver);
			f.clickdecision();
			Thread.sleep(35000);
			f.clicknewDecision();
			f.clickDecisionContinue();
			f.clickDecisionTitle("Automation Test");
			Thread.sleep(10000);
			f.clickDecisionDescription("Automation Testing TestNg");
			f.clickDecisionpraposal("Test");
			f.clickDecisionPeople();
			Thread.sleep(25000);
			f.clickDecisionShare();

}
}