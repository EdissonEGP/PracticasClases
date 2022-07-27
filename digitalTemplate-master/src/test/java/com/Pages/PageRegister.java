package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.Base.BasePage;

public class PageRegister extends BasePage {
	By bottomRegister = By.xpath("//*[@id=\'root\']/header/nav/a[1]");
	By firstName = By.id("firstName");
	By lastName = By.name("lastName");
	By email = By.name("email");
	By password = By.name("password");
	By repeatPassword = By.name("repassword");
	By bottomFinish = By.xpath("//*[@id=\'root\']/main/div/form/button");
	
	public PageRegister(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void registerUser() {
		oprimir(bottomRegister);
		teclear("Jose",firstName);
		teclear("Gomez",lastName);
		teclear("prueba6@prueba.com",email);
		teclear("Pass123",password);
		teclear("Pass123",repeatPassword);
		oprimir(bottomFinish);
	}

}
