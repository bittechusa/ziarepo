package com.facebook.zia;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookBrowser
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}

}
