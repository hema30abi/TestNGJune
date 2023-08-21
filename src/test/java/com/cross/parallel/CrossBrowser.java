package com.cross.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class CrossBrowser extends BaseClass{

	@Parameters("browser")
	@Test
	public void searchJava(String browser) {
		browserOpen(browser);
		loadUrl("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		dataSend(search, "Java");
	}
}
