import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Demo360_ {


	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	WebDriver driver;

	By username_s = By.id("auth_user_name");
	By password_s = By.id("auth_password");
	By school_s = By.id("auth_school");
	By login_s = By.name("Login");
	By studentsOption_s = By.xpath("//span[contains(text(),'STUDENTS')]");
	By studentsAttendenceOption_s = By.id("(//a[contains(text(),'Students Attendance')])[1]");
	By className_s = By.id("class_name");
	By sectionId_s = By.id("sectionId");
	
	public static By sectionname =By.xpath("//select[contains(@id,'section_id')]");
	
	By exams_s = By.xpath("//span[contains(text(),'EXAMS')]");
	By marksEntry_s = By.xpath("(//a[contains(text(),'Marks Entry')])[1]");
	By examMainType_s = By.id("exam_main_type_id_for_exam_name_comb");
	By ExamType_s = By.id("exam_type_id_for_exam_type_combo");

	@BeforeMethod
	public void extentReportSetup() {
		System.out.println(" I am in BeforeTest");

		htmlReporter = new ExtentHtmlReporter("extentReport.html");

		htmlReporter.config().setDocumentTitle("Automation Report"); //Title of Report
		htmlReporter.config().setReportName("Extent Report V4");// Name of the Report
		htmlReporter.config().setTheme(Theme.DARK); // Theme of the Reprot

		//Create object of ExtentReports
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		//General information related to application
		extent.setSystemInfo("Application Name", "Application");

	}



	@Test
	public void loadURl() throws InterruptedException {

		test = extent.createTest("MYDEMOTEST","Script start execution");

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.navigate().to("https://demo.eschool360.in/index.php");
 		Thread.sleep(2000);
 		driver.manage().window().maximize();
 		
 		username_s.findElement(driver).sendKeys("admin");
 		password_s.findElement(driver).sendKeys("admin");
 		school_s.findElement(driver).sendKeys("1");
 		login_s.findElement(driver).click();
 		Thread.sleep(2000);
 		
 		exams_s.findElement(driver).click();
 		Thread.sleep(2000);
 		marksEntry_s.findElement(driver).click();
 		Thread.sleep(2000);
 		
 		WebElement frameElement = driver.findElement( By.xpath("//*[@id='main']"));
 		driver.switchTo().frame(frameElement);
 		
 		Select select;
 		className_s.findElement(driver).click();
 		select = new Select(driver.findElement(className_s));
 		select.selectByIndex(2);
 		Thread.sleep(1000);
	
 		
 		sectionname.findElement(driver).click();
 		
 		select = new Select(driver.findElement(sectionname));
 		select.selectByIndex(2);
 		Thread.sleep(1000);
		
		 	
		 	


		
		
		
		
		
		
		 

		
		
		test.info("Test executed Successfully");

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
		extent.flush();
	}




}

