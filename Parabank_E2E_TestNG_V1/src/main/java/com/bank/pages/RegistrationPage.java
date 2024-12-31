package com.bank.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import com.bank.base.BaseTest;
import com.bank.base.BasePage;

public class RegistrationPage extends BasePage {
	
	BaseTest bc;
	public RegistrationPage(WebDriver driver) {
		super(driver);
		bc=new BaseTest();
		bc.driver=driver;
		
		 
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
		
		bc.set_TextTo(firstName, fname);
		bc.set_TextTo(lastName, lname);
		bc.set_TextTo(address, addressline);
		bc.set_TextTo(city, city1);
		bc.set_TextTo(state, state1);
		bc.set_TextTo(zipCode, zipCode1);
		bc.set_TextTo(ssn, ssn1);
		bc.set_TextTo(userName, username);
		bc.set_TextTo(password, passwrd);
		bc.set_TextTo(confirmPassword, passwrd);
	}
	
	public void click_registernowButton() {
	register_button.click();
		bc.waitforElement(userVerification, 30);
		
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
