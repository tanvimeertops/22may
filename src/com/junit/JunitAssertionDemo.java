package com.junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAssertionDemo {

	@Ignore
	@Test
	public void test1() {
		int a=10,b=20;
		Assert.assertTrue(a<b);
		Assert.assertFalse(a>b);
	}

	@Ignore
	@Test
	public void test2() {
		int a=10;
		int b=11;
		String s1="swara";
		String s2="tops";
		
//		Assert.assertEquals(a, b);
		Assert.assertNotEquals(s1, s2);
	}
	
	@Ignore
	@Test
	public void test3() {
		String s1="tops";
		String s2="Tops";
		int a=10,b=10;
//		Assert.assertSame(s2, s1);
//		Assert.assertNotSame(s1, s2);
		
		Assert.assertSame(a, b);
	}
	@Ignore
	@Test
	public void test4() {
		String s1=null;
		
//		Assert.assertNull(s1);
		Assert.assertNotNull(s1);
	}
	
	@Ignore
	@Test
	public void test5() {
		int[] a= {1,2,3};
		int[] b= {1,2};
		
		Assert.assertArrayEquals(a, b);
	}
	
	@Test
	public void selfFailed() {
		fail("self failed by tanvi");
	}
}
