package com.orangehrm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public static void validLogIn (String uname, String pass) throws InterruptedException {
		WebElement Username=driver.findElement(By.id("txtUsername"));
		Username.sendKeys(uname);
		WebElement Password=driver.findElement(By.name("txtPassword"));
		Password.sendKeys(pass);
		WebElement Login=driver.findElement(By.name("Submit"));
		Login.click();


	}
		
    public static void VerifyValidLogIn ()
    {
    String expURL ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
    String actURl =driver.getCurrentUrl();
    if (expURL.equals(actURl)) { 
    	System.out.println("Login is successfull");
    }
    else {
    	System.out.println("Login is unsuccessfull");
    	
    }
    }
    
    public static void validLoginxpath (String uname, String pass) throws InterruptedException {
    	WebElement Username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
    	Username.sendKeys(uname);
    	WebElement Password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
    	Password.sendKeys(pass);
    	WebElement Login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		Login.click();
    }

		
		public static void validLoginCSS (String uname, String pass) throws InterruptedException {
	    	WebElement Username=driver.findElement(By.cssSelector("#txtUsername"));
	    	Username.sendKeys(uname);
	    	WebElement Password=driver.findElement(By.cssSelector("#txtPassword"));
	    	Password.sendKeys(pass);
	    	WebElement Login=driver.findElement(By.cssSelector(".button"));
			Login.click();	
    }
		
		
		public static void LoginWithKey ()
		{
			WebElement Username=driver.findElement(By.id("txtUsername"));
			Username.sendKeys("Admin");
			Username.sendKeys(Keys.TAB + "admin123" + Keys.ENTER);
	
		}
		
		public static void keyup ()
		{
			WebElement Recruitment= driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
			
			Actions action = new Actions(driver);
			action.moveToElement(Recruitment).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			
		}
		

}
		

    
    
    
    
		
	

	

	
