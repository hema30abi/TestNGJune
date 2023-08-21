package com.testng.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("Test Method 1");
	}
	
	@Ignore
	@Test
	public void testMethod2() {
		System.out.println("Test Method 2");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Test Method 3");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
