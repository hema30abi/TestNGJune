package com.cross.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ParallelTesting extends BaseClass{

	@Test
	public void searchSelenium() {
		browserOpen("chrome");
		loadUrl("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		dataSend(search, "Selenium");
		pageClose();
	}
	
	@Test
	public void searchJava() {
		browserOpen("chrome");
		loadUrl("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		dataSend(search, "Java");
		pageClose();
	}
	
	@Test
	public void searchTestNG() {
		browserOpen("edge");
		loadUrl("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		dataSend(search, "TestNG");
		pageClose();
	}
	
	@Test
	public void searchbdd() {
		browserOpen("chrome");
		loadUrl("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		dataSend(search, "BDD");
		pageClose();
	}
	
	@Test
	public void searchApi() {
		browserOpen("edge");
		loadUrl("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		dataSend(search, "API");
		pageClose();
	}
}
