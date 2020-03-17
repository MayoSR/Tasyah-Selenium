package com.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {

	private WebDriver webDriver;

	public WaitTypes(WebDriver driver) {
		this.webDriver = driver;
	}

	public WebElement waitForElementToBeVisible(By locator, int maxTime) {

		WebDriverWait wait = new WebDriverWait(webDriver, maxTime);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	
	public WebElement waitForClickableReady(WebElement webElement,int maxTime) {

		WebDriverWait wait = new WebDriverWait(webDriver, maxTime);
		return wait.until(ExpectedConditions.elementToBeClickable(webElement));

	}

	public WebElement waitForClickableReady(By locator, int maxTime) {

		WebDriverWait wait = new WebDriverWait(webDriver, maxTime);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));

	}

}
