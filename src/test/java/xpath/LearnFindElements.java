package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement mobileNames : elements) {
			System.out.println(mobileNames.getText());
		}
	}

}
