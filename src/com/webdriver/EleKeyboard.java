package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class EleKeyboard {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement email=driver.findElement(By.name("email"));
	
	Actions actions=new Actions(driver);
	
	Action a1=actions.moveToElement(email)
			.keyDown(email, Keys.SHIFT)
			.sendKeys("tanvi")
			.keyUp(email,Keys.SHIFT)
			.doubleClick()
			.contextClick()
			.build();
	
	a1.perform();
}
}
