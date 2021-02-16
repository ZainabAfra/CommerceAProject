package com.CommerceAP.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class AddShipments {
	
	
	WebDriver ldriver;
	
	public AddShipments(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Finds Elements
	
	@FindBy(xpath="//span[normalize-space()='Sales']")
	WebElement Sales;
	
	@FindBy(xpath="//span[normalize-space()='Shipments']")
	WebElement Shipments;
	
	@FindBy(xpath="//input[@id='StartDate']")
	WebElement StartDate;
	
	@FindBy(xpath="//input[@id='EndDate']")
	WebElement EndDate;
	
	@FindBy(xpath="//input[@id='TrackingNumber']")
	WebElement TrackingNumber;
	
	@FindBy(xpath="//select[@id='WarehouseId']")
	WebElement Warehouse;
	
	@FindBy(xpath="//input[@id='LoadNotDelivered']")
	WebElement LoadNot;
	
	@FindBy(xpath="//select[@id='CountryId']")
	WebElement Country;
	
	@FindBy(xpath="//select[@id='StateProvinceId']")
	WebElement State;
	
	@FindBy(xpath="//input[@id='County']")
	WebElement Region;
	
	@FindBy(xpath="//input[@id='City']")
	WebElement City;
	
	@FindBy(xpath="//button[normalize-space()='Search']")
	WebElement Search;
	
	//Actions Methods 
	
	
	public void ClickSales()
	{
		Sales.click();
	}
	
	public void ClickShipments()
	{
		Shipments.click();
	}
	
	public void SelStartDate(String SD)
	{
		StartDate.sendKeys(SD);
	}
	
	public void SelEndDate(String ED)
	{
		EndDate.sendKeys(ED);
	}
	
	public void EntTrackingNumber(String TN)
	{
		TrackingNumber.sendKeys(TN);
	}
	
	public void SelWarehouse()
	{
		Select sel = new Select(Warehouse);
		sel.selectByIndex(1);
				
	}
	
	public void LoadNot()
	{
		LoadNot.click();
	}
	
	public void SelCountry()
	{
		Select Cnt = new Select(Country);
		Cnt.selectByIndex(1);
		
	}
	
	public void SelState()
	{
		Select St = new Select(State);
		St.selectByValue("6");
				
	}
	
	public void EntRegion(String RG)
	{
		Region.sendKeys(RG);
	}
	
	public void EntCity(String CT)
	{
		City.sendKeys(CT);
	}
	
	public void ClickSearch()
	{
		Search.click();
	}

}
