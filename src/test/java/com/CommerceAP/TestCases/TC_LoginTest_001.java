package com.CommerceAP.TestCases;

import org.testng.Assert;
//import org.junit.Assert;
import org.testng.annotations.Test;

import com.CommerceAP.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() // Created LoginTest Method
	{
		
		logger.info("Url is Opened");
		
		LoginPage lp = new LoginPage(driver); // Created Object of LoginPage
		
		lp.EnterEmail(username);
		logger.info("Entered Email Id");
		lp.EnterPassword(password);
		logger.info("Entered Password");
		lp.ClickLogin();
		
		//Verify Title of The HomePage
		
		if(driver.getTitle().equals("Dashboard / nopCommerce administration"))
		{
			Assert.assertTrue(true);
			logger.info("Test Case Passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Test Case Failed");
		}
				
	}
	

}
