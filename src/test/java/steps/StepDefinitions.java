package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {
	public ChromeDriver driver;
	@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	   
	}
	@Given("Load the application url")
	public void load_the_application_url() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	    
	}
	@Given("Enter username as {string}")
	public void enter_username_as_Demosalesmanage(String uName) {
       driver.findElement(By.id("username")).sendKeys(uName);
	}
	@Given("Enter password as {string}")
	public void enter_password_as_crmsfa(String pWord) {
	  driver.findElement(By.id("password")).sendKeys(pWord);
	}
	@When("Click on login button")
	public void click_on_login_button() {
	  driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
	    boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	    if(displayed) {
	    	System.out.println("Homepage is displayed");
	    }else
	    {
	    	System.out.println("Homepage is not displayed");
	    }
	}

	
	
}
