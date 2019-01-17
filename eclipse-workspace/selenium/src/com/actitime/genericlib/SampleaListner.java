package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleaListner implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult t) {
	String Failedtestname=t.getMethod().getMethodName();
	System.out.println( Failedtestname);
	EventFiringWebDriver d=new EventFiringWebDriver(BaseClass.driver);
	File srcimg=d.getScreenshotAs(OutputType.FILE);
	File destfile=new File("./screenshot/"+Failedtestname+".png");
	try
	{
		FileUtils.copyFile(srcimg, destfile);
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}
	}
	
			
	
	
	

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
