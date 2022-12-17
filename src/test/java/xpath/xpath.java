package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		WebElement element = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		boolean selected = element.isSelected();
		System.out.println(selected);
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
	
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
	
	}

}
