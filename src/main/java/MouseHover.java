import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	

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
	
	By reports = By.xpath("//a[contains(text(),'Exam Results')]/ancestor::ul//following-sibling::li[9]/a");
	By exportExammarks = By.xpath("(//a[contains(text(),'Export Exam Marks')])[1]");


	WebDriver driver;


	@Test
	public void demoMethod() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


		Loginname.findElement(driver).sendKeys("admin");
		password.findElement(driver).sendKeys("admin");
		school.findElement(driver).sendKeys("1");
		Login.findElement(driver).click();

		//Thread.sleep(2000);

		exams.findElement(driver).click();
		
		Actions act = new Actions(driver);
		act.moveToElement(reports.findElement(driver));
		act.moveToElement(exportExammarks.findElement(driver));
		act.click().build().perform();
		
		


	}
	
}

