package com.automationpractice.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodRepository {
	static WebDriver driver;
	
	public static void AuotoIt () throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://imgbb.com/");
	Thread.sleep(4000);
	WebElement btnStartUpload = driver.findElement(By.xpath("//a[@class='btn btn-big blue']"));
	btnStartUpload.click();
	Thread.sleep(4000);
	Runtime.getRuntime().exec("./autoitfile/testauto.exe");
	
	Thread.sleep(3000);

	
	}

	
	public static void browserAppLaunch ()
	
	{
	   	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   	driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://automationpractice.com/index.php");
		}
	
	public static void category ()
	{
		WebElement women=driver.findElement(By.cssSelector("a[title='Women']"));
		//WebElement women=driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
		//WebElement women=driver.findElement(By.xpath("//a[@title='Women']"));

		
        women.click();	
     

		
	}
}