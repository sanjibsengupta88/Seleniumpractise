package com.swaglabs.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class MethodRepository {
	static WebDriver driver;
	
	public static void browserAppLaunch ()
	
	{
	   	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   	driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.saucedemo.com/");
		}
	
	
	public static void validLogIn (String uname, String pass) throws InterruptedException
	{
		WebElement Username=driver.findElement(By.name("user-name"));
		Username.sendKeys(uname);
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys(pass);
		WebElement Login=driver.findElement(By.id("login-button"));
		Login.click();
		Thread.sleep(5000);
	}
	
	
	public static void loginWithPropertyFile() throws IOException, InterruptedException   {


		File file = new File("./Testdata/testdata.properties");

		FileInputStream fileInput = new FileInputStream(file);

		Properties prop = new Properties();

		prop.load(fileInput);
		Thread.sleep(3000);
		
		WebElement Username=driver.findElement(By.name("user-name"));
		Username.sendKeys(prop.getProperty("user1"));
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys(prop.getProperty("password1"));
		WebElement Login=driver.findElement(By.id("login-button"));
		Login.click();
		Thread.sleep(5000);
		
	}
		
	public static void verifyLogin ()
	{
		String expurl="https://www.saucedemo.com/inventory.html";
		String acurl=driver.getCurrentUrl();
		 if (expurl.equals(acurl))
			 
		 { 
	    	System.out.println("Login is successfull");
		 }	
		 
	    else 
	    	System.out.println("Login is unsuccessfull");
	    	
		 }
		
	 
	
	public static void Itemadd () throws InterruptedException
	{
	WebElement Item1=driver.findElement(By.id("item_1_title_link"));	
	Item1.click();
	Thread.sleep(5000);
	WebElement Cart1 =driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
	Cart1.click();
	Thread.sleep(5000);
	driver.navigate().back();
	WebElement Item2=driver.findElement(By.id("item_4_title_link"));
	Item2.click();
	Thread.sleep(5000);
	WebElement Cart2=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	Cart2.click();
	Thread.sleep(5000);

	}
	
	public static void Itemverify () throws IOException, InterruptedException
	
	{
	WebElement Cart=driver.findElement(By.id("shopping_cart_container"));
	Cart.click();
	
	File file = new File("./Testdata/writetestdata.properties");
	file.createNewFile();
	Properties prop = new Properties();
	
	WebElement firstitem=driver.findElement(By.id("item_1_title_link"));
	prop.setProperty("item1", firstitem.getText());
	WebElement seconditem=driver.findElement(By.id("item_4_title_link"));
	prop.setProperty("item2", seconditem.getText());
	FileOutputStream fileOutput = new FileOutputStream(file);
	
	
	prop.store(fileOutput, null);
	Thread.sleep(3000);
	
		
	}
	 
	public static void Logout() throws InterruptedException
	{
	WebElement Menu=driver.findElement(By.id("react-burger-menu-btn"));
	Menu.click();
	Thread.sleep(5000);
    WebElement Exit=driver.findElement(By.id("logout_sidebar_link"));
    Exit.click();
	Thread.sleep(5000);

		
	}
	
	public static void validLogWithSikuli () throws InterruptedException, FindFailed
	{
		
		Screen screen = new Screen();
		Pattern username = new Pattern("./SikuliImageFiles/username.PNG");
		screen.click(username);
		Thread.sleep(5000);
		screen.type(username,"standard_user");
		Thread.sleep(5000);
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys("secret_sauce");
		WebElement Login=driver.findElement(By.id("login-button"));
		Login.click();
		Thread.sleep(5000);
	}
	
	
}


