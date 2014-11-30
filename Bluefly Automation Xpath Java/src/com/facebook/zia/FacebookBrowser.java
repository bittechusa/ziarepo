package com.facebook.zia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookBrowser
{

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.bluefly.com");
		
		FacebookLogin facebooklogin = new FacebookLogin();
		
		WebElement newlink = driver.findElement(By.xpath("//li[@id='main-nav-new']/a"));
		facebooklogin.click(newlink);
		Thread.sleep(5000);
		
		WebElement beautylink = driver.findElement(By.xpath("//div[@class='listingContentContainer']/div[1]/div[1]/div[1]/a"));
		facebooklogin.click(beautylink);
		Thread.sleep(5000);
		
		WebElement womenbeautylink = driver.findElement(By.xpath("//div[@class='listingContentContainer']/div[1]/div[1]/div/a"));
		facebooklogin.click(womenbeautylink);
		Thread.sleep(5000);
		
		WebElement fragrancelink = driver.findElement(By.xpath("//div[@class='listingContentContainer']/div[1]/div[1]/div[1]/a"));
		facebooklogin.click(fragrancelink);
		Thread.sleep(5000);
		
		WebElement burberrylink = driver.findElement(By.xpath("//div[@id='335970401']/div[1]/a/img"));
		facebooklogin.click(burberrylink);
		Thread.sleep(5000);
		
		WebElement womenlink = driver.findElement(By.xpath("//li[@id='main-nav-woman']/a"));
		facebooklogin.click(womenlink);
		Thread.sleep(5000);
		
		WebElement newarrivallink = driver.findElement(By.xpath("//div[@id='departmentLeftNaviContainer']/div[1]/ul/li[1]/a"));
		facebooklogin.click(newarrivallink);
		Thread.sleep(5000);
	
		
		driver.close();
	}

}
