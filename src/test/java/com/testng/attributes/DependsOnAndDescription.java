package com.testng.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnAndDescription {

	@Test
	public void addToCart() {
		System.out.println("Product added into the Cart");
	}
	
	@Test
	public void login() {
		Assert.assertTrue(false);
		System.out.println("User logged in");
	}
	
	@Test(dependsOnMethods = "login", description="This method depends on login method")
	public void checkout() {
		System.out.println("Checkout the Product");
	}
	
	// If we want to add different class methods in dependsOnMethods then, we have to give
	// packageName.ClassName.methodName
//	@Test(dependsOnMethods = "com.testng.attributes.Enabled.sampleMethod1")
//	public void checkout() {
//		System.out.println("Checkout the Product");
//	}
}
