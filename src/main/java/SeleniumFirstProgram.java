import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProgram {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='auth_user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='auth_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='auth_school']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@type='button']")).click();
	}

}
