package com.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.TasyahPOM;
import com.screenshot.CaptureScreenShot;
import com.util.DriverFactory;
import com.util.DriverNames;
import com.waits.WaitTypes;

public class TasyahTestCase {

	private WebDriver driver = null;
	private TasyahPOM eLearningLoginPOM = null;
	private WaitTypes waitTypes = null;
	private CaptureScreenShot captureScreenShot= null;
	
	@Before
	public void setUp() throws Exception{
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		eLearningLoginPOM = new TasyahPOM(driver);
		waitTypes = new WaitTypes(driver);
		captureScreenShot = new CaptureScreenShot(driver);
	}
	
	@After
	public void tearDown() throws InterruptedException{
		Thread.sleep(3000);
		
	}
	
	@Test
	public void test() {
		
		eLearningLoginPOM.loadPage();
		captureScreenShot.takeScreenshot();
		
		eLearningLoginPOM.clickNecklaces();
		captureScreenShot.takeScreenshot();
		
		eLearningLoginPOM.chooseNecklace1();
		captureScreenShot.takeScreenshot();
		
		eLearningLoginPOM.incCount();
		captureScreenShot.takeScreenshot();
		
		eLearningLoginPOM.addNecklaceToCart();
		captureScreenShot.takeScreenshot();
		
		eLearningLoginPOM.clickNecklaces();
		captureScreenShot.takeScreenshot();
		
		eLearningLoginPOM.chooseNecklace2();
		captureScreenShot.takeScreenshot();
		
		eLearningLoginPOM.incCount();
		captureScreenShot.takeScreenshot();
		
		eLearningLoginPOM.addNecklaceToCart();
		captureScreenShot.takeScreenshot();
		
		eLearningLoginPOM.viewCart();
		captureScreenShot.takeScreenshot();
		
		eLearningLoginPOM.checkOut();
		captureScreenShot.takeScreenshot();
		
		eLearningLoginPOM.closePage();
		
	}
	
}
