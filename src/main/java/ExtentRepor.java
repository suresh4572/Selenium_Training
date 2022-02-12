import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class ExtentRepor {


	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	WebDriver driver;

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
		extent.setSystemInfo("User Name", "Suresh");
	}

	@Test
	public void loadURl() throws InterruptedException {

		test = extent.createTest("MYDEMOTEST","Script start execution");

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.id("auth_user_name")).sendKeys("admin");
		driver.findElement(By.id("auth_password")).sendKeys("admin");
		driver.findElement(By.id("auth_school")).sendKeys("1");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'EXAMS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Marks Entry')] ")).click();
		//driver.switchTo().frame("1");
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.id("main")));

		//CLASS NAME
		WebElement classname = driver.findElement(By.xpath("//select[contains(@id,'class_name')]"));
		classname.click();
		//driver.findElement(By.xpath("//select[contains(@name,'class_name')]")).click();

		Select sel = new Select(classname);
		sel.selectByIndex(1);
		// Thread.sleep(500);

		// SECTION SELECT
		WebElement sectionname = driver.findElement(By.xpath("//select[contains(@id,'section_id')]"));
		sectionname.click();
		sel = new Select(sectionname);
		sel.selectByIndex(1);
		// Thread.sleep(500);

		//EXAM MAIN TYPE
		WebElement exammaintype = driver.findElement(By.id("exam_main_type_id_for_exam_name_combo"));
		exammaintype.click();
		sel = new Select(exammaintype);
		sel.selectByIndex(2);
		// Thread.sleep(500);

		//EXAM TYPE
		WebElement examtype= driver.findElement(By.id("exam_type_id_for_exam_type_combo"));
		examtype.click();
		sel = new Select(examtype);
		sel.selectByIndex(1);
		// Thread.sleep(500);

		//driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		JavascriptExecutor jse = (JavascriptExecutor)driver; // casting the driver into javaScript executor

		String existing_marks = "95/85/92/88/80/100";
		String[] indv_marks = existing_marks.split("/");

		//Adding values into textboxes
		WebElement student_marks_element ;
		for(int student = 1;student <= 5;student ++) {
			int marks_iter = 0;
			for(int marks = 2; marks <= 7; marks++) {
				student_marks_element = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["+student+"]/td["+marks+"]/input"));
				//student_marks_element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"95");
				jse.executeScript("arguments[0].value= '"+indv_marks[marks_iter]+"';",student_marks_element );
				marks_iter = marks_iter+1;
				// jse.executeScript("arguments[0].value= '"+existing_marks+"';",student_marks_element );
			}
		}
		WebElement save = driver.findElement(By.xpath("//input[contains(@id,'mode')]"));
		jse.executeScript("arguments[0].click()", save);

		// explicit wait - to wait for the compose button to be click-able
		/* WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'mode')]")));
		// click on the compose button as soon as the "compose" button is visible
		driver.findElement(By.xpath("//input[contains(@id,'mode')]")).click();
		 */
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		WebElement examMaster = driver.findElement(By.xpath("//a[contains(text(),'Exams Master')]"));
		examMaster.click();
		driver.findElement(By.xpath("//span[contains(text(),'EXAMS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Marks Entry')] ")).click();
		// Thread.sleep(20000);
		//driver.switchTo().frame("1");
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.id("main")));


		//JavascriptExecutor jse1 = (JavascriptExecutor)driver; // casting the driver into javaScript executor

		String existing_marks1 = "95/85/95/98/60/90";
		String[] indv_marks1 = existing_marks.split("/");


		//Adding values into textboxes
		WebElement student_marks_element1 ;
		for(int student = 1;student <= 5;student ++) {
			int marks_iter = 0;
			for(int marks = 2; marks <= 7; marks++) {
				student_marks_element1 = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["+student+"]/td["+marks+"]/input"));
				String stu_marks_value = student_marks_element1.getAttribute("value");
				//Assertion.assertNotEquals(indv_marks1[marks_iter], stu_marks_value);

				Assert.assertEquals(indv_marks1[marks_iter], stu_marks_value);
				test.info("Comparission completed Successfully");
				/* 
		 if(indv_marks1[marks_iter].equals(stu_marks_value) ) {
		System.out.println("PASS");

		} else {
		System.out.println("FAIL");
		} 
				 */
				marks_iter = marks_iter+1;
				//student_marks_element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"95");
				// jse.executeScript("arguments[0].value= '"+indv_marks[marks_iter]+"';",student_marks_element1 );
				// marks_iter = marks_iter+1;
				// jse.executeScript("arguments[0].value= '"+existing_marks+"';",student_marks_element );
			}
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

