package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Base.BasePage;

public class PageLogin extends BasePage {
	By email = By.name("email");
	By password = By.name("password");
	By bottomLogin = By.xpath("//*[@id=\'root\']/header/nav/a[2]");
	By bottomFinish = By.xpath("//*[@id=\'root\']/main/div/form/button");
	
	public PageLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void loginUser() {
		oprimir(bottomLogin);
		teclear("prueba6@prueba.com",email);
		teclear("pass123",password);
		oprimir(bottomFinish);
		
	}

}
