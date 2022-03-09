package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class HomePageTest extends BaseClass {
	HomePage hmpage;
	LoginPage lgpage;
	IndexPage indpage;
	
	
	@Parameters("browser")
	@BeforeMethod(groups={"smoke","regression"})
	public void setup(String browser) {
		launchapp(browser);
	}
	
	
	@AfterMethod(groups={"smoke","regression"})
	public void teardown() {
		driver.quit();
	}
	
	@Test(groups={"smoke","regression"})
	public void validateorderhistory() {
		indpage=new IndexPage();
		lgpage=indpage.signin();
		hmpage=lgpage.login(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertTrue(hmpage.validateorderhistory());
		
		
	}
	
	@Test(groups={"smoke","regression"})
	public void validatewishlist() {
		indpage=new IndexPage();
		lgpage=indpage.signin();
		hmpage=lgpage.login(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertTrue(hmpage.validatewishlist());
		
		
	}

}
