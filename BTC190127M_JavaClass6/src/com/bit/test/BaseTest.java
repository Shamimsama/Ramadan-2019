package com.bit.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver dr;

public WebDriver getDriver() {
	
	System.out.println("Hi this is Forhan");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Shamibur Rahman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return dr;
		
		//when we want return value of anything we have to assign it to a variable.
		//WebElement k = return dr;
		//We can return only variable, class, method, and data
		
		
		//
		
		
	}
	

	public void closeBrowser() throws InterruptedException {
		
		Thread.sleep(5000);
		dr.quit();
		
		
	}

}
