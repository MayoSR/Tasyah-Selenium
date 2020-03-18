package com.sapient.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepDefinition {

	WebDriver dr;

	@Given("^navigate to custom page$")
	public void navigate_to_Gmail_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("http://localhost:3000/");
	}

	@When("^user logged in using username as \"(.*)\" and password as \"(.*)\"$")
	public void login(String username, String password) throws InterruptedException {
		
		Thread.sleep(3000);
		dr.findElement(By.xpath("/html/body/form/input[1]")).sendKeys(username);
		dr.findElement(By.xpath("/html/body/form/input[2]")).sendKeys(password);
		dr.findElement(By.xpath("/html/body/form/button")).click();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Then("^loginfail page should be displayed$")
	public void loginfail_page_should_not_be_displayed() {
		String expectedText = "Welcome user";
		String actualText = dr.findElement(By.xpath("/html/body/p")).getText();
		Assert.assertFalse("Login not successful", expectedText.equals(actualText));
	}
	
	@Then("^loginsuccess page should be displayed$")
	public void loginsuccess_page_should_be_displayed() throws Throwable {
		String expectedText = "Welcome user";
		String actualText = dr.findElement(By.xpath("/html/body/p")).getText();
		Assert.assertTrue("Login was successful", expectedText.equals(actualText));
	}

}
