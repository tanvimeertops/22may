package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocID {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"H:\\Selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
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
