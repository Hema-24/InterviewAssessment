package com.dx.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dx.pages.TheInternetPage;

public class TestNg {

	TheInternetPage test;
	public static WebDriver driver;
	
	public TestNg() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		test = new TheInternetPage(driver);

	}

	@Test
	public void verifyHomePage() throws InterruptedException {

		test.clickOnJavaScript().clickOnJavaScript().acceptAlert().asserResult();

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
