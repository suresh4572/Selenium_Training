package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.eschool360.in/index.php\r\n");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("auth_user_name")).sendKeys("admin");
		driver.findElement(By.id("auth_password")).sendKeys("admin");
		driver.findElement(By.id("auth_school")).sendKeys("1");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(text(),'EXAMS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Marks Entry')]")).click();
		Thread.sleep(3000);
		// driver.switchTo().frame(1);
		// driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.id("main")));

		// CLASS NAME
		WebElement classname = driver.findElement(By.id("class_name"));
		classname.click();
		Select sel = new Select(classname);
		sel.selectByIndex(1);
		Thread.sleep(3000);

		// SECTION SELECT
		WebElement sectionName = driver.findElement(By.id("section_id"));
		sectionName.click();
		sel = new Select(sectionName);
		sel.selectByVisibleText("Section B");
		Thread.sleep(3000);

		// EXAM MIAN TYPE
		WebElement exammianType = driver.findElement(By.id("exam_main_type_id_for_exam_name_combo"));
		exammianType.click();
		sel = new Select(exammianType);
		sel.selectByIndex(2);
		Thread.sleep(3000);

		// EXAM TYPE
		WebElement examType = driver.findElement(By.id("exam_type_id_for_exam_type_combo"));
		examType.click();
		sel = new Select(examType);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		// Handling Web Tables
		WebElement student_marks_element;
		for (int student = 1; student <= 5; student++) {
			for (int marks = 2; marks <= 7; marks++) {
				student_marks_element = driver
						.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["
								+ student + "]/td[" + marks + "]/input"));
				student_marks_element.sendKeys(Keys.chord(Keys.CONTROL, "a"), "95");

			}

		}
		driver.findElement(By.xpath("//input[@id='mode']")).click();
		WebElement student_total_element = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr[5]/td[8]/input"));
		System.out.println(student_total_element.getAttribute("value"));
		
		WebElement  student_lablename =driver.findElement(By.xpath("//th[contains(text(),'Student')]"));
		System.out.println(student_lablename.getText());
		
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Exams Master')]")).click();
	


	}
}