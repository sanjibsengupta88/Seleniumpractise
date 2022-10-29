package com.democompletethemes.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodRepository {
  static WebDriver driver;
  
	public static void browserAppLaunch () throws InterruptedException
	
	{
	   	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   	driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://demo.competethemes.com/");
		Thread.sleep(20000);
		}
    
	public static void item () throws InterruptedException
    
    {
		WebElement item=driver.findElement(By.xpath("//a[normalize-space()='Women']"));
		item.click();
		
	
    }
	 
	
}
	
		

	


