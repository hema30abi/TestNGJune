package com.testng.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class AttributesTwo extends BaseClass{

//	@Test(timeOut=20000)
//	public void searchJava() {
//		browserOpen("chrome");
//		loadUrl("https://www.google.com/");
//		WebElement search = driver.findElement(By.name("q"));
//		dataSend(search, "Java");
//	}
	
	@Test(invocationCount=3, invocationTimeOut=60000)
	public void searchJava() {
		browserOpen("chrome");
		loadUrl("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		dataSend(search, "Java");
		pageClose();
	}
	
	//single time -> 20s    10 time -> 200s
	//threadPoolsize -> 
	@Test(invocationCount=10, threadPoolSize=2)
	public void searchSelenium() {
		//System.out.println("Current Thread ID : "+Thread.currentThread());
		System.out.println("Hi");
	}
}
