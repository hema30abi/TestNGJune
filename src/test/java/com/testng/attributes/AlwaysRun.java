package com.testng.attributes;

import org.testng.annotations.Test;

public class AlwaysRun {


	@Test(alwaysRun=true)
	public void testMethod1() {
		System.out.println("Test Method 1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Test Method 2");
	}
}
