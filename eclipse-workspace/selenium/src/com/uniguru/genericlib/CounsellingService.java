package com.uniguru.genericlib;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CounsellingService {
	public static void main(String[] args) {
	
	FirefoxDriver driver=new FirefoxDriver();
	 driver.get("https://uniguru.com");
	 driver.findElement(By.id("serviceTabA")).click();
	 //WebElement wb=driver.findElement(By.linkText("//a[text()='Admission guidance']"));
	//Select sel=new Select(wb);
	//sel.deselectByVisibleText("Admission guidance");
	
	
	
	 

	
	}	

}
