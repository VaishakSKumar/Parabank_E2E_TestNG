package com.bank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import com.bank.base.BasePage;


public class HomePage extends BasePage {
	
	
	
	public HomePage(WebDriver driver){
		super(driver);
		
	}

	
	@FindBy(xpath="//a[contains(text(),'Forgot login info?')]")
	WebElement Forgotlogininfo;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement Register_button;
	
	
	
	public void click_Forgotlogin() {
		Forgotlogininfo.click();
	}
	
	public void click_registrButton() {
		Register_button.click();
	}
	
	
	
}
