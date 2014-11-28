package com.fals.tru;

import org.openqa.selenium.firefox.FirefoxDriver;

public class B
{
	

	public static void main(String[] args)
	{
	  
		FirefoxDriver browser = new FirefoxDriver();
		browser.get("http://www.bluefly.com");
		String pagetitle = browser.getTitle();
		System.out.println(pagetitle);
		
		boolean check = pagetitle.contains("Designer");
		System.out.println(check);
		
		if(pagetitle.contains("Clothing"))
		{
			System.out.println("title match");
		}
		else
		{
			System.out.println("title did not match");
		}
		
	}

}
