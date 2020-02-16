package com.dx.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptAlertPage {

	WebDriver driver;

	@FindBy(xpath = "//li/button[text()='Click for JS Confirm']")
	private WebElement confirmButton;

	@FindBy(xpath = "//p[@id='result']")
	private WebElement validateResult;

	public JavaScriptAlertPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public JavaScriptAlertPage clickOnJavaScript() {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
			
			confirmButton.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public JavaScriptAlertPage acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public JavaScriptAlertPage asserResult() {
		try {
			String result = validateResult.getText();
			assertEquals("You clicked: Ok", result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
