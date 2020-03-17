package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	static WebDriver driver = null;
	
	public static WebDriver getDriver(DriverNames driverName) {
		switch(driverName) {
			case CHROME:
				System.setProperty(DriverInfo.CHROME_KEY, DriverInfo.CHROME_PATH);
				driver = new ChromeDriver();
			case FIREFOX:
				System.setProperty(DriverInfo.FIREFOX_KEY, DriverInfo.FIREFOX_PATH);
			case EDGE:
				System.setProperty(DriverInfo.EDGE_KEY, DriverInfo.EDGE_PATH);
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		return driver;
		
	}
}
