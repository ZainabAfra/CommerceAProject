package com.CommerceAP.TestCases;

import org.testng.annotations.Test;

import com.CommerceAP.PageObjects.AddShipments;
import com.CommerceAP.PageObjects.LoginPage;

public class TC_Shipments_005 extends BaseClass{
	
	@Test
	public void Shipments()
	{
		logger.info("Url is Opened");
		
		LoginPage lp = new LoginPage(driver); // Created Object of LoginPage
		
		lp.EnterEmail(username);
		logger.info("Entered Email Id");
		lp.EnterPassword(password);
		logger.info("Entered Password");
		lp.ClickLogin();
		
		
		AddShipments as = new AddShipments(driver);
		logger.info("AddShipments info provided");
		as.ClickSales();
		as.ClickShipments();
		as.SelStartDate("02/17/2021");
		as.SelEndDate("12/30/2021");
		as.EntTrackingNumber("12021");
		as.SelWarehouse();
		as.SelCountry();
		as.SelState();
		as.EntRegion("Gwineett");
		as.EntCity("Lilburn");
		as.ClickSearch();
		
		
				
	}

}
