package com.htc.origin.Maven_Project;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	@Test
	
	private void register() {

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\ThirdSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://phptravels.org/register.php");
		
		
		
		PageObjects.firstname(driver).sendKeys("rishiramanathan");
		PageObjects.lastname(driver).sendKeys("123456789");
		
		
		
		
	}

}
