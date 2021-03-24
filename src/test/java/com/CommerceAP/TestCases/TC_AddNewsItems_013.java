package com.CommerceAP.TestCases;

import org.testng.annotations.Test;

import com.CommerceAP.PageObjects.AddNewsItems;
import com.CommerceAP.PageObjects.LoginPage;

public class TC_AddNewsItems_013 extends BaseClass {
	
	@Test
	public void AddNewsItems()
	{
		logger.info("Url is Opened");
		
		LoginPage lp = new LoginPage(driver); // Created Object of LoginPage
		
		lp.EnterEmail(username);
		logger.info("Entered Email Id");
		lp.EnterPassword(password);
		logger.info("Entered Password");
		lp.ClickLogin();
		
		AddNewsItems ni = new AddNewsItems(driver);
		logger.info("AddNewsItems info provided");
		ni.ContentManagement();
		ni.NewsItems();
		ni.AddNew();
		ni.Title("Bismillah Corpro");
		ni.ShortDisc("It very important");
		ni.AllowComnd();
		ni.StartDate("03/24/2021");
		ni.EndDate("12/30/2025");
		ni.Published();
		ni.Save();
	
	}

}
