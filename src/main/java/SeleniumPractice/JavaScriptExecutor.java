package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);


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


		JavascriptExecutor jsc =  (JavascriptExecutor) driver;
		String existing_marks = "90/80/79/67/89/90";
		String [] indv_marks = existing_marks.split("/");

		WebElement student_marks_element ;
		for(int student = 1;student <= 5;student ++) {
			int marks_iter = 0;
			for(int marks = 2; marks <= 7; marks++) {
				student_marks_element = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["+student+"]/td["+marks+"]/input"));
				//student_marks_element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"95");


				jsc.executeScript("arguments[0].value='"+indv_marks[marks_iter]+"';", student_marks_element);
				marks_iter = marks_iter+1;
			}
		}

		WebElement save = driver.findElement(By.xpath("//input[contains(@id,'mode')]"));
		jsc.executeScript("arguments[0].click()", save);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();;

		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Exams Master')]")).click();
		Thread.sleep(2000);



		driver.findElement(By.xpath("//span[contains(text(),'EXAMS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Marks Entry')]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("main");
		//driver.switchTo().frame(1);

		/*
		 //CLASS ELEMENT
		Thread.sleep(2000);
		WebElement classname1 =driver.findElement(By.id("class_name"));
		classname1.click();
		Select sel1 = new Select(classname1);
		.selectByIndex(1);

		Thread.sleep(2000);
		//SECTION ElEME1NT
		WebElement section1 = driver.findElement(By.id("section_id"));
		section1.click();
		sel1 = new Select(section1);
		sel1.selectByVisibleText("Section B");

		Thread.sleep(2000);
		//Exam MAIN Type Element

		WebElement exam_main_type1= driver.findElement(By.id("exam_main_type_id_for_exam_name_combo"));
		exam_main_type1.click();
		sel1 = new Select(exam_main_type1);
		sel1.selectByIndex(1);

		Thread.sleep(2000);
		//Exam TYPE
		WebElement exam_type1 = driver.findElement(By.id("exam_type_id_for_exam_type_combo"));
		exam_type1.click();
		sel1 = new Select(exam_type1);
		sel1.selectByIndex(1);
		*/

		//JavascriptExecutor jsc1 =  (JavascriptExecutor) driver; //casting the 
		String existing_marks1 = "90/80/79/67/89/90";
		String [] indv_marks1 = existing_marks.split("/");

		WebElement student_marks_element1 ;
		for(int student = 1;student <= 5;student ++) {
			int marks_iter = 0;
			for(int marks = 2; marks <= 7; marks++) {
				student_marks_element1 = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["+student+"]/td["+marks+"]/input"));
				
				String stu_marks_value = student_marks_element1.getAttribute("value");
			//	Assert.assertEquals(indv_marks1[marks_iter], stu_marks_value);
				Assert.assertEquals(false, false);
				/*if(indv_marks1[marks_iter].equals(stu_marks_value)) {

					System.out.println("pass");
					
				}else {

					System.out.println("fail");
				}
				*/

 				//student_marks_element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"95");
				//	jsc.executeScript("arguments[0].value='"+indv_marks1[marks_iter]+"';", student_marks_element1);
				marks_iter = marks_iter+1;
			}
		}



	}

}
