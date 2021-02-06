package com.CommerceAP.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProducts {
	
	WebDriver ldriver;
	
	public AddProducts(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body[1]/div[3]/div[2]/div[1]/ul[1]/li[2]/a[1]/span[1]")
	WebElement Catalog;
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")
	WebElement Products;
	
	@FindBy(xpath="//body/div[3]/div[3]/div[1]/form[1]/div[1]/div[1]/a[1]")
	WebElement AddNew;
	
	@FindBy(xpath="//input[@id='Name']")
	WebElement ProductName;
	
	@FindBy(xpath="//textarea[@id='ShortDescription']")
	WebElement ShortDesc;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement Save;
	
	//Actions Methods
	
	public void ClickCatelog()
	{
		Catalog.click();
	}
	
	public void ClickProducts()
	{
		Products.click();
	}
	
	public void ClickAddNew()
	{
		AddNew.click();
	}
	
	public void EntProductName(String PN)
	{
		ProductName.sendKeys(PN);
	}
	
	public void EntShortDesc(String SD)
	{
		ShortDesc.sendKeys(SD);
	}
	
	public void ClickSave()
	{
		Save.click();
	}

}
