package interview;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interview {
	public static void main(String[] args) throws IOException {
		zoomFrame();
		
	}	

	public static void zoomFrame() throws IOException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		driver.executeScript("document.body.style.zoom='170%'", "");	
    		
	}
    	
    		
    		
	
}
