package com.CommerceAP.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmailAccount {
	
	WebDriver ldriver;
	
	public AddEmailAccount(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Finds Elements
	
	@FindBy(xpath="//p[normalize-space()='Configuration']")
	WebElement Configuration;
	
	@FindBy(xpath="//p[normalize-space()='Email accounts']")
	WebElement Emailaccount;
	
	@FindBy(xpath="//a[normalize-space()='Add new']")
	WebElement AddNew;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='DisplayName']")
	WebElement EmailName;
	
	@FindBy(xpath="//input[@id='Host']")
	WebElement Host;
	
	@FindBy(xpath="//input[@title='25 ']")
	WebElement Port;
	
	@FindBy(xpath="//input[@id='Username']")
	WebElement User;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='EnableSsl']")
	WebElement SSL;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement Save;
	
	//Action Methods
	
	public void Configuration()
	{
		Configuration.click();
	}
	
	public void Emailaccounts()
	{
		Emailaccount.click();
	}
	
	public void AddNew()
	{
		AddNew.click();
	}
	
	public void Email(String EM)
	{
		Email.sendKeys(EM);
	}
	
	public void EmailName(String EN)
	{
		EmailName.sendKeys(EN);
	}
	
	public void Host(int Ht)
	{
		Host.sendKeys(String.valueOf(Ht));
	}
	
	public void Port(int pt)
	{
		
		Port.sendKeys(String.valueOf(pt));
	}
	
	public void User(String ur)
	{
		User.sendKeys(ur);
	}
	
	public void Password(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void SSL()
	{
		SSL.click();
	}
	
	public void Save()
	{
		Save.click();
	}
			
	

}
