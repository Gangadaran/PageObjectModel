package testng;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnAttributes2 {
	@Test(enabled = false)
	public void signUp() {
		System.out.println("signUp");

	}

	@Test(description = "this is used to do the sign up")
	public void login() {
		System.out.println("login");
	}

//	@Test(dependsOnMethods = "login", alwaysRun = true)
//	public void searchProduct() {
//		System.out.println("searchProduct");
//	}
}
