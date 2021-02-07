package com.CommerceAP.TestCases;

import com.CommerceAP.PageObjects.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

//import org.junit.Assert;

import com.CommerceAP.PageObjects.AddProducts;

public class TC_AddProducts_002 extends BaseClass{

	@Test
	public void AddProducts()
	{
		logger.info("Url is Opened");
		
		LoginPage lp = new LoginPage(driver); // Created Object of LoginPage
		
		lp.EnterEmail(username);
		logger.info("Entered Email Id");
		lp.EnterPassword(password);
		logger.info("Entered Password");
		lp.ClickLogin();
		
		//Created Object of AddProducts
		
		AddProducts ap = new AddProducts(driver);
		logger.info("Enter Products information");
		
		ap.ClickCatelog();
		ap.ClickProducts();
		ap.ClickAddNew();
		ap.EntProductName("Ipad Device");
		ap.EntShortDesc("This is Iphone 2");
		ap.EntSKU("Entertantment");
		ap.CheckPublished();
		ap.SelProductType();
		ap.CheckVisibleInd();
		ap.SelVandor();
		
		ap.ClickSave();
		
		boolean res = driver.getPageSource().contains("The new product has been added successfully.");
		
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	

}
