package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime {

	public static void main(String[] args) throws Throwable {
     FirefoxDriver driver=new FirefoxDriver();
     driver.get("http://localhost/login.do");
     driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.name("pwd")).sendKeys("manager");
     driver.findElement(By.id("loginButton")).click();
     Thread.sleep(4000);
     driver.findElement(By.xpath("//a[@class='content tasks']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[text()='Add New']")).click();
     driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("customerLightBox_nameField")).sendKeys("sukanya123");
     driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("Logout")).click();
     

	}

}
