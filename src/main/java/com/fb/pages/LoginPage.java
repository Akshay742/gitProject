package com.fb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.Testbase;

public class LoginPage extends Testbase{
	@FindBy(id="txtUsername")
	WebElement userEmail;
	
	@FindBy(id="txtPassword")
	WebElement userPass;
	
	//@FindBy(id="btnLogin")
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyTitle()

	{
		return driver.getTitle();
	}
	public void Logininfo()
	{
		userPass.sendKeys(prop.getProperty("password"));
		userEmail.sendKeys(prop.getProperty("username"));
	}
	
}
