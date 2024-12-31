package com.bank.tests;


import org.testng.Assert;
import org.testng.annotations.*;

import com.bank.base.BaseTest;
import com.bank.pages.HomePage;
import com.bank.pages.RegistrationPage;

public class RegistrationTest extends BaseTest{
	

	public HomePage hp;
	public RegistrationPage rp;

	@BeforeClass
	public void setup() {
		super.setup();
		  hp=new HomePage(driver);
		 rp= new RegistrationPage(driver);
	}
	
	@Test
	public void registration_Test()  {
		hp.click_registrButton();		
		
		String f_user=randomString();
		String f_password=randomPassword();
		
		rp.fillRegistrationDetails(randomString(), randomString(), randomPassword(),randomString() , "NY","10001", randomNumeric(), "111-111-111", f_user,  f_password);

		rp.click_registernowButton();
		
		String account=rp.getConfirmattionmessage();
		
		Assert.assertEquals(account, "Welcome "+f_user); 
		
	}
	
	
	
	
	
}
