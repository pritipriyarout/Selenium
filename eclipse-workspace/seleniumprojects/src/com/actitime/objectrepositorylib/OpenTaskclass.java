package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTaskclass {
@FindBy(linkText="Projects & Customers")
private WebElement 	CustomersAndProjectslink;

public void navigateToCustomersAndProjectspage()
{
	CustomersAndProjectslink.click();
}

}

