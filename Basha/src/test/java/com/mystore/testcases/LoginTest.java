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
import com.mystore.utilities.Log;

//import net.jodah.failsafe.internal.util.Assert;

public class LoginTest extends BaseClass {
	
	IndexPage indpage;
	LoginPage lgpage;
	HomePage hmpage;
	@Parameters("browser")
	@BeforeMethod(groups="smoke")
	public void setup(String browser) {
		launchapp(browser);
	}
	
	@AfterMethod(groups="smoke")
	public void teardown() {
		driver.quit();
	}
	
	@Test(dataProvider="logincredentials",groups="smoke")
	public void logintest(String user,String pass) throws InterruptedException {
		indpage=new IndexPage();
		Log.log.info("this is the login page");
		lgpage=indpage.signin();
		Log.log.info("entered userid &pass");
		Thread.sleep(2000);
		hmpage=lgpage.login(user,pass);
		Log.log.info("loggedin successfully");
		Assert.assertTrue(hmpage.validatewishlist());
		
		
		
		
	}
	
	

}
