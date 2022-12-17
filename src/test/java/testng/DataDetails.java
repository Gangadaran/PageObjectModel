package testng;

import org.testng.annotations.DataProvider;

public class DataDetails {
	@DataProvider(name ="login", indices = {0,1}, parallel = true)
	public String[][] getData() {
     String[][] data = new String[2][2];
     data[0][0] = "DemoSalesManager";
     data[0][1] = "crmsfa";
     data[1][0] = "DemoSalesManager";
     data[1][1] = "crmsfa";
     return data;
	}
}
