package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NopCommerceTest {

	WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	public void setExtent() {
		htmlReporter = new ExtentHtmlReporter("extentReport.html");

		htmlReporter.config().setDocumentTitle("Automation Report"); // Title of the report
		htmlReporter.config().setReportName("Fluntional Report");// Name of the report
		htmlReporter.config().setTheme(Theme.DARK); // Theme of the Report

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Tester", "Suresh");
		extent.setSystemInfo("Browser", "Chrome");

	}

	@AfterTest
	public void endReport() {
		driver.close();
		driver.quit();
		extent.flush();
	}

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void nopCommerceTitleTest() {
		test = extent.createTest("nopCommerceTitleTest");

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "nopCommerceTitleTest");

	}

	@BeforeClass
	public void test() {
		
	}
	@Test
	public void nopCommerceLogoTest() {

		test = extent.createTest("nopCommerceLogoTest");
		Boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertTrue(status);
	}

	@Test
	public void nopCommertceLoginTest() {
		test = extent.createTest("nopCommertceLoginTest");
		Assert.assertTrue(true);

	}

}
