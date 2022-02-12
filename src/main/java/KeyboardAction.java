import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.navigate().to("http://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		//WebElement search = driver.findElement(By.id("small-searchterms"));
		//search.sendKeys(Keys.chord(Keys.CONTROL,"a"),"Suresh");
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);

	
		
	}

}

