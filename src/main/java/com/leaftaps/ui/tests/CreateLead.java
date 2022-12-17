package com.leaftaps.ui.tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.BaseClass;
import com.leaftaps.ui.pages.LoginPage;

public class CreateLead extends BaseClass {
	@BeforeTest
	public void setData() {
		excelFileName = "tc001";
		testName = "CreateLead";
		testDescription = "Create lead with mandatory info";
		testAuthor = "Balaji";
		testCategory = "functional";
	}

	@Test(dataProvider = "testData")
	public void test(String username, String password, String companyName, String firstName, String lastName) throws IOException {
	
	new LoginPage()
	.enterUsername(username)
	.enterPassword(password)
	.clickLogin()
	.clickCRMSFA()
	.clickLeads()
	.clickCreateLeadLink()
	.enterCompanyName(companyName)
	.enterFirstName(firstName)
	.enterLastName(lastName)
	.clickCreateLeadButton();
	
	}
}
