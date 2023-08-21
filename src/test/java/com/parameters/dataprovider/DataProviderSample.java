package com.parameters.dataprovider;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class DataProviderSample extends BaseClass{
	//@Test(dataProvider="data") //by using methodName
	//@Test(dataProvider="credentials") //@Test no Of execution based on dataProvider no Of data's
	@Test(dataProvider="dataMethod2", dataProviderClass=DataProviderClass.class)
	public void testMethod(String user, String pwd) {
		browserOpen("chrome");
		loadUrl("https://adactinhotelapp.com/");
		WebElement username = findElementById("username");
		dataSend(username, user);
		
		WebElement password = findElementById("password");
		dataSend(password, pwd);
		pageClose();
	}
	
	@DataProvider(name="credentials", parallel=false)
	public Object[][] data(){
		return new Object[][] {{"Muthu", "muthu123"}, 
							   {"Ayesha", "ayesha123"},
							   {"Hema", "hema123"}};
	}
}
