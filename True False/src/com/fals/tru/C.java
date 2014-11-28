package com.fals.tru;

import org.openqa.selenium.firefox.FirefoxDriver;

public class C
{

	public static void main(String[] args) 
	{
		FirefoxDriver browser = new FirefoxDriver();
		browser.get("http://www.walmart.com");
		
		
		
		
		String pagetitle = browser.getTitle();
		System.out.println(pagetitle);
		
		boolean status = pagetitle.contains("Save money");
		System.out.println(status);
		
		if (pagetitle.contains("Live better"))
		{
			System.out.println("title match");
		}
		else
		{
			System.out.println("title did not match");
		}

	}

}
