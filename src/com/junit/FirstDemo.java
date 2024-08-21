package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstDemo {
	
@Test	
public void test() {
	System.out.println("this test is pass");
}

@Test
public void test2() {
	System.out.println("fail test");
	fail();
}

}
