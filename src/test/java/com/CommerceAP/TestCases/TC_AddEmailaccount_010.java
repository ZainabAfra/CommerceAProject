package com.CommerceAP.TestCases;

import com.CommerceAP.PageObjects.LoginPage;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.CommerceAP.PageObjects.AddEmailAccount;

public class TC_AddEmailaccount_010 extends BaseClass{
	
	@Test
	public void AddEmailaccount() throws IOException
	{
		logger.info("Url is Opened");
		
		LoginPage lp = new LoginPage(driver); // Created Object of LoginPage
		
		lp.EnterEmail(username);
		logger.info("Entered Email Id");
		lp.EnterPassword(password);
		logger.info("Entered Password");
		lp.ClickLogin();
		
		AddEmailAccount addEA = new AddEmailAccount(driver);
		logger.info("Email Accoutn info provided");
		addEA.Configuration();
		addEA.Emailaccounts();
		addEA.AddNew();
		String email = randomestring()+"@gmail.com";
		addEA.Email(email);
		addEA.EmailName("Muhammed");
		String Ht=randomeNum()+2;
		addEA.Host(123);
		String pt=randomeNum()+3;
		addEA.Port(5050);
		addEA.User("Quality Assurance Engineer");
		addEA.Password("A123456F");
		addEA.SSL();
		addEA.Save();
		
		boolean ea=driver.getPageSource().contains("For security purposes, the feature you have requested is not available on the demo site");
		if(ea==true)
		{
			logger.info("Test case passed");
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"AddEmailAccount");
			logger.info("Test case failed");
			Assert.assertTrue(false);
			
		}
	}

}
