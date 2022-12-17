package automationchallenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String path = System.getProperty("user.dir");
	
	
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	driver.findElement(By.id("resumeUpload")).sendKeys(path+"\\data\\01 Agile Methodology.pptx");
}
}
