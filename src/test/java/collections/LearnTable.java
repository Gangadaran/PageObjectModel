package collections;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTable {
	public static void main(String[] args) {
//		WebElement table = driver.findElement(By.tagName("table"));
//		List<WebElement> row = table.findElements(By.tagName("tr"));
//		for (int i = 1; i <row.size(); i++) {
//			WebElement eachRow = row.get(i);
//			List<WebElement> cols = eachRow.findElements(By.tagName("td"));
//			for (int j = 0; j < cols.size(); j++) {
//				String text = cols.get(j).getText();
//				System.out.println(text);
//			}
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		
		WebElement table = driver.findElement(By.tagName("table"));
		
	List<WebElement> row = table.findElements(By.tagName("tr"));

	int size = row.size();
	for (int i = 0; i < size; i++) {
		WebElement eachRow = row.get(i);
		List<WebElement> cols = eachRow.findElements(By.tagName("td"));
		int size2 = cols.size();
		for (int j = 0; j <size2; j++) {
			String text = cols.get(j).getText();
			
			
		}
		
	}
	
	
	
	
	
	//	int size = row.size();
//	for (int i = 0; i < size; i++) {
//		WebElement eachrow = row.get(i);
//		List<WebElement> cols = eachrow.findElements(By.tagName("td"));
//		int size2 = cols.size();
//		
//		for (int j = 0; j < size2 ; j++) {
//			String text = cols.get(j).getText();
//			System.out.println(text);
//		}
//	}
		
		

	}

}
