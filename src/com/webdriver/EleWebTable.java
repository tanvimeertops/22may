package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EleWebTable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"H:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
		driver.get("file:///C:\\Users\\tops\\eclipse-workspace\\Selenium_22_May\\src\\com\\webdriver\\index3.html");
Thread.sleep(2000);

 		for (int i = 2; i <=5; i++) {
		for (int j = 1; j <=4; j++) {
			
	String data=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
	System.out.print("   |  "+data);
	
	
 		}
		System.out.println();
		Thread.sleep(2000);
 		}
}
}
