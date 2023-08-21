package com.extent.reports;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class SampleTest extends BaseClass{

	@Test
	public void validCredentials() throws InterruptedException, IOException {
		createTest("TS01_User_login_with_Valid_Credentials");
		browserOpen("chrome");
		reportStatus("pass", "Browser Opened");
		loadUrl("https://adactinhotelapp.com/");
		reportStatus("pass", "Adactin URL Launched");
		
		String userData = "Muthulakshmi07";
		WebElement user = findElementById("username");
		dataSend(user, userData);
		String passedUserData = user.getAttribute("value");
		if(passedUserData.equals(userData)) {
			reportStatus("pass", "User data passed in Username input field");
		}else {
			reportStatus("fail", "User data not passed in Username input field");
		}
		
		String pwdData = "Test@123";
		WebElement pwd = findElementById("password");
		dataSend(pwd, pwdData);
		String passedPwdData = pwd.getAttribute("value");
		if(passedPwdData.equals(pwdData)) {
			reportStatus("pass", "Pwd data passed in Password input field");
		}else {
			reportStatus("fail", "Pwd data not passed in Password input field");
		}
		
//		Thread.sleep(4000);
		findElementById("login").click();
		try {
		impWait(5);
		WebElement logOut = findElementByXpath("//a[text()='Logout']");
		if(logOut.isDisplayed()) {
			reportStatus("pass", "User Logged in Successfully");
			reportStatus("pass screenshot", "TestCase passed");
		}
		}catch(NoSuchElementException e) {
			reportStatus("fail", "User not logged in Successfully");
		}
	}
}
