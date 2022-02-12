package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnImageLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		driver.manage().window().maximize();

		// Click on the "Facebook" logo on the upper left portion
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();

		// verify that we are now back on Facebook's homepage
		if (driver.getTitle().equals("Facebook - log in or sign up")) {
			System.out.println("We are back at Facebook's-log in or sign up");
		} else {
			System.out.println(" We are NOT in Facebook's homepage");
		}
		driver.close();

	}

}
