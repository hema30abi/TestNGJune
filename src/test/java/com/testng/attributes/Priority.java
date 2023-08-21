package com.testng.attributes;

import org.testng.annotations.Test;

public class Priority {
	//can we use same priority number, in two tc's?
	//can we declare the priority as 0? If yes, then when it will execute?
	//can we declare the negative values in priority?
	
	@Test(priority=1, groups="smoke")
	public void testOne() {
		System.out.println("Test priority 1");
	}

	@Test(priority=2, groups="regression")
	public void sampleMethod() {
		System.out.println("Test priority 2");
	}
	
	@Test(priority=3)
	public void display() {
		System.out.println("Test 3");
	}
	
	@Test(priority=4)
	public void testTwo() {
		System.out.println("Test 4");
	}
	
	@Test(priority=2)
	public void sameMethod() {
		System.out.println("Test 5");
	}
	
	@Test(priority=0)
	public void testThree() {
		System.out.println("Test 6");
	}
	
	@Test(priority=-4)
	public void testFour() {
		System.out.println("Test 7");
	}
	
	@Test(priority=-1)
	public void sameMethod1() {
		System.out.println("Test 8");
	}
}
