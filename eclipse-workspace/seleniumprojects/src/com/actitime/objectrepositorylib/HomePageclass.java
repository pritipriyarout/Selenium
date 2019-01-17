package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageclass {
@FindBy(xpath="//div[text()='Tasks']/..")
private WebElement taskImg;
@FindBy(xpath="//div[text()='Users']/..")
private WebElement userImg;
public void navigateToTaskPage()
{
taskImg.click();
}
public void navigateTouserPage()
{
userImg.click();
}
}
	




