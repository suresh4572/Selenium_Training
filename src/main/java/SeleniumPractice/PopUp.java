package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		String mainWindow =driver.getWindowHandle();
		
		
		//To handle all new opened window
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> it = s1.iterator();
		while(it.hasNext()) {
			
			String ChildWindow =it.next();
			
			if(!mainWindow.equalsIgnoreCase(ChildWindow))
					{
				
				//Switching to child window
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("sureshbala880@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				
				//Closing the child window
				driver.close();
				
			}
		}
		 // Switching to Main window 
		driver.switchTo().window(mainWindow);
	}

}
