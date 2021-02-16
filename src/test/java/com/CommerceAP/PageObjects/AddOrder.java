package com.CommerceAP.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddOrder {
	
	WebDriver ldriver;
	
	public AddOrder(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Sales')]")
	WebElement Sales;
	
	@FindBy(xpath="//span[contains(text(),'Orders')]")
	WebElement Orders;
	
	@FindBy(xpath="//div[contains(text(),'Search')]")
	WebElement Search;
	
	@FindBy(xpath="//span[@class=\"k-select\"][contains(@aria-controls,'StartDate_dateview')]")
	WebElement StartDate;
	
	@FindBy(xpath="//a[@class='k-link'][contains(@data-value,'2021/1/10')]")
	WebElement SDay;
	
	String month="March 2021";
	String day = "15";
	
	@FindBy(xpath="//span[@class=\"k-select\"][contains(@aria-controls,'EndDate_dateview')]")
	WebElement EndDate;
	
	
	@FindBy(xpath="//*[@id=\"cdf00703-7d8b-4134-8826-7439c3e6c2f4\"]/div[1]/a[2]")
	WebElement Month;
	
	@FindBy(xpath="//*[@id=\"cdf00703-7d8b-4134-8826-7439c3e6c2f4\"]/div[1]/a[3]/span")
	WebElement Arraw;
	
	@FindBy(xpath="//body[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr/td[contains(text(),'15')]")
	WebElement SpicelDate;
	
	@FindBy(xpath="//a[@class='k-link'][contains(@data-value,'2021/4/15')]")
	WebElement EDay;
	
	
	// Action Methods 
	
	public void ClickSales()
	{
		Sales.click();
	}

	public void ClickOrders()
	{
		Orders.click();
	}
	
	public void ClickSearch()
	{
		Search.click();
	}
	
	public void SelStartDate()
	{
		StartDate.click();
	}
	
	public void ClickSDay()
	{
		SDay.click();
	}
	
	public void SEndDate()
	{
		EndDate.click();
	}
	
	public void Month()
	{
		while(true)
		{
		String text=Month.getText();
		
		if(text.equals(month))
		{
			break;
		}
		else 
		{
			Arraw.click();
			
		}
		
		}
		
	}
	 
	public void Arraw()
	{
		Arraw.click();
	}
	
	
	
	
	public void SpicelDate()
	{
		SpicelDate.click();
	}
	
	
	public void ClickEDay()
	{
		EDay.click();
	}
	
	
}
