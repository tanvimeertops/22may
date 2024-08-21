package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"H:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("file:///C:\\Users\\tops\\eclipse-workspace\\Selenium_22_May\\src\\com\\webdriver\\index1.html");
	driver.get("https://www.geeksforgeeks.org/");
	Thread.sleep(2000);
//	driver.findElement(By.partialLinkText("Click")).click();
	driver.findElement(By.partialLinkText("d")).click();
	Thread.sleep(2000);
	driver.close();
}
}
