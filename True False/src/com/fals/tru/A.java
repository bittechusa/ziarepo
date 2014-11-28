package com.fals.tru;

import org.openqa.selenium.firefox.FirefoxDriver;

public class A
{

	public static void main(String[] args) 
	{
		
		FirefoxDriver browser = new FirefoxDriver();
		browser.get("http://www.facebook.com");
	
		String pagetitle = browser.getTitle();
		System.out.println(pagetitle);
		
		boolean x = pagetitle.contains("sabbir");
		System.out.println(x);
		
		if(x)
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Title didn't match");
		}

	}

}
