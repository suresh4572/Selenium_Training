import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MultipleKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.navigate().to("http://textcompare.com/");
		driver.manage().window().maximize();

		WebElement input1 = driver.findElement(By.name("frm_compare_1"));
		
		WebElement input2 = driver.findElement(By.name("frm_compare_2"));

		input1.sendKeys("Welcome to Selenium");

		Actions act = new Actions(driver);

		// CTRL+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// CTRL+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// TAB --->Shit to input2 box
		act.sendKeys(Keys.TAB);
		act.perform();

		// CTRL+V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// compare texts
		
	if (input1.getAttribute("value").equals(input2.getAttribute("value")))
			System.out.println("Text copied");
		else
			System.out.println("Not copied");

	}

}
