import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
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

public class PageFactroyModel_demo360_ {

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	WebDriver driver;

	// Pagefactory syntax using FindBy
	
	@FindBy(id = "auth_user_name")WebElement loginName;
	@FindBy(id = "auth_password")WebElement password;
	@FindBy(id = "auth_school")WebElement schoolName;
	@FindBy(name = "Login")WebElement login;
	@FindBy(name = "Login")List<WebElement> login_exists;

	@FindBy(xpath = "//span[contains(text(),'EXAMS')]")WebElement exams;
	@FindBy(xpath = "//a[contains(text(),'Marks Entry')]")WebElement marksEntry;
	

	@FindBy(id = "main")WebElement main;
	@FindBy(xpath = "//select[contains(@id,'class_name')]")	WebElement className;
	@FindBy(xpath = "//select[contains(@id,'section_id')]")WebElement sectionName;
	@FindBy(id = "exam_main_type_id_for_exam_name_combo")	WebElement examMainType;
	@FindBy(id = "exam_type_id_for_exam_type_combo")WebElement examType;
	@FindBy(xpath = "//input[contains(@id,'mode')]")WebElement save;

	@FindBy(xpath = "//input[contains(@id,'mode')]")List<WebElement> save_exist;
	@FindBy(xpath = "//a[contains(text(),'Exams Master')]")WebElement examMaster;

	@BeforeMethod
	public void extentReportSetup() {
		System.out.println(" I am in BeforeTest");

		htmlReporter = new ExtentHtmlReporter("extentReport.html");

		htmlReporter.config().setDocumentTitle("Automation Report"); // Title of Report
		htmlReporter.config().setReportName("Extent Report V4");// Name of the Report
		htmlReporter.config().setTheme(Theme.DARK); // Theme of the Reprot

		// Create object of ExtentReports
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// General information related to application
		extent.setSystemInfo("Application Name", "Application");

	}

	@Test
	public void loadURl() throws InterruptedException {

		test = extent.createTest("MYDEMOTEST", "Script start execution");

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

		driver = new ChromeDriver();

		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 40),this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.eschool360.in/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		test.info("Page loaded");

		System.out.println(loginName);
		loginName.sendKeys("admin");
		password.sendKeys("admin");
		schoolName.sendKeys("1");
		login.click();
		Thread.sleep(12000);

		exams.click();
		marksEntry.click();
		
		
		driver.switchTo().frame(main);

		// CLASS NAME
		className.click();
		Select sel = new Select(className);
		sel.selectByIndex(1);
		Thread.sleep(2000);

		// SECTION SELECT
		sectionName.click();
		sel = new Select(sectionName);
		sel.selectByIndex(1);
		Thread.sleep(2000);

		// EXAM MAIN TYPE
		examMainType.click();
		sel = new Select(examMainType);
		sel.selectByIndex(2);
		Thread.sleep(2000);

		// EXAM TYPE
		examType.click();
		sel = new Select(examType);
		sel.selectByIndex(1);
		Thread.sleep(2000);

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		test.info("Exams marks loaded successful");

		JavascriptExecutor jse = (JavascriptExecutor) driver; // casting the driver into javaScript executor

		String existing_marks = "95/85/92/88/80/100";
		String[] indv_marks = existing_marks.split("/");

		// Adding values into textboxes
		WebElement student_marks_element;
		for (int student = 1; student <= 5; student++) {
			int marks_iter = 0;
			for (int marks = 2; marks <= 7; marks++) {
				student_marks_element = driver
						.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["
								+ student + "]/td[" + marks + "]/input"));

				jse.executeScript("arguments[0].value= '" + indv_marks[marks_iter] + "';", student_marks_element);
				marks_iter = marks_iter + 1;
			}
		}

		
		System.out.println("save button exists ::" + save_exist.size());
		if (save_exist.size() > 0) {
			jse.executeScript("arguments[0].click()", save);
			test.info("Marks updation done");
			Thread.sleep(2000);
		}

		Alert alert = driver.switchTo().alert();
		alert.accept();
		test.info("Alert option sucessfully");

		driver.switchTo().defaultContent();
		examMaster.click();
		Thread.sleep(2000);
		
		exams.click();
		marksEntry.click();
		Thread.sleep(2000);

		driver.switchTo().frame(main);

		// JavascriptExecutor jse1 = (JavascriptExecutor)driver; // casting the driver into javaScript executor

		String existing_marks1 = "95/85/95/98/60/90";
		String[] indv_marks1 = existing_marks.split("/");

		//Adding values into textboxes
		WebElement student_marks_element1;
		for (int student = 1; student <= 5; student++) {
		int marks_iter = 0;
		for (int marks = 2; marks <= 7; marks++) {
			student_marks_element1 = driver
						.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["
								+ student + "]/td[" + marks + "]/input"));
			String stu_marks_value = student_marks_element1.getAttribute("value");

			Assert.assertEquals(indv_marks1[marks_iter], stu_marks_value);
				marks_iter = marks_iter + 1;
			}
			test.info(" Row Comparison completed Successfully");
		}
		test.info("Test executed Successfully");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
		extent.flush();
	}

}
