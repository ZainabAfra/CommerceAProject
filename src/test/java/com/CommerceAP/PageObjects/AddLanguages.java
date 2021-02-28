package com.CommerceAP.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddLanguages {
	
	WebDriver ldriver;
	
	public AddLanguages(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//Finds Elements
	
	@FindBy(xpath="//span[normalize-space()='Configuration']")
	WebElement Configuration;
	
	@FindBy(xpath="//span[normalize-space()='Languages']")
	WebElement Languages;
	
	@FindBy(xpath="//a[normalize-space()='Add new']")
	WebElement AddNew;
	
	@FindBy(xpath="//input[@id='Name']")
	WebElement Name;
	
	@FindBy(xpath="//select[@id='LanguageCulture']")
	WebElement LanguageCulture;
	
	@FindBy(xpath="//input[@id='UniqueSeoCode']")
	WebElement UniqueCode;
	
	@FindBy(xpath="//span[@class='k-input']")
	WebElement FlagName;
	
	@FindBy(xpath="//select[@id='DefaultCurrencyId']")
	WebElement Currency;
	
	@FindBy(xpath="//input[@id='Published']")
	WebElement Published;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement Save;
	
	//Actions Methods...
	
	public void Configuration()
	{
		Configuration.click();
	}
	
	public void Languages()
	{
		Languages.click();
	}
	
	public void AddNew()
	{
		AddNew.click();
	}
	
	public void Name(String NM)
	{
		Name.sendKeys(NM);
	}
	
	public void LanguageCulture()
	{
		Select lc = new Select(LanguageCulture);
		lc.selectByValue("bn-BD");
	}
	
	public void UniqueCode(String UC)
	{
		UniqueCode.sendKeys(String.valueOf(UC));
	}
	
	public void FlagName()
	{
		Select fn= new Select(FlagName);
		fn.selectByIndex(20);
	}
	
	public void Currency()
	{
		Select cr = new Select (Currency);
		cr.selectByIndex(4);
				
	}
	
	public void Published()
	{
		boolean pb=Published.isSelected();
		if(pb==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	public void Save()
	{
		Save.click();
	}

}
