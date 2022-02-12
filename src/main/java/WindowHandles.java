import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

		String MainWindow = driver.getWindowHandle();

		// To handle all new opened windows
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> it = s1.iterator();

		while (it.hasNext()) {

			String childWindow = it.next();
			
			if (!MainWindow.equalsIgnoreCase(childWindow)) {

				// Switching to Child Window
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("sureshbala880@gmail.com");
				driver.findElement(By.name("btnLogin")).click();

				// closing child window

				driver.close();
			}
		}
		// Swithching to parent window
		driver.switchTo().window(MainWindow);

	}

}
