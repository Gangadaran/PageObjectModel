package collections;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
		
		WebDriverManager.chromedriver().setup();
		
	
		
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node09n58r9iaz8ikyokk7dgnvaqc348234.node0");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]"));
		element.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("This is Gangadaran");
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alert.accept();
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		driver.quit();
	}

}
