package com.CommerceAP.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddAffiliate {
	WebDriver ldriver;
	
	public AddAffiliate(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Finds Elements 
	
	@FindBy(xpath="//span[normalize-space()='Promotions']")
	WebElement Promotions;
	
	@FindBy(xpath="//span[normalize-space()='Affiliates']")
	WebElement Affiliates;
	
	@FindBy(xpath="//a[normalize-space()='Add new']")
	WebElement AddNew;
	
	@FindBy(xpath="//input[@id='Address_FirstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='Address_LastName']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@id='Address_Email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='Address_Company']")
	WebElement Company;
	
	@FindBy(xpath="//select[@id='Address_CountryId']")
	WebElement Country;
	
	@FindBy(xpath="//select[@id='Address_StateProvinceId']")
	WebElement State;
	
	@FindBy(xpath="//input[@id='Address_County']")
	WebElement Region;
	
	@FindBy(xpath="//input[@id='Address_City']")
	WebElement City;
	
	@FindBy(xpath="//input[@id='Address_Address1']")
	WebElement Address;
	
	@FindBy(xpath="//input[@id='Address_ZipPostalCode']")
	WebElement Zip;
	
	@FindBy(xpath="//input[@id='Address_PhoneNumber']")
	WebElement PhoneNumber;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement Save;
	
	//Actions Methods...
	
	public void Promotions()
	{
		Promotions.click();
	}
	
	public void Affiliates()
	{
		Affiliates.click();
	}
	
	public void AddNew()
	{
		AddNew.click();
	}
	
	public void FirstName(String FN)
	{
		FirstName.sendKeys(FN);
	}
	
	public void LastName(String LN)
	{
		LastName.sendKeys(LN);
	}
	
	public void Email(String EM)
	{
		Email.sendKeys(EM);
	}
	
	public void Company(String Com)
	{
		Company.sendKeys(Com);
	}
	
	public void Country()
	{
		Select con = new Select(Country);
		con.selectByIndex(1);
	}
	
	public void State()
	{
		Select st = new Select(State);
		st.selectByValue("16");
	}
	
	public void Region(String Rg)
	{
		Region.sendKeys(Rg);
	}
	
	public void City(String ct)
	{
		City.sendKeys(ct);
	}
	
	public void Address(String ad)
	{
		Address.sendKeys(ad);
	}
	
	public void Zip(int zp)
	{
		Zip.sendKeys(String.valueOf(zp));
	}
	
	public void PhoneNumber(int pn)
	{
		PhoneNumber.sendKeys(String.valueOf(pn));
	}
	
	public void Save()
	{
		Save.click();
	}

}
