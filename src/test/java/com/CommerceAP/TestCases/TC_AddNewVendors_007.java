package com.CommerceAP.TestCases;

import org.testng.annotations.Test;

import com.CommerceAP.PageObjects.AddNewVendor;
import com.CommerceAP.PageObjects.LoginPage;

@Test
public class TC_AddNewVendors_007 extends BaseClass{
	
	
	public void AddNewVendors() throws InterruptedException
	{
		logger.info("Url is Opened");
		
		LoginPage lp = new LoginPage(driver); // Created Object of LoginPage
		
		lp.EnterEmail(username);
		logger.info("Entered Email Id");
		lp.EnterPassword(password);
		logger.info("Entered Password");
		lp.ClickLogin();
		
		AddNewVendor addNV = new AddNewVendor(driver);
		addNV.Customers();
		addNV.Vendors();
		addNV.AddNew();
		addNV.Basic();
		Thread.sleep(3000);
		//addNV.Name("Namaj");
		addNV.Description("It will  take to Janna");
		addNV.Email("Afsar_jp@yahoo.com");
		addNV.Active();
		addNV.Counrty();
		addNV.State();
		addNV.Save();
		
	}

}
