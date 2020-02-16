package com.dx.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TheInternetPage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//li/a[text()='JavaScript Alerts']")
	private WebElement javaScriptLink;

	public TheInternetPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public JavaScriptAlertPage clickOnJavaScript() {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(javaScriptLink));
			
			javaScriptLink.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new JavaScriptAlertPage(driver);
	}

}
