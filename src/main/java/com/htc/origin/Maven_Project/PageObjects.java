package com.htc.origin.Maven_Project;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {
	
	
	
	public static WebElement firstname(WebDriver driver) {
		return driver.findElement(By.name("firstname"));
		
		
	}
      public static WebElement lastname(WebDriver driver) {
    	  return driver.findElement(By.name("lastname"));
    	  
    	  
      }
      
      public static WebElement emailid(WebDriver driver) {
    	  return driver.findElement(By.id("inputEmail"));
    	  
    	  
      }
      
      public static WebElement phonenumber(WebDriver driver) {
    	  return driver.findElement(By.id("inputPhone"));
    	  
 
      }
      
      
}
