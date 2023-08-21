package com.parameters.dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {

	@Test
	public void hardAssert() {
		String name = "Ayesha";
		Assert.assertEquals(name, "Ayesha");
		System.out.println("Hard Assertion Completed");
	}
	
	@Test
	public void softAssert() {
		SoftAssert verify = new SoftAssert();
		String name = "Hema";
		verify.assertEquals(name, "hema");
		System.out.println("Soft Assertion Completed");
	}
}
