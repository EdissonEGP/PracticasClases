package com.Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.Pages.PageRegister;

public class TestRegister {
	private WebDriver driver;
	PageRegister pageRegister;
	@BeforeEach
	public void setUp() throws Exception {
		pageRegister = new PageRegister(driver);
	driver = pageRegister.chromeDriverConnection();
	pageRegister.link("http://fe.deitech.online/");
	}
	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		pageRegister.registerUser();
	}
}
