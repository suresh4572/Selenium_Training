package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingMultipleDropdown {

	static WebDriver driver;

	@Test
	public void multipleDrodpwns() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		WebElement countrydrop =driver.findElement(By.name("Country"));
		selectDrop(countrydrop, "Greenland");
		/*WebElement statedrop =driver.findElement(By.name("State"));
		Thread.sleep(2000);
		Select sel = new Select(countrydrop); // casting the driver into select class
		sel.selectByVisibleText("Greenland");

		Thread.sleep(2000);
       	sel  = new Select(statedrop);
       	sel.deselectByValue("Arunachal Pradesh");
		 */

	}
	

	
	public static void selectDrop(WebElement ele , String value) {

		Select sel = new Select(ele);
	List<WebElement> dropoptions =sel.getOptions();
	
	for(WebElement option:dropoptions) {
		
		
		if(option.getText().equals(value)) {
			
			option.click();
		break;
		}
	}




	}




}
