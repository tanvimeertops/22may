package com.testng;

import org.testng.annotations.Test;

public class SecondDemo {

	@Test(priority = 2)
	public void test() {
		System.out.println("this is test");
	}
	
	@Test(priority = 1)
	public void best() {
		System.out.println("this is best");
	}
	
	@Test
	public void fest() {
		System.out.println("this is fest");
	}
	
	@Test(priority = 0)
	public void nest() {
		System.out.println("this is nest");
	}
}
