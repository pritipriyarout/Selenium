package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndCustomerPageclass {
@FindBy(xpath="//input[@value='Create New Customer']") 
private WebElement createcustomerbutton;
public void navigatecreatenewcustomerpage()
{
	createcustomerbutton.click();
}
}
