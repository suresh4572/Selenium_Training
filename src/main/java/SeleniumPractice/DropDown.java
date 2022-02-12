package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement dropdown =driver.findElement(By.name("country"));
		dropdown.click();
		
		Select dropCountry = new Select(dropdown);
		dropCountry.selectByIndex(2);
		System.out.println("Select Index is Selected");
		dropCountry.selectByVisibleText("INDIA");
		System.out.println("Select By visible Text Selected");*/
		
		//Selecting Items in a Multiple Select elements
		driver.get("http://jsbin.com/osebed/2");
		 WebElement muliple = driver.findElement(By.id("fruits"));
		Select fruits = new Select(muliple);
		fruits.deselectByVisibleText("Banana");
		fruits.selectByIndex(1);
	}

}
