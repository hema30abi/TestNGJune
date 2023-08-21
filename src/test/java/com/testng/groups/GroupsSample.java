package com.testng.groups;

import org.testng.annotations.Test;

public class GroupsSample {

	@Test(groups="regression")
	public void test1() {
		System.out.println("Test 1");
	}
	@Test(groups= {"smoke", "regression", "LoginPage"})
	public void test2() {
		System.out.println("Test 2");
	}
	@Test(groups= {"sanity", "regression", "smoke", "CheckoutPage"})
	public void test3() {
		System.out.println("Test 3");
	}
	@Test(groups= {"sanity", "regression", "HomePage"})
	public void test4() {
		System.out.println("Test 4");
	}
	@Test(groups= {"smoke", "sanity"})
	public void test5() {
		System.out.println("Test 5");
	}
	@Test(groups= {"smoke", "regression", "LoginPage"})
	public void test6() {
		System.out.println("Test 6");
	}
	@Test(groups = {"regression", "LoginPage"})
	public void test7() {
		System.out.println("Test 7");
	}
}
