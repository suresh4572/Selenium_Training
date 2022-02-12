import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();

		WebElement searchBox=driver.findElement(By.id("autocomplete"));

		

		searchBox.clear();
		Thread.sleep(3000);
		searchBox.sendKeys("Toronto");
		Thread.sleep(3000);
		String text;

		do {
			searchBox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			text=searchBox.getAttribute("value");
			if(text.equals("Toronto NSW, Australia")) {
				searchBox.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(2000);

		}while(!text.isEmpty());
	}
}

