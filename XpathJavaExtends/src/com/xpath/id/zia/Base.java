package com.xpath.id.zia;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base
{
	FirefoxDriver x;
	
	Base(FirefoxDriver y)
	{
		x=y;
	}
	void type(By by, String text)
	{
		x.findElement(by).sendKeys(text);
	}//method end
	void click(By by)
	{
		x.findElement(by).click();
	}
	void verifyText(String text)
	{
		if(x.getPageSource().contains(text))
		{
			System.out.println("i am");
		}
		else
		{
			System.out.println("not");
		}
	}//method end
	void verifyElementPresent(By by)
	{
		if(x.findElement(by).isDisplayed())
		{
			System.out.println("got");
		}
		else
		{
			System.out.println("not");
		}
	}//end method
	

}
