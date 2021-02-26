package com.CommerceAP.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddDiscounts {
	
	WebDriver ldriver;
	
	public AddDiscounts(WebDriver rdriver)
	{
<<<<<<< HEAD
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='Promotions']")
	WebElement Promotions;
	
	@FindBy(xpath="//a[@href='/Admin/Discount/List']")
=======
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Finds Elements
	
	@FindBy(xpath="//span[normalize-space()='Promotions']")
	WebElement Promotions;
	
	@FindBy(xpath="//span[normalize-space()='Discounts']")
>>>>>>> da3de8890f963ee2ccb7680aed8ed0105194338d
	WebElement Discounts;
	
	@FindBy(xpath="//a[normalize-space()='Add new']")
	WebElement AddNew;
	
	@FindBy(xpath="//input[@id='Name']")
	WebElement Name;
	
	@FindBy(xpath="//select[@id='DiscountTypeId']")
	WebElement DiscountType;
	
<<<<<<< HEAD
	@FindBy(xpath="//input[@title='0.0000 USD']")
	WebElement DiscountAmount;
	
	@FindBy(xpath="//input[@id='StartDateUtc']")
	WebElement StartDate;
	
	@FindBy(xpath="//input[@id='EndDateUtc']")
	WebElement EndDate;
	
	@FindBy(xpath="//select[@id='DiscountLimitationId']")
	WebElement DiscountLimit;
	
	@FindBy(xpath="//textarea[@id='AdminComment']")
	WebElement AdminComment;
	
=======
	@FindBy(xpath="//select[@id='DiscountLimitationId']")
	WebElement DiscountLimit;
	
>>>>>>> da3de8890f963ee2ccb7680aed8ed0105194338d
	@FindBy(xpath="//button[@name='save']")
	WebElement Save;
	
	//Action Methods
	
	public void Promotions()
	{
		Promotions.click();
	}
	
	public void Discounts()
	{
		Discounts.click();
	}
	
	public void AddNew()
	{
		AddNew.click();
	}
	
	public void Name(String NM)
	{
		Name.sendKeys(NM);
	}
	
	public void DiscountType()
	{
		Select Dis = new Select(DiscountType);
		Dis.selectByIndex(3);
<<<<<<< HEAD
	}
	
	public void StartDate(String SD)
	{
		StartDate.sendKeys(SD);
	}
	
	public void EndDate(String ED)
	{
		EndDate.sendKeys(ED);
=======
		System.out.println(Dis.getOptions().size());
>>>>>>> da3de8890f963ee2ccb7680aed8ed0105194338d
	}
	
	public void DiscountLimit()
	{
		Select DisL = new Select(DiscountLimit);
		DisL.selectByIndex(1);
<<<<<<< HEAD
	}
	
	public void AdminComment(String Ad)
	{
		AdminComment.sendKeys(Ad);
	}
	
	public void Save() 
=======
		System.out.println(DisL.getOptions().size());
		
				
	}
	
	public void Save()
>>>>>>> da3de8890f963ee2ccb7680aed8ed0105194338d
	{
		Save.click();
	}

}
