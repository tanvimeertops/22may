package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button"))
	.click();
	
	Thread.sleep(2000);
	
	WebDriverWait wait=new WebDriverWait(driver, 40);
	String msg=	wait.until(ExpectedConditions
				.visibilityOfElementLocated(
	By.xpath("//p[text()='WebDriver']"))).getText();
System.out.println(msg);
	
}
}
