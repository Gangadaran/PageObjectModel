package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leaftaps.ui.base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {

	}
	public LeadsPage clickLeads() {
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		return new LeadsPage();
	}
}
