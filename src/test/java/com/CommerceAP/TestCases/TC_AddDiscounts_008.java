package com.CommerceAP.TestCases;

import com.CommerceAP.PageObjects.LoginPage;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.CommerceAP.PageObjects.AddDiscounts;



public class TC_AddDiscounts_008 extends BaseClass{
	@Test
	public void AddDiscounts()
	{
		logger.info("Url is Opened");
		
		LoginPage lp = new LoginPage(driver); // Created Object of LoginPage
		
		lp.EnterEmail(username);
		logger.info("Entered Email Id");
		lp.EnterPassword(password);
		logger.info("Entered Password");
		lp.ClickLogin();
		
		AddDiscounts addD = new AddDiscounts (driver);
		logger.info("AddDiscounts information added");
		addD.Promotions();
		addD.Discounts();
		addD.AddNew();
		addD.Name("Cell Phone");
		addD.DiscountType();
		addD.StartDate("02/26/2021");
		addD.EndDate("12/30/2021");
		addD.DiscountLimit();
		addD.AdminComment("This is our valubel customer");
		addD.Save();
		
		boolean ad =driver.getPageSource().contains("The new discount has been added successfully.");
		if(ad==true)
		{
			logger.info("Testcase passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test case failed");
			Assert.assertTrue(false);
		}
		
				
	}
	
}
