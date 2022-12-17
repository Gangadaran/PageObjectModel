package automationchallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		
		driver.executeScript("arguments[0].scrollIntoView();", element);
		
		
		
		
		//driver.quit();
	}

}
