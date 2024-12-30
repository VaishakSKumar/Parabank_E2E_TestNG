package com.bank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import com.bank.base.BasePage;
import com.bank.base.BaseTest;

public class HomePage extends BasePage {
	
	BaseTest bt;
	
	public HomePage(WebDriver driver){
		super(driver);
		 bt=new BaseTest(driver);
	}

	
	@FindBy(xpath="//a[contains(text(),'Forgot login info?')]")
	WebElement Forgotlogininfo;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement Register_button;
	
	
	
	public void click_Forgotlogin() {
		bt.click_button(Forgotlogininfo);
	}
	
	public void click_registrButton() {
		bt.click_button(Register_button);
	}
	
	
	
}
