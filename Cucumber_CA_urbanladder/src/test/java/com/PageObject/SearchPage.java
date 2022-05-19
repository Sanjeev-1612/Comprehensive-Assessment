package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Utility.ExcelDataProvider;

import UiStore.SearchUi;

public class SearchPage {

	WebDriver driver; 

	public SearchPage(WebDriver driver) {
		
		this.driver=driver;
	}
		
public void search() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	ExcelDataProvider excel=new ExcelDataProvider();
	String data=excel.getStringData("Input", 0, 0);
	
	driver.findElement(SearchUi.input).sendKeys(data);
	driver.findElement(SearchUi.click).click();
	
	}
}
