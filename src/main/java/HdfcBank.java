import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HdfcBank {

	WebDriver driver;
	
	@Test 
	public void demo() {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	WebElement Desktops =driver.findElement(By.xpath("//a[text()='Desktops']"));
	WebElement Mac =driver.findElement(By.xpath("//a[text()='Mac (1)']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(Desktops).build().perform();
	act.moveToElement(Mac).click().build().perform();
	
	
	
	
//	act.contextClick(Desktops).build().perform(); // perform the right click action
	/*WebElement HousingLoans = driver.findElement(By.xpath("(//a[text()='Housing Loans	'])[2]"));
	
	act.moveToElement(HousingLoans);
	
	WebElement HomeLoan = driver.findElement(By.xpath("(//a[text()='Home Loans'])[2]"));
	
	act.moveToElement(HomeLoan).click().build().perform();
	*/

}
}