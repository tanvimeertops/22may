package com.webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotDemo {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.id("user-name"))
	.sendKeys("locked_out_user");
	Thread.sleep(2000);
	
	driver.findElement(By.id("password"))
	.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	
	for (int i = 1; i < 3; i++) {
		
	
	File file=((RemoteWebDriver) driver)
			.getScreenshotAs(OutputType.FILE);
	Files.copy(file, new File("H:\\Selenium\\SS\\2"+i+"jan.jpg"));
	driver.close();
	}
}
}
