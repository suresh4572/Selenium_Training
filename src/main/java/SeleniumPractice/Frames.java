package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");


		driver.manage().window().maximize();


		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		Thread.sleep(2000);

		WebElement outerframe =driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));

		driver.switchTo().frame(outerframe);
		WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));

		driver.switchTo().frame(innerframe);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi ");


	}

}
