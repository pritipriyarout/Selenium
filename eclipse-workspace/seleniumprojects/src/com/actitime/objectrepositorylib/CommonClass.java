package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonClass {
	@FindBy(linkText="Logout")
	private WebElement logout;
	public void logout()
	{
		logout.click();
	}

}
