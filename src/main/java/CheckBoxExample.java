import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxExample {


	WebDriver driver;

	@Test
	public void checkbox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.findElement(By.id("auth_user_name")).sendKeys("admin");
		driver.findElement(By.id("auth_password")).sendKeys("admin");
		driver.findElement(By.id("auth_school")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='Login']")).click();

		driver.findElement(By.xpath("//span[contains(text(),'SETUP')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Class Master')]")).click();
		Thread.sleep(3000);

		driver.switchTo().frame("main");


		String radioButton= driver.findElement(By.xpath("//input[@id='chkAll']")).getAttribute("value");
		System.out.println(" Radio button ::"+radioButton);



		driver.findElement(By.xpath("//input[@id='chkAll']")).click();



	}

}
