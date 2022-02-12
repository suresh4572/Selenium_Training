import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Demo {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	WebDriver driver;
	@BeforeMethod
	public void Method() {
		System.out.println(" Iam in before Method ");
		htmlReporter = new ExtentHtmlReporter("extentReport.html");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Automation report V4");
		htmlReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Application Name", "Application");
	}

	@AfterMethod
	public void Method2() {
		test.info("Test executed successfully");
		//driver.close();
		driver.quit();
		extent.flush();
		System.out.println(" Iam in afterMethod ");
	}

	@Test
	public void testMethod() {
		test = extent.createTest("MYDEMOTEST","Script start execution");
		System.out.println(" Iam in testMethod ");

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
}
