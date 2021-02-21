package com.CommerceAP.TestCases;

import com.CommerceAP.PageObjects.LoginPage;

import org.testng.annotations.Test;

import com.CommerceAP.PageObjects.AddDiscounts;
public class TC_AddDiscounts_007 extends BaseClass{
	
	
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
		
		AddDiscounts addD= new AddDiscounts(driver);
		
		addD.Promotions();
		addD.Discounts();
		addD.AddNew();
		addD.Name("Fatema");
		addD.DiscountType();
		addD.DiscountLimit();
		addD.Save();
	}

}
