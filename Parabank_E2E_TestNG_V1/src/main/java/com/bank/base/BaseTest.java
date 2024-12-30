package com.bank.base;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest extends BasePage{
	

	public BaseTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void click_button(WebElement element) {
		element.click();
	}
	
	public void set_TextTo(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public void waitforElement(WebElement element,long duration) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
