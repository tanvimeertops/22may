package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicXPath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/selenium-xpath.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	// //tagname[@attr_name='attr_value']
	
	driver.findElement(By.xpath("//input[@name='uid']"))
	.sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']"))
	.sendKeys("abc");
	
	// //tagname[text()='text_value']
	
String msg=	driver.findElement(By.xpath("//b[text()='Testing']")).getText();
	System.out.println("text is :"+msg);
	
	Thread.sleep(2000);
	driver.close();
}
}
