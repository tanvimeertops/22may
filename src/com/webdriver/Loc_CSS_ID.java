package com.webdriver;
import org.openqa.selenium.By;
/*
 * CSS ID
 * syn:
 * tagname#id
 * input#user-name
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Loc_CSS_ID {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#user-name"))
	.sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#password"))
	.sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#login-button"))
	.click();
	Thread.sleep(2000);
	
	driver.close();
	
	
}
}
