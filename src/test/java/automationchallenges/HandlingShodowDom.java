package automationchallenges;

import java.time.Duration;

import org.apache.poi.sl.usermodel.Shadow;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingShodowDom {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		  driver.get("https://developer.servicenow.com/dev.do");
		  
	
		  
	}

}
