package com.CommerceAP.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewVendor {
	
	
	WebDriver ldriver;
	
	public AddNewVendor(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//a[@href='#']//span[contains(text(),'Customers')]")
	WebElement Customers;
	
	@FindBy(xpath="//span[normalize-space()='Vendors']")
	WebElement Vendors;
	
	@FindBy(xpath="//a[normalize-space()='Add new']")
	WebElement AddNew;
	
	@FindBy(xpath="//span[@class='onoffswitch-inner']")
	WebElement Basic;
	
	@FindBy(xpath="//*[@id='Name']")
	WebElement Name;
	
	@FindBy(xpath="//*[@id=\"tinymce\"]")
	WebElement Description;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='Active']")
	WebElement Active;
	
	@FindBy(xpath="//select[@id='Address_CountryId']")
	WebElement Country;
	
	@FindBy(xpath="//select[@id='Address_StateProvinceId']")
	WebElement State;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement Save;
	
	//Actions Methods
	
	public void Customers()
	{
		Customers.click();
	}
	
	public void Vendors()
	{
		Vendors.click();
	}
	
	public void AddNew()
	{
		AddNew.click();
	}
	
	public void Basic()
	{
		Basic.click();
	}
	
	public void Name(String NM)
	{
		Name.sendKeys("NM");
	}
	
	public void Description(String Des)
	{
		Description.sendKeys("Des");
	}
	
	public void Email(String EM)
	{
		Email.sendKeys(EM);
	}
	
	public void Active()
	{
		boolean AC=Active.isSelected();
		
		if(AC==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void Counrty()
	{
		Select con = new Select(Country);
		con.selectByIndex(1);
				
	}
	
	public void State()
	{
		Select st = new Select(State);
		st.selectByIndex(16);
				
	}
	
	public void Save()
	{
		Save.click();
	}
	
	

}
