package com.mystore.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mystore.base.BaseClass;

public class Screenshot {
	//WebDriver Sriver=BaseClass.driver;
	
	public static String takescreenshot(String filename) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String targetpath=System.getProperty("user.dir")+"\\screenshots\\"+filename+".png";
	FileUtils.copyFile(source,new File(targetpath) );
	return targetpath;
		
	}

}
