package com.CommerceAP.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddDiscounts {
	
	WebDriver ldriver;
	
	public AddDiscounts(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Finds Elements
	
	@FindBy(xpath="//span[normalize-space()='Promotions']")
	WebElement Promotions;
	
	@FindBy(xpath="//span[normalize-space()='Discounts']")
	WebElement Discounts;
	
	@FindBy(xpath="//a[normalize-space()='Add new']")
	WebElement AddNew;
	
	@FindBy(xpath="//input[@id='Name']")
	WebElement Name;
	
	@FindBy(xpath="//select[@id='DiscountTypeId']")
	WebElement DiscountType;
	
	@FindBy(xpath="//select[@id='DiscountLimitationId']")
	WebElement DiscountLimit;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement Save;
	
	//Action Methods
	
	public void Promotions()
	{
		Promotions.click();
	}
	
	public void Discounts()
	{
		Discounts.click();
	}
	
	public void AddNew()
	{
		AddNew.click();
	}
	
	public void Name(String NM)
	{
		Name.sendKeys(NM);
	}
	
	public void DiscountType()
	{
		Select Dis = new Select(DiscountType);
		Dis.selectByIndex(3);
		System.out.println(Dis.getOptions().size());
	}
	
	public void DiscountLimit()
	{
		Select DisL = new Select(DiscountLimit);
		DisL.selectByIndex(1);
		System.out.println(DisL.getOptions().size());
		
				
	}
	
	public void Save()
	{
		Save.click();
	}

}
