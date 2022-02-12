package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	/*	driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();

		WebElement radio1 =driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 =driver.findElement(By.id("vfb-7-2"));

		//Radio Button1 is selected
		radio1.click();
		System.out.println("Radio Button Option1 is Selected");

		//Radio Buttons1 is de-selected and Radion Button2 is selected

		radio2.click();
		System.out.println("Radio Button Option2 is Selected");

		//Selection CheckBox

		WebElement option1 = driver.findElement(By.id("vfb-6-0"));

		//This will toggle the the CheckBox
		option1.click();
		//Check whether the Check box is toggled on
		if(option1.isSelected()) {

			System.out.println("Checkbox is Toggled On");

		}
		else {
			System.out.println("Check box is Toggled off");*/


			//Selecting CheckBox and using isSelected Method
			driver.get("http://demo.guru99.com/test/facebook.html");
			driver.manage().window().maximize();
			WebElement chFBPersist = driver.findElement(By.id("persist_box"));

			for(int i=0;i<2;i++) {

				chFBPersist.click();
				System.out.println("Facebook Persists Checkbox Status is - "+chFBPersist.isSelected());

			}
			//driver.close();
		}
	}

