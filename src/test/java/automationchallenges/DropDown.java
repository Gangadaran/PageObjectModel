package automationchallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
	
	WebElement dropDown = driver.findElement(By.id("dropdown1"));
	
	Select dd = new Select(dropDown);
	dd.deselectByIndex(2);
	
	
}
}
