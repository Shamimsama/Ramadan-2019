package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverLoadingPractice {
	
	//when we need more than one method with same name in the same class,
	//we can use method OverLoading concept
	//we can change the parameter size OR type OR sequence
	// --------------
	// method OverLoading is known as compile time polimorphysm
	// return type and access modifier can be same or different
	// Tell me a real life example from your project where you used method overloading concept.
	// one example from code and one from selenium.
		
		ChromeDriver dr;
		
		void click (By by) {
			dr.findElement(by).click();
			
			
		}

		
		void click (WebElement ele) {
			ele.click();
			
			
		}

		
		void click (String xpathValue) {
			dr.findElement(By.xpath(xpathValue)).click();
			
			
		}
		
		int k = 1;
		
		void seleniumExample() {
			
			dr.switchTo().frame(1);
			dr.switchTo().frame("dkjfdk");
			dr.switchTo().frame(dr.findElement(By.id("jdfkjdk")));
			
		}

}
