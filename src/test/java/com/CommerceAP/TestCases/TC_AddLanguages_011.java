package com.CommerceAP.TestCases;

import com.CommerceAP.PageObjects.LoginPage;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.CommerceAP.PageObjects.AddLanguages;

public class TC_AddLanguages_011 extends BaseClass{
	
	@Test
	public void AddLanguages() throws InterruptedException, IOException
	{
		logger.info("Url is Opened");
		
		LoginPage lp = new LoginPage(driver); // Created Object of LoginPage
		
		lp.EnterEmail(username);
		logger.info("Entered Email Id");
		lp.EnterPassword(password);
		logger.info("Entered Password");
		lp.ClickLogin();
		
		AddLanguages  addAL = new AddLanguages(driver);
		logger.info("Language info provided");
		addAL.Configuration();
		addAL.Languages();
		addAL.AddNew();
		addAL.Name("Afsaar");
		addAL.LanguageCulture();
		String UC = randomestring()+"abcd";
		addAL.UniqueCode("XY");
		Thread.sleep(3000);
		//addAL.FlagName();
		addAL.Currency();
		addAL.Published();
		addAL.Save();
		
		boolean lg=driver.getPageSource().contains("For security purposes, the feature you have requested is not available on the demo site.");
		if(lg==true)
		{
			logger.info("Test case passed");
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"AddLanguages");
			logger.info("Test cases Failed");
			Assert.assertTrue(false);
		}
		
	}	
	

}
