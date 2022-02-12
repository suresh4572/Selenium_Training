package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("auth_user_name")).sendKeys("admin");
		driver.findElement(By.id("auth_password")).sendKeys("admin");  
		driver.findElement(By.id("auth_school")).sendKeys("1");
		driver.findElement(By.name("Login")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'EXAMS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Marks Entry')]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("main");
		//driver.switchTo().frame(1);

		//CLASS ELEMENT
		Thread.sleep(2000);
		WebElement classname =driver.findElement(By.id("class_name"));
		classname.click();
		Select sel = new Select(classname);
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		//SECTION ElEMENT
		WebElement section = driver.findElement(By.id("section_id"));
		section.click();
		sel = new Select(section);
		sel.selectByVisibleText("Section B");
		
		Thread.sleep(2000);
		//Exam MAIN Type Element
		
		WebElement exam_main_type= driver.findElement(By.id("exam_main_type_id_for_exam_name_combo"));
		exam_main_type.click();
		sel = new Select(exam_main_type);
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		//Exam TYPE
		WebElement exam_type = driver.findElement(By.id("exam_type_id_for_exam_type_combo"));
		exam_type.click();
		sel = new Select(exam_type);
		sel.selectByIndex(1);

		//Handling WebTables

		WebElement Student_marks_element;
		for(int student= 1;student<= 5;student++) {

			for(int marks=2;marks<=7;marks++) {

				Student_marks_element = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr[" +student+ "]/td[" +marks+ "]/input"));
				Student_marks_element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"98");
			}
		}
		
		driver.findElement(By.id("mode")).click();
		WebElement student_total_element = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr[5]/td[3]/input"));
		System.out.println(student_total_element.getAttribute("value"));

		WebElement student_lablename = driver.findElement(By.xpath("//th[contains(text(),'Student')]"));
		System.out.println(student_lablename.getText());
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Exams Master')]")).click();

	}

}
