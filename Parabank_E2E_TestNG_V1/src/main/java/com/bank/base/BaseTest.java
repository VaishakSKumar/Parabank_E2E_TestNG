package com.bank.base;

import java.time.Duration;

import org.apache.commons.text.RandomStringGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterClass
	public void tear_down() {
		driver.close();
	}
	
	public String randomString() {
		RandomStringGenerator generator=new RandomStringGenerator.Builder().withinRange('a','z').build();
		String randomString=generator.generate(5);
		return randomString;
	}
	
	public String randomNumeric() {
		RandomStringGenerator generator=new RandomStringGenerator.Builder().withinRange('0','9').build();
		String randomString=generator.generate(10);
		return randomString;
	}
	
	public String randomPassword() {
		RandomStringGenerator generator=new RandomStringGenerator.Builder().withinRange('0','z').build();
		String randomString=generator.generate(10);
		return randomString;
	}
	
	public void waitforElement(WebElement element,long duration) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void set_TextTo(WebElement element,String text) {
		element.sendKeys(text);
	}

}
