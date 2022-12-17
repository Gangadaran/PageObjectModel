package xpath;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		
		/*WebElement elementTable = driver.findElement(By.tagName("table"));
		List<WebElement> row = elementTable.findElements(By.tagName("tr"));
	
		for (int i = 1; i <row.size(); i++) {
			 WebElement eachRow = row.get(i);
			 List<WebElement> cols = eachRow.findElements(By.tagName("td"));
			 for (int j = 0; j < args.length; j++) {
				System.out.println(cols.get(j).getText());
			}
		}*/
		
		
//		WebElement table = driver.findElement(By.tagName("table"));
//		List<WebElement> row = table.findElements(By.tagName("tr"));
//		for (int i = 1; i <row.size(); i++) {
//			WebElement eachRow = row.get(i);
//			List<WebElement> cols = eachRow.findElements(By.tagName("td"));
//			for (int j = 0; j < cols.size(); j++) {
//				String text = cols.get(j).getText();
//				System.out.println(text);
//			}
//		}v
//	
//		driver.quit();
		
		
		WebElement table = driver.findElement(By.tagName("table"));
        List<WebElement> row = table.findElements(By.tagName("tr"));
        int size = row.size();
        
        
		
		for (int i = 0; i < size; i++) {
			
			WebElement Eachrow = row.get(i);
		
			
			
		}
		
	
	}
	

}
