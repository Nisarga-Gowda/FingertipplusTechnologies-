package com.decision.fingertip;

import org.testng.annotations.Test;

import POM.FingerTipDecision;
import POM.FingertipLoginpage;
import discoverDollors.discoverDollor_pages.BaseTest;

public class Decision_Taxonomy extends BaseTest{
	@Test
	public void decisionTaxonomy() throws Throwable
	{
		BaseTest b=new BaseTest();
		b.openthebrowserentertheurl();
		FingertipLoginpage f1=new FingertipLoginpage(driver);
		f1.login("nisarga@fingertipplus.com.qa", "Nidhi1995@");
		FingerTipDecision f=new FingerTipDecision(driver);
		Thread.sleep(35000);
		
		f.clickDecisionActionmenu();

	
//		;
//		Thread.sleep(25000);
//f.clickDecisionpraposal("Test");
//Thread.sleep(25000);
//f.clickDecisionPraposepopupcheckbox();
//
//f.clickDecisionPraposesave();
//Thread.sleep(25000);
//f.clickDecisionDecidePhase();
//Thread.sleep(25000);
//f.clickDecisionApproval();
//Thread.sleep(25000);
//f.clickDecisionexecutePhase();
//Thread.sleep(25000);
//f.clickDecisionevaluatePhase();
//Thread.sleep(25000);
//f.clickDecisionclosePhase();
//f.clickDecisionclosePhasesave();
//		
		
	}

}
