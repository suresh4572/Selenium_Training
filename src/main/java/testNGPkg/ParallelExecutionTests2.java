package testNGPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionTests2 {

	@Test
	public void testM1() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='auth_user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='auth_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='auth_school']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		System.out.println(" i m in testM1");
	}

	@Test
	public void testM2()

	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='auth_user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='auth_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='auth_school']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@type='button']")).click();

		System.out.println(" i m in testM2");
	}

	@Test
	public void testM3() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='auth_user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='auth_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='auth_school']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@type='button']")).click();

		System.out.println(" i m in testM3");
	}

	@Test
	public void testM4() {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='auth_user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='auth_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='auth_school']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		System.out.println(" I am in testM4");
	}

}
