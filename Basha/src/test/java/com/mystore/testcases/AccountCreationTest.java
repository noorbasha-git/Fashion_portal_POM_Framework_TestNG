package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class AccountCreationTest extends BaseClass{
	IndexPage indpage;
	HomePage hmpage;
	LoginPage lgpage;
	AccountCreationPage acpage;
	
	@Parameters("browser")
	@BeforeMethod(groups="smoke")
	public void setup(String browser) {
		launchapp(browser);
	}
	
	@AfterMethod(groups="smoke")
	public void teardown() {
		driver.quit();
	}
	
	@Test(groups="smoke")
	public void verifyaccountpagetest() {
		indpage=new IndexPage();
		lgpage=indpage.signin();
		acpage=lgpage.createnewaccount(prop.getProperty("newaccount"));
		Assert.assertTrue(acpage.createaccountheadingvisible());
	}
	
	

}
