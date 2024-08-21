package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EleDynamicWebTable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"H:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
Thread.sleep(2000);

List<WebElement>tr=	driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	System.out.println("no of row :"+tr.size());
	
	List<WebElement>th= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	System.out.println("no of col :"+th.size());
	
	for (int i = 1; i <=tr.size(); i++) {
		for (int j = 1; j <=th.size(); j++) {
		String data=	driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print("  |  "+data);
		}
		System.out.println();
		
		
		
		
		
		
		
		Thread.sleep(2000);
	}
}
}
