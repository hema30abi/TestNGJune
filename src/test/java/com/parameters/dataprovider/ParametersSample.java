package com.parameters.dataprovider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ParametersSample extends BaseClass{

	@Parameters({"browser", "url"})
	@Test
	public void launchFlipkart(String browser, String url) {
		browserOpen(browser); //get it via Parameters from xml
	//	loadUrl("https://www.flipkart.com/"); //hardCode
		loadUrl(url); 
	}
}
