package com.dragdropactionclass.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MethodRepository {
	static WebDriver driver;
	
	public static void browserAppLaunch ()
	
	{
	   	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   	driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://demoqa.com/droppable/");
		}


    public static void perform()
    
    {
    	WebElement SourceElement = driver.findElement(By.id("draggable"));
    	WebElement DestinationElement = driver.findElement(By.id("droppable"));
    	
    	Actions action = new Actions(driver);
    	
    	//action.clickAndHold(SourceElement).moveToElement(DestinationElement).release().build().perform();
    	action.dragAndDrop(SourceElement, DestinationElement).build().perform();
    }
}
    

	
