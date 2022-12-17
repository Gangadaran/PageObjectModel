package testng;


import org.testng.annotations.Test;

public class LearnAttributes1 {
    @Test(invocationCount = 3, invocationTimeOut = 1000)
	public void signUp() {
		System.out.println("signUp");

	}
    @Test
	public void searchProduct() {
		System.out.println("searchproduct");

	}
    @Test
	public void selectProduct() {
		System.out.println("selectproduct");

	}
    @Test
	public void payment() {
		System.out.println("payment");

	}
    @Test
	public void orderPlaced() {
		System.out.println("orderplaced");

	}

}
