package com.CommerceAP.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCategories {
	
	WebDriver ldriver;
	
	public AddCategories(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Finds Elements 
	
	@FindBy(xpath="//body[1]/div[3]/div[2]/div[1]/ul[1]/li[2]/a[1]/span[1]")
	WebElement Catalog;
	
	@FindBy(xpath="//span[contains(text(),'Categories')]")
	WebElement Categories;
	
	@FindBy(xpath="//body/div[3]/div[3]/div[1]/div[1]/div[1]/a[1]")
	WebElement AddNew;
	
	@FindBy(xpath="//input[@id='Name']")
	WebElement Name;
	
	@FindBy(xpath="//select[@id='ParentCategoryId']")
	WebElement ParentCat;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement Save;
	
	
	//Action Methods 
	public void ClickCatalog()
	{
		Catalog.click();
	}
	
	public void ClickCategories()
	{
		Categories.click();
	}
	
	public void ClickAddNew()
	{
		AddNew.click();
	}
	
	public void EntName(String NM)
	{
		Name.sendKeys(NM);
	}
	
	public void SelParentCat()
	{
	Select PC = new Select(ParentCat);
	PC.selectByIndex(5);
	
	}
	
	public void clickSave()
	{
		Save.click();
	}

}
