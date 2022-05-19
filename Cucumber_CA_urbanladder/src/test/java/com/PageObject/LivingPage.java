package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UiStore.RoomUi;

public class LivingPage {

	WebDriver driver; 

	public LivingPage(WebDriver driver) {
		
		this.driver=driver;
	}
		
public void room() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	driver.findElement(RoomUi.room).click();
	driver.findElement(RoomUi.table).click();
	
	if(driver.getPageSource().contains("250 Products")) {
		System.out.println("text is verified");
	}
	
	}
}