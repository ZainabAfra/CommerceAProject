package com.CommerceAP.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CommerceAP.PageObjects.AddCustomers;
import com.CommerceAP.PageObjects.LoginPage;

public class TC_AddCoustomers_006 extends BaseClass{
	
	@Test
	public void AddCoustomers() throws IOException
	{
		logger.info("Url is Opened");
		
		LoginPage lp = new LoginPage(driver); // Created Object of LoginPage
		
		lp.EnterEmail(username);
		logger.info("Entered Email Id");
		lp.EnterPassword(password);
		logger.info("Entered Password");
		lp.ClickLogin();
		
		AddCustomers addCu = new AddCustomers(driver);
		logger.info("Customers info provided");
		addCu.Customers();
		addCu.addCustomers();
		addCu.AddNew();
		String email=randomestring()+"@gmail.com";
		addCu.Email(email);
		addCu.Password("1234457");
		addCu.FirstName("Muhammed");
		addCu.LastName("Udin");
		addCu.Gender();
		addCu.DOB("10/23/1980");
		addCu.vendor();
		addCu.Save();
		
		boolean ser=driver.getPageSource().contains("The new customer has been added successfully.");
		if(ser==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case passed");
		}
		else
		{
			captureScreen(driver,"AddCustomers");
			Assert.assertTrue(false);
			logger.info("Test case failed");
			
		}
	}

}
