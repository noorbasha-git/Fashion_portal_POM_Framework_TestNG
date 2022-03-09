package com.mystore.utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;

public class Listener extends ExtentManager implements ITestListener{
	
	 public  void onTestStart(ITestResult result) {
		 test=extentrepo.createTest(result.getName());
		 test.createNode(result.getName());
		    
		  }
	 
	 public void onTestSuccess(ITestResult result) {
		 if(result.getStatus()==ITestResult.SUCCESS) {
			 test.log(Status.PASS,"the pass test name is"+result.getName());
		 }
		   
		  }
	
	public void onTestFailure(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL,"filed test case is"+result.getName());
			try {
				String path=Screenshot.takescreenshot(result.getName());
				test.addScreenCaptureFromPath(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	  
	  }}
	public void onTestSkipped(ITestResult result) {
		if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, "this test got skipped"+result.getName());
			    
			  }
}}
