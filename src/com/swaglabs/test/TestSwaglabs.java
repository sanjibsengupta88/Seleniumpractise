package com.swaglabs.test;

import java.io.IOException;

import org.sikuli.script.FindFailed;

//import org.openqa.selenium.Alert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class TestSwaglabs {

   public static void main(String[] args) throws InterruptedException, IOException, FindFailed {
	
    MethodRepository.browserAppLaunch();
   // MethodRepository.validLogIn("standard_user", "secret_sauce");
    MethodRepository.loginWithPropertyFile();
    MethodRepository.verifyLogin();
    MethodRepository.Itemadd();
    MethodRepository.Itemverify();
    MethodRepository.Logout();
    //MethodRepository.validLogWithSikuli();
   
   

   
   
   

}
}