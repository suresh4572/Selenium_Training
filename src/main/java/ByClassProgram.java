import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import SeleniumPractice.Alert;

public class ByClassProgram {

	public static By Loginname = By.id("auth_user_name");
	public static By password = By.id("auth_password");
	public static By school = By.id("auth_school");
	public static By Login = By.name("Login");

	public static By exams = By.xpath("//span[contains(text(),'EXAMS')]");
	public static By marksEntry = By.xpath("//a[contains(text(),'Marks Entry')]");

	public static By main = By.id("main");

	public static By className = By.xpath("//select[contains(@id,'class_name')]");
	public static By section_id = By.xpath("//select[contains(@id,'section_id')]");
	public static By examname = By.id("exam_main_type_id_for_exam_name_combo");
	public static By exam_type = By.id("exam_type_id_for_exam_type_combo");

	public static By save=By.xpath("//input[contains(@id,'mode')]");
	public static By exammaster =By.xpath("//a[contains(text(),'Exams Master')]");


	WebDriver driver;


	@Test
	public void demoMethod() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();

		Loginname.findElement(driver).sendKeys("admin");
		password.findElement(driver).sendKeys("admin");
		school.findElement(driver).sendKeys("1");
		Login.findElement(driver).click();

		Thread.sleep(2000);

		exams.findElement(driver).click();
		marksEntry.findElement(driver).click();

		driver.switchTo().frame(main.findElement(driver));

		className.findElement(driver).click();
		Select sel = new Select(className.findElement(driver));
		sel.selectByIndex(1);
		Thread.sleep(2000);

		section_id.findElement(driver).click();
		sel = new Select(section_id.findElement(driver));
		sel.selectByIndex(1);
		Thread.sleep(2000);

		examname.findElement(driver).click();
		sel = new Select(examname.findElement(driver));
		sel.selectByIndex(2);
		Thread.sleep(2000);

		exam_type.findElement(driver).click();
		sel = new Select(exam_type.findElement(driver));
		sel.selectByIndex(1);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		JavascriptExecutor jse = (JavascriptExecutor) driver; // casting the driver into JacascriptExecutor

		Thread.sleep(3000);
		//adding marks into webtable textboxes
		String 	student_Existing_Marks = "98/97/96/95/94/93";
		String[] indv_marks = student_Existing_Marks.split("/");

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
		save.findElement(driver).click();
		Thread.sleep(2000);

		//Accepting the alert 
      driver.switchTo().alert().accept();;
		

		driver.switchTo().defaultContent();
         Thread.sleep(2000);
         
		exammaster.findElement(driver).click();
		exams.findElement(driver).click();
		marksEntry.findElement(driver).click();
		
		
		driver.switchTo().frame(main.findElement(driver));
		
				//adding the marks into webtable textboxes
		String 	student_Existing_Marks1 = "98/97/96/95/94/93";
		String[] indv_marks1 = student_Existing_Marks.split("/");


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

		}
		
	driver.close();

	}
	
}


