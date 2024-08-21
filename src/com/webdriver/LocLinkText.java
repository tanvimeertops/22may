package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocLinkText {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"H:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("email")).sendKeys("tanvi@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Forgotten password?"))
	.click();
	
	Thread.sleep(5000);
	
	driver.close();
}
}
