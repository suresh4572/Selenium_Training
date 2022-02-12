import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//*[contains(@class,'ico-user sprite-image')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("suresh");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//*[contains(@class,'custom-control-label')]")).click();
		driver.findElement(By.xpath("//*[contains(@value,'Log in')]")).click();
		//driver.findElement(By.)*/
	

	}

}
