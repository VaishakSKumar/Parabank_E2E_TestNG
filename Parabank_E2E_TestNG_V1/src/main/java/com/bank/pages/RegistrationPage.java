package com.bank.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import com.bank.base.BasePage;
import com.bank.base.BaseTest;

public class RegistrationPage extends BasePage {
	
	BaseTest bt;
	public RegistrationPage(WebDriver driver) {
		super(driver);
		 bt=new BaseTest(driver);
	}
	
	
	@FindBy(xpath="//*[@name='customer.firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//*[@name='customer.lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//*[@name='customer.address.street']")
	WebElement address;
	
	@FindBy(xpath="//*[@name='customer.address.city']")
	WebElement city;
	
	@FindBy(xpath="//*[@name='customer.address.state']")
	WebElement state;
	
	@FindBy(xpath="//*[@name='customer.address.zipCode']")
	WebElement zipCode;
	
	@FindBy(xpath="//*[@name='customer.phoneNumber']")
	WebElement phone;
	
	@FindBy(xpath="//*[@name='customer.ssn']")
	WebElement ssn;
	
	@FindBy(xpath="//*[@name='customer.username']")
	WebElement userName;
	
	@FindBy(xpath="//*[@name='customer.password']")
	WebElement password;
	
	@FindBy(xpath="//*[@name='repeatedPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//*[@value='Register']")
	WebElement register_button;
	
	@FindBy(xpath="//h1[contains(text(),'Welcome')]")	
	WebElement userVerification;
	
	public void fillRegistrationDetails(String fname,String lname,String addressline,String city1,String state1,String zipCode1,String phonenumber,String ssn1,String username,String passwrd) {
		
		bt.set_TextTo(firstName, fname);
		bt.set_TextTo(lastName, lname);
		bt.set_TextTo(address, addressline);
		bt.set_TextTo(city, city1);
		bt.set_TextTo(state, state1);
		bt.set_TextTo(zipCode, zipCode1);
		bt.set_TextTo(ssn, ssn1);
		bt.set_TextTo(userName, username);
		bt.set_TextTo(password, passwrd);
		bt.set_TextTo(confirmPassword, passwrd);
	}
	
	public void click_registernowButton() {
		bt.click_button(register_button);
		bt.waitforElement(userVerification, 30);
		
	}
	
	public String getConfirmattionmessage() {
		
		try {
			return (userVerification.getText());
		} catch (Exception e) {
			// TODO: handle exception
			return (e.getMessage());
		}
		
		
		
	}
	
	
}
