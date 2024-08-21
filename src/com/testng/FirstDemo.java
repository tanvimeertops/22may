package com.testng;

import static org.testng.Assert.fail;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class FirstDemo {

	@Test
	public void test1() {
		System.out.println("this test pass");
	}
	
	@Test
	public void test2() {
		System.out.println("this test fail");
		fail();
	}
	
	@Test
	public void test3() {
		System.out.println("skip test");
		throw new SkipException("self skip");
	}
}
