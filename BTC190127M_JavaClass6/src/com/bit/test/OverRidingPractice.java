package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OverRidingPractice extends OverLoadingPractice {
	/*
	 Override happens between parent/super and child class
	 when we override any method form super class, we can only change the body
	 parameter, access modifier, return type can't be different
	 Override is known as runtime polimorphysm
	 
	 
	 Tell me a real life example where you have used overriding
	 */
	
	
	
	@Override
	void click (By by) {
		dr.findElement(by).click();
		
		dr.findElement(By.id("dkfjjkj"));
		
	}

	@Override
	void click (WebElement ele) {
		ele.click();
		
		
	}

	
	

}
