package com.bank.base;


import java.time.Duration;

import org.apache.commons.text.RandomStringGenerator;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
	public WebDriver driver;
	public Logger logger;
	@BeforeClass
	@Parameters({"browser"})
	public void setup(String browser) {
		logger=LogManager.getLogger(this.getClass());
		
		switch(browser.toLowerCase()) {
		
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;	
		case "edge":
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser");
			break;
		}
		

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
