package com.CommerceAP.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import okhttp3.internal.connection.RouteSelector.Selection;

public class AddBestsellers {
	
	WebDriver ldriver;
	
	public AddBestsellers(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Finds Element
	
	@FindBy(xpath="//span[normalize-space()='Reports']")
	WebElement Reports;
	
	@FindBy(xpath="//span[normalize-space()='Bestsellers']")
	WebElement Bestsellers;
	
	@FindBy(xpath="//input[@id='StartDate']")
	WebElement StartDate;
	
	@FindBy(xpath="//input[@id='EndDate']")
	WebElement EndDate;
	
	@FindBy(xpath="//select[@id='StoreId']")
	WebElement Store;
	
	@FindBy(xpath="//select[@id='OrderStatusId']")
	WebElement OrderStatus;
	
	@FindBy(xpath="//select[@id='PaymentStatusId']")
	WebElement PaymentStatus;
	
	@FindBy(xpath="//select[@id='CategoryId']")
	WebElement Category;
	
	@FindBy(xpath="//select[@id='ManufacturerId']")
	WebElement Manufacturer;
	
	@FindBy(xpath="//select[@id='BillingCountryId']")
	WebElement BillingCountry;
	
	@FindBy(xpath="//select[@id='VendorId']")
	WebElement Vendor;
	
	@FindBy(xpath="//button[normalize-space()='Run report']")
	WebElement Runreport;
	
	
	//Actions Method
	
	public void Reports()
	{
		Reports.click();
	}
	public void Bestsellers()
	{
		Bestsellers.click();
	}
	public void StartDate(String SD)
	{
		StartDate.sendKeys(SD);
	}
	public void EndDate(String ED)
	{
		EndDate.sendKeys(ED);
	}
	public void Store()
	{
		Select sr=new Select(Store);
		sr.selectByIndex(2);
	}
	public void OrderStatus()
	{
		Select os = new Select(OrderStatus);
		os.selectByIndex(3);
	}
	public void PaymentStatus()
	{
		Select ps = new Select(PaymentStatus);
		ps.selectByIndex(3);
	}
	public void Category()
	{
		Select ct = new Select(Category);
		ct.selectByIndex(4);			
	}
	public void Manufacturer()
	{
		Select mf = new Select(Manufacturer);
		mf.selectByIndex(1);
	}
	public void BillingCountry()
	{
		Select bc = new Select(BillingCountry);
		bc.selectByIndex(1);
	}
	public void Vendor()
	{
		Select vd = new Select(Vendor);
		vd.selectByIndex(2);
	}
	public void Runreport()
	{
		Runreport.click();
	}
	
	

}
