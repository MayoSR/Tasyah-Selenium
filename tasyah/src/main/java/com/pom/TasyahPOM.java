package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.waits.WaitTypes;

public class TasyahPOM {
	
	private WebDriver webDriver;
	private String URL = "http://tasyah.com/";
	
	public TasyahPOM(WebDriver driver) {
		this.webDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"menu_category_Menu_VIfWm2LT_440\"]/a")
	private WebElement navigateNecklace;
	
	@FindBy(xpath = "//*[@id=\"ProductsSystem_QQI8r357\"]/div[1]/div[1]/div/div[2]/div[1]/a")
	private WebElement necklace1;
	
	@FindBy(xpath = "//*[@id=\"ProductsSystem_QQI8r357\"]/div[1]/div[2]/div/div[2]/div[1]/div[2]/a")
	private WebElement necklace2;
	
	@FindBy(xpath = "//*[@id=\"ProductAddToCartSystem_C8WkgNNi\"]/div[2]/div[1]/div/span/span/button[1]")
	private WebElement incCount;
	
	@FindBy(xpath = "//*[@id=\"button-cart\"]")
	private WebElement addNecklacetoCart;
	
	@FindBy(xpath = "//*[@id=\"System_V2Exp1o9\"]/div[3]/div[2]/a")
	private WebElement checkOut;
	
	public void loadPage() {
		webDriver.get(URL);
	}
	
	public void closePage() {
		webDriver.quit();
	}
	
	public void clickNecklaces() {
		WaitTypes waitTypes = new WaitTypes(this.webDriver);
		waitTypes.waitForClickableReady(navigateNecklace,10).click();
	}
	
	public void chooseNecklace1() {
		String redirect = necklace1.getAttribute("href");
		webDriver.get(redirect);

	}
	
	public void chooseNecklace2() {
		String redirect = necklace2.getAttribute("href");
		webDriver.get(redirect);
	}
	
	public void incCount() {
		incCount.click();
	}
	
	public void addNecklaceToCart() {
		addNecklacetoCart.click();
	}
	
	public void viewCart() {
		webDriver.get("http://tasyah.com/checkout/cart");
	}
	
	public void checkOut() {
		checkOut.click();
	}
	
}
