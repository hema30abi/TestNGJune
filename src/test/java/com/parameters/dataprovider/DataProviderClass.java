package com.parameters.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider
	public Object[][] dataMethod2(){
		return new Object[][] {{"Rinto", "rinto123"}, 
							   {"Pranith", "pranith123"},
							   {"Bhuvana", "bhuvana123"}};
	}
}
