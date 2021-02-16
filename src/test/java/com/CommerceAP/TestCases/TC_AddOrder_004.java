package com.CommerceAP.TestCases;

import com.CommerceAP.PageObjects.LoginPage;

import org.testng.annotations.Test;

import com.CommerceAP.PageObjects.AddOrder;

public class TC_AddOrder_004 extends BaseClass{
	
	@Test
	public void AddOrder() 
	{
		logger.info("Url is Opened");
		
		LoginPage lp = new LoginPage(driver); // Created Object of LoginPage
		
		lp.EnterEmail(username);
		logger.info("Entered Email Id");
		lp.EnterPassword(password);
		logger.info("Entered Password");
		lp.ClickLogin();
		
		AddOrder addOr = new AddOrder(driver);
		addOr.ClickSales();
		addOr.ClickOrders();
		addOr.ClickSearch();
		addOr.SelStartDate();
		addOr.ClickSDay();
		addOr.SEndDate();
		addOr.Month();
		addOr.Arraw();
		addOr.SpicelDate();
		
		//addOr.ClickEDay();
	}

}
