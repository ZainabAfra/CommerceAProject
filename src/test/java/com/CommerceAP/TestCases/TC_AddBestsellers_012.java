package com.CommerceAP.TestCases;

import com.CommerceAP.PageObjects.LoginPage;

import org.testng.annotations.Test;

import com.CommerceAP.PageObjects.AddBestsellers;

public class TC_AddBestsellers_012 extends BaseClass{
	
	@Test
	public void AddBestsellers()
	{
		logger.info("Url is Opened");
		
		LoginPage lp = new LoginPage(driver); // Created Object of LoginPage
		
		lp.EnterEmail(username);
		logger.info("Entered Email Id");
		lp.EnterPassword(password);
		logger.info("Entered Password");
		lp.ClickLogin();
		
		AddBestsellers BD = new AddBestsellers(driver);
		
		logger.info("Bestsellers info provided");
		BD.Reports();
		BD.Bestsellers();
		BD.StartDate("03/07/2021");
		BD.EndDate("12/01/2025");
		BD.Store();
		BD.OrderStatus();
		BD.PaymentStatus();
		BD.Category();
		BD.Manufacturer();
		BD.BillingCountry();
		BD.Vendor();
		BD.Runreport();
	}

}
