import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {
	
	WebDriver driver;
	
	@Test
	public void application() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 driver.findElement(By.id("auth_user_name")).sendKeys("admin");
		 driver.findElement(By.id("auth_password")).sendKeys("admin");
		 driver.findElement(By.id("auth_school")).sendKeys("1");
		  driver.findElement(By.xpath("//input[@name='Login']")).click();
		  
		  driver.findElement(By.xpath("//span[contains(text(),'COMMUNICATION')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'Send Voice Message')]")).click();
		  //Thread.sleep(12000);
		  
		  driver.switchTo().frame("main");
		  
		String radioButtonStatus= driver.findElement(By.xpath("(//input[contains(@name,'sms_sending_method')])[2]")).getAttribute("checked");
		System.out.println("radio button status ::"+radioButtonStatus);
		
		if(radioButtonStatus==null) {
			
			driver.findElement(By.xpath("(//input[contains(@name,'sms_sending_method')])[2]")).click();
		}
		
		 

	}
	
	

}
