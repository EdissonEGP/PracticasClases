package com.Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Test01 {

	private WebDriver driver;
	By bottomRegister = By.xpath("//*[@id=\'root\']/header/nav/a[1]");
	By firstName = By.id("firstName");
	By lastname = By.name("lastName");
	By email = By.name("email");
	By password = By.name("password");
	By repeatPassword = By.name("repassword");
	By bottomFinish = By.xpath("//*[@id=\'root\']/main/div/form/button");
	By bottomLogin = By.xpath("//*[@id=\'root\']/header/nav/a[2]");
	
	@BeforeEach
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",".\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://fe.deitech.online/");
	}
	@Test
	public void loginUser() {
		driver.findElement(bottomLogin).click();
		driver.findElement(email).sendKeys("prueba9@prueba.com");
		driver.findElement(password).sendKeys("pass123");
		driver.findElement(bottomFinish).click();
	}
	@Test
	public void registerUser() {
		driver.findElement(bottomRegister).click();
		driver.findElement(firstName).sendKeys("jose");
		driver.findElement(lastname).sendKeys("gomez");
		driver.findElement(email).sendKeys("prueba10@prueba.com");
		driver.findElement(password).sendKeys("pass123");
		driver.findElement(repeatPassword).sendKeys("pass123");
		driver.findElement(bottomFinish).click();
	}

	@AfterEach
	public void tearDowm() {
		driver.quit();
	}

}
