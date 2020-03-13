package com.fb.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.fb.pages.LoginPage;
import com.testbase.Testbase;

public class LoginPageTestcases extends Testbase{
	LoginPage loginpage;
	public LoginPageTestcases()
	{
		super();
	}
	@BeforeSuite
	public void setup() {
		initialization();
		loginpage= new LoginPage();
	}
	@Test
	public void VerifyTitleTest() {
		String title=loginpage.verifyTitle();
		Assert.assertEquals(title, "OrangeHRM");
		}
	@Test
	public void verifyLogintest() {
		loginpage.Logininfo();
		}

}
