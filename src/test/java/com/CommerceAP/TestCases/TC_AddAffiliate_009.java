package com.CommerceAP.TestCases;

import com.CommerceAP.PageObjects.LoginPage;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.CommerceAP.PageObjects.AddAffiliate;

public class TC_AddAffiliate_009 extends BaseClass{
	
	@Test
	public void AddAffiliate() throws IOException
	{
		logger.info("Url is Opened");
		
		LoginPage lp = new LoginPage(driver); // Created Object of LoginPage
		
		lp.EnterEmail(username);
		logger.info("Entered Email Id");
		lp.EnterPassword(password);
		logger.info("Entered Password");
		lp.ClickLogin();
		
		AddAffiliate addaf = new AddAffiliate(driver);
		logger.info("Affiliate info added");
		addaf.Promotions();
		addaf.Affiliates();
		addaf.AddNew();
		addaf.FirstName("Safia");
		addaf.LastName("Afsar");
		String email=randomestring()+"@gmail.com";
		addaf.Email(email);
		addaf.Company("Bismillah LLC");
		addaf.Country();
		addaf.State();
		addaf.Region("Norcross");
		addaf.City("Lilburn");
		addaf.Address("123 Durham ");
		addaf.Zip("30047");
		String phonenumber=randomestring()+4;
		addaf.PhoneNumber(phonenumber);
		addaf.Save();
		
		boolean aff=driver.getPageSource().contains("The new affiliate has been added successfully.");
		if(aff==true)
		{
			logger.info("Test cases passed");
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"AddAffiliate");
			logger.info("Test cases failed");
			Assert.assertTrue(false);
		}
		
	}

}
