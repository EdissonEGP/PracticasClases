package com.Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.Pages.PageLogin;

public class TestLogin {
	
	private WebDriver driver;
	PageLogin pageLogin;
	@BeforeEach
	public void setUp() throws Exception {
		pageLogin = new PageLogin(driver);
	driver =pageLogin.chromeDriverConnection();
	pageLogin.link("http://fe.deitech.online/");
	}
	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		pageLogin.loginUser();
	}

}
