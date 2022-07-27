package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	private WebDriver driver;
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chomedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public WebElement findElement(By locator) {
	return driver.findElement(locator); 
	}
	public void teclear(String imputText,By locator) {
	driver.findElement(locator).sendKeys(imputText);
	}
	public void oprimir (By locator) {
	driver.findElement(locator).click();
	}
	public void link (String url) {
	driver.get(url);
	}
}

