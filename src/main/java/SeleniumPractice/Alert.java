package SeleniumPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).submit();
		//Switching to Alert
		
		Thread.sleep(2000);
	driver.switchTo().alert();
		
		//Cpapturing alert message
		String alertMessage = driver.switchTo().alert().getText();
	System.out.println("Display alert message ::"+alertMessage);
	
	//Accepting alert
	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	
	}

}
