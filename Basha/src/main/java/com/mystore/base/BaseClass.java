package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.mystore.actiondriver.Actions;
import com.mystore.utilities.ExtentManager;
import com.mystore.utilities.Readexcel;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;
	public static Readexcel exe;
	
	
	
	
	@AfterSuite(groups={"smoke","sanity"})
	public void endextent() {
		ExtentManager.endreport();
	}

	@BeforeSuite(groups={"smoke","sanity"})
	public void loadconfig() throws IOException {
		ExtentManager.setextent();
		
		
		exe=new Readexcel();
		
		
		

		prop = new Properties();

		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\configuration\\config.properties");
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Configration file not found");
		}

		// System.out.println(prop.getProperty("url"));
	}

	@SuppressWarnings("deprecation")
	public void launchapp(String browser) {
		//String browser=brows;

		if (browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		if (browser.contains("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.get(prop.getProperty("url"));
		Actions.implicitwait(driver, 10);

		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
	}
	
	
	
	@DataProvider(name="logincredentials")
	public Object[][] dataprovider() throws IOException{
		
		Object[][] obj=exe.readexceldata();
		return obj;
	}
}
