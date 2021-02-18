package com.CommerceAP.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomers {
	
	WebDriver ldriver;
	
	public AddCustomers(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	//Find Elements 
	
	@FindBy(xpath="//a[@href='#']//span[contains(text(),'Customers')]")
	WebElement Customers;
	
	@FindBy(xpath="//span[@class='menu-item-title'][normalize-space()='Customers']")
	WebElement addCustomers;
	
	@FindBy(xpath="//a[normalize-space()='Add new']")
	WebElement AddNew;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@id='Gender_Male']")
	WebElement Gender;
	
	@FindBy(xpath="//input[@id='DateOfBirth']")
	WebElement DoB;
	
	@FindBy(xpath="//div[10]//div[2]//div[1]//div[1]//div[1]")
	WebElement CustomerRoles;
	
	@FindBy(xpath="//select[@id='VendorId']")
	WebElement Vendor;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement Save;
	
	
	//Actions Methods
	
	public void Customers()
	{
		Customers.click();
	}
	
	public void addCustomers()
	{
		addCustomers.click();
	}
	
	public void AddNew()
	{
		AddNew.click();
	}
	
	public void Email(String EM)
	{
		Email.sendKeys(EM);
	}
	
	public void Password(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void FirstName(String FN)
	{
		FirstName.sendKeys(FN);
	}
	
	public void LastName(String LN)
	{
		LastName.sendKeys(LN);
	}
	
	public void Gender()
	{
		Gender.click();
	}
	
	public void DOB(String DB)
	{
		DoB.sendKeys(DB);
	}
	
	public void vendor()
	{
		Select ven = new Select(Vendor);
		ven.selectByIndex(2);
	}
	
	public void Save()
	{
		Save.click();
	}

}
