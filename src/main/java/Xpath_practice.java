import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_practice {

	WebDriver driver;

	public void url_launch() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.eschool360.in/index.php\r\n");
		driver.manage().window().maximize();
		driver.findElement(By.id("auth_user_name")).sendKeys("admin");
		driver.findElement(By.id("auth_password")).sendKeys("admin");
		driver.findElement(By.id("auth_school")).sendKeys("1");
		driver.findElement(By.name("Login")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'EXAMS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Marks Entry')]")).click();
		Thread.sleep(2000);

		//driver.switchTo().frame("main");
		
		//driver.switchTo().frame(1);
		driver.switchTo().frame(driver.findElement(By.id("main")));
		
		WebElement classname = driver.findElement(By.xpath("//select[contains(@id,'class_name')]"));
		
		classname.click();
		
		Select select = new Select(classname);
		select.selectByIndex(1);
		
		WebElement section = driver.findElement(By.xpath("//select[contains(@id,'section_id')]"));
		section.click();
		
		select = new Select(section);
		select.selectByVisibleText("Section A");
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Xpath_practice object = new Xpath_practice();
		object.url_launch();
	}

}
