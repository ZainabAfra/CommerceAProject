package com.CommerceAP.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewsItems {
	
	WebDriver ldriver;
	
	public AddNewsItems(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//p[normalize-space()='Content management']")
	WebElement ContentManagement;
	
	@FindBy(xpath="//p[normalize-space()='News items']")
	WebElement NewsItems;
	
	@FindBy(xpath="//a[normalize-space()='Add new']")
	WebElement AddNew;
	
	@FindBy(xpath="//input[@id='Title']")
	WebElement Title;
	
	@FindBy(xpath="//textarea[@id='Short']")
	WebElement ShortDis;
	
	@FindBy(xpath="//input[@id='AllowComments']")
	WebElement AllowComnd;
	
	@FindBy(xpath="//input[@id='StartDateUtc']")
	WebElement StartDate;
	
	@FindBy(xpath="//input[@id='EndDateUtc']")
	WebElement EndDate;
	
	@FindBy(xpath="//input[@id='Published']")
	WebElement Published;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement Save;
	
	//Action Methods
	
	public void ContentManagement()
	{
		ContentManagement.click();
	}
	public void NewsItems()
	{
		NewsItems.click();
	}
	public void AddNew()
	{
		AddNew.click();
	}
	public void Title(String TL)
	{
		Title.sendKeys(TL);
	}
	public void ShortDisc(String SED)
	{
		ShortDis.sendKeys(SED);
	}
	public void AllowComnd()
	{
		boolean ac=AllowComnd.isSelected();
		if(ac==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	public void StartDate(String SD)
	{
		StartDate.sendKeys(SD);
	}
	public void EndDate(String ED)
	{
		EndDate.sendKeys(ED);
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
