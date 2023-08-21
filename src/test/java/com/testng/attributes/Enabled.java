package com.testng.attributes;

import org.testng.annotations.Test;

public class Enabled {

	@Test
	public void sampleMethod1() {
		System.out.println("Sample Method 1");
	}
	
	@Test(enabled=true)
	public void sampleMethod2() {
		System.out.println("Sample Method 2");
	}
}
