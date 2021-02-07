package com.CommerceAP.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CommerceAP.PageObjects.AddCategories;
import com.CommerceAP.PageObjects.LoginPage;

public class TC_AddCatagories_003 extends BaseClass{
	
		@Test
		public void AddCatagories()
		{
			logger.info("Url is Opened");
			
			LoginPage lp = new LoginPage(driver); // Created Object of LoginPage
			
			lp.EnterEmail(username);
			logger.info("Entered Email Id");
			lp.EnterPassword(password);
			logger.info("Entered Password");
			lp.ClickLogin();
			
			AddCategories addCT = new AddCategories(driver);
			
			logger.info("AddCategories info provided");
			addCT.ClickCatalog();
			addCT.ClickCategories();
			addCT.ClickAddNew();
			addCT.EntName("Information Techonalogi");
			addCT.SelParentCat();
			addCT.clickSave();
			
			boolean ser=driver.getPageSource().contains("The new category has been added successfully.");
			if(ser==true)
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
				
			}
		}
	

}
