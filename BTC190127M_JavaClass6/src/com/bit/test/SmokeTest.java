package com.bit.test;

import org.openqa.selenium.By;

public class SmokeTest {
	
	void sampleTest() {
		OverLoadingPractice o = new OverLoadingPractice();
		o.click(By.id("dfjdk"));
		o.click("kdjfkfjf");
		
		
	}

}
