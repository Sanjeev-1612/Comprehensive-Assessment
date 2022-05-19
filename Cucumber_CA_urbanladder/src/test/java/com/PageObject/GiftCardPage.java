package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UiStore.GiftUi;

public class GiftCardPage {

	WebDriver driver; 

	public GiftCardPage(WebDriver driver) {
		
		this.driver=driver;
	}
		
public void gift() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	driver.findElement(GiftUi.gift).click();
	
	if(driver.getPageSource().contains("STARTS AT")) {
		System.out.println("text is verified");
	}
	}
}
