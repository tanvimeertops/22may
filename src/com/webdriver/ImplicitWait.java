package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitWait {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://www.saucedemo.com/");
	/*The Implicit Wait in Selenium 
	is used to tell the web driver 
	to wait for a certain amount of time 
	before it throws a “No Such Element Exception”.*/
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.id("user-name"))
	.sendKeys("standard_user");
	Thread.sleep(2000);
	
	driver.findElement(By.id("password"))
	.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	driver.close();
}
}
