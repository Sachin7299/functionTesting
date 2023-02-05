package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class LogInPage extends Testbase 
{

	public LogInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//email Address
	@FindBy(xpath="//input[@name='username']")
	private WebElement email_address;
	
	public void enterEmailAddress(String email)
	{
		email_address.sendKeys(email);
	}
	
	//Password
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	//Loginbutton
	@FindBy(xpath="//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-1usxxvf']")
	private WebElement login_btn;
	
	public void clickOnLoginButton()
	{
		login_btn.click();;
	}
}


