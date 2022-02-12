import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	WebDriver driver;

	public void url_Launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://demo.eschool360.in/index.php");

		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"auth_user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"auth_password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"auth_school\"]")).sendKeys("1");
		driver.findElement(By.className("formBtnblue")).click();

		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirstSeleniumScript obj = new FirstSeleniumScript();
		obj.url_Launch();

	}

}
