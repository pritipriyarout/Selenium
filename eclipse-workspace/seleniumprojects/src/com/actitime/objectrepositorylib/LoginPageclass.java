package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageclass {
@FindBy(name="username")
private WebElement usernameEdt;
@FindBy(name="pwd")
private WebElement passwordEdt;
@FindBy(id="loginButton")
private WebElement loginbutton;
public WebElement getUsernameEdt() {
	return usernameEdt;
}
public WebElement getPasswordEdt() {
	return passwordEdt;
}

public WebElement getLoginbutton() {
	return loginbutton;
}
public void login(String username,String password)
{
	usernameEdt.sendKeys(username);
	passwordEdt.sendKeys(password);
	loginbutton.click();
	
	
}
}
