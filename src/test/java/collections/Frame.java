package collections;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("yes"));
//		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
//		File file = new File("./snaps/IMG003.png");
//		FileUtils.copyFile(screenshotAs, file);

		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File file = new File("./snaps/IMG0003.png");
		FileUtils.copyFile(screenshotAs, file);
		
		
		
		
		
		
		//		driver.findElement(By.id("home")).click();
//		Set<String> windowHandles = driver.getWindowHandles();
//		ArrayList<String> list = new ArrayList<>(windowHandles);
//		driver.switchTo().window(list.get(1));
//		driver.findElement(By.linkText("Edit")).click();
//		
		
		
		
		
//		WebElement iframe = driver.findElement(By.id("(//iframe)[1]"));
//		driver.switchTo().frame(iframe);
//		driver.findElement(By.id("Click")).click();
//	    driver.switchTo().defaultContent();	
	}

}
