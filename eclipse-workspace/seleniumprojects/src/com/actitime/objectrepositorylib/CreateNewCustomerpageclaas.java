package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomerpageclaas {
@FindBy(name="name")
private WebElement customerNameEdt;
@FindBy(name="description")
private WebElement customerdescriptionEdt;
@FindBy(name="createCustomerSubmit")
private WebElement createcustomersubmitbutton;
public void createcustomer(String customerName)
{
	customerNameEdt.sendKeys(customerName);	
	createcustomersubmitbutton.click();
}
public void createcustomer(String customerName,String desc)
{
	customerNameEdt.sendKeys(customerName);	
	customerdescriptionEdt.sendKeys(desc);
	createcustomersubmitbutton.click();
}
}
