import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class Demo2 {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" Iam in before Method ");
		htmlReporter = new ExtentHtmlReporter("extentReport.html");
		htmlReporter.config().setDocumentTitle("Automation Report"); //Title of Report
		htmlReporter.config().setReportName("Extent Report V4");// Name of the Report
		htmlReporter.config().setTheme(Theme.DARK); // Theme of the Reprot
		//Create object of ExtentReports
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		//General information related to application
		//extent.setSystemInfo("Application Name", "Application");
		extent.setSystemInfo("User Name", "Suresh");
	}
	
	@Test
	public void testMethod() {
		test = extent.createTest("MYDEMOTEST","Script start execution");

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
		extent.flush();
	}
}
