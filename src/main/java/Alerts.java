import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

	WebDriver	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("cusid")).sendKeys("suresh");
		driver.findElement(By.name("submit")).click();
		
		//Switching to alert message
		driver.switchTo().alert();
		
		String alertmessge =driver.switchTo().alert().getText();
		
		System.out.println(alertmessge);
		Thread.sleep(2000);
		
		//Accepting alert
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
