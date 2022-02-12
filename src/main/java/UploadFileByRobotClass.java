import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumPractice.JavaScriptExecutor;

public class UploadFileByRobotClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		/*
		// using sendkeys()
		 driver.findElement(By.xpath("(//input[@id='file-upload'])")).sendKeys("E:\\01-02-21\\Selenium\\log.txt");
		*/
		
		// Using Robot Class methods
		WebElement button = driver.findElement(By.xpath("(//input[@id='file-upload'])"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button); // click action on the button
		
		/*
		  1)copy the path
		   2)CTRL+V 
		   3)Enter
		 */
		Robot rb = new Robot();
		rb.delay(2000);
		// put path to file in clipboard
		StringSelection ss = new StringSelection("E:\\01-02-21\\Selenium\\Selenium Inter Questions.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL);// Press on Control
		rb.keyPress(KeyEvent.VK_V);    // press on V

		rb.keyRelease(KeyEvent.VK_CONTROL); 
		rb.keyRelease(KeyEvent.VK_V); 

		// ENTER
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
