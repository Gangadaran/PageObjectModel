package com.leaftaps.ui.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.leaftaps.utils.ReadExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static RemoteWebDriver driver;
	public String excelFileName;

	public static ExtentReports extent;
	public static ExtentTest test, node;
	public String testName, testDescription, testAuthor, testCategory; // initial value is null

	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@BeforeClass
	public void testCaseDetails() {
		test = extent.createTest(testName, testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
	}

	public int takeSnap() throws IOException {
		int ranNum = (int) (Math.random()*9999999+10000000);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/img"+ranNum+".png"); //img11400268.png
		FileUtils.copyFile(source, target);
		return ranNum;
	}

	// 2inputs -> stepDesc, status (pass/fail)
	public void reportStep(String stepDesc, String status) throws IOException {
		if (status.equalsIgnoreCase("pass")) {
			int ranNum = takeSnap();
			node.pass(stepDesc, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+ranNum+".png").build());
		} else if (status.equalsIgnoreCase("fail")) {
			int ranNum = takeSnap();
			node.fail(stepDesc, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+ranNum+".png").build());
			throw new RuntimeException("Please check the report for more details");
		}

	}

	@AfterSuite
	public void stopReport() {
		extent.flush();
	}

	@Parameters({ "browserName", "URL" })
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		node = test.createNode(testName);
		
			
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@DataProvider(/* indices = 0 */)
	public String[][] testData() throws IOException {
		return ReadExcelData.getData(excelFileName);
	}
}
