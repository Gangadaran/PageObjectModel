package com.leaftaps.ui.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leaftaps.ui.base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {

	}

	public LoginPage enterUsername(String username) throws IOException {
		try {
			WebElement usernameElement = driver.findElement(By.id("username"));
			usernameElement.sendKeys(username);
			reportStep(username+" Username is entered successfully", "pass");
		} catch (Exception e) {
			reportStep(username+" Username is not entered successfully....."+e, "fail");
		}

		return this;
	}

	public LoginPage enterPassword(String password) throws IOException {
		try {
			WebElement passwordElement = driver.findElement(By.name("PASSWORD"));
			passwordElement.sendKeys(password);
			reportStep(password+" Password is entered successfully", "pass");
		} catch (Exception e) {
			reportStep(password+" Password is not entered successfully....."+e, "fail");
		}
		return this;
	}

	public WelcomePage clickLogin() throws IOException {
		try {
			WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
			loginButton.click();
			reportStep("Login button is clicked", "pass");
		} catch (Exception e) {
			reportStep("Login button is not clicked....."+e, "fail");
		}
		return new WelcomePage();
	}
}
