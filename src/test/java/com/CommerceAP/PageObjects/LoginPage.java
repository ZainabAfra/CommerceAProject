package com.CommerceAP.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) // Created Constructor 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	// Finds Elements 
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement Password;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement Login;
	 
	
	//Action Methods
	
	public void EnterEmail(String EM)
	{
		Email.clear();
		Email.sendKeys("admin@yourstore.com");
	}
	
	public void EnterPassword(String pwd)
	{
		Password.clear();
		Password.sendKeys("admin");
	}
	
	public void ClickLogin()
	{
		Login.click();
	}

}
