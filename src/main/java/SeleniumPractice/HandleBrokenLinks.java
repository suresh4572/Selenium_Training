package SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleBrokenLinks {
	
	WebDriver driver;
	
	
	@Test
	public void handleBrowserWindows() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
 
		 driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		
		links.size();
		int brokenlinks=0;
		
		for(WebElement ele :links) {
			
			String url =ele.getAttribute("href");
			
			URL link = new URL(url);
			
			HttpURLConnection httpConnect = (HttpURLConnection) link.openConnection();
			httpConnect.connect();
			if(httpConnect.getResponseCode()>=400) {
				
				System.out.println(url+" is " +"  Brokenlinks");
				brokenlinks++;
				
			}else{
				System.out.println(url+" is " +"  Validlinks");
				
			}
							
		}
		
		System.out.println(" The number of BrokenLinks ::"+brokenlinks);
		driver.quit();
	}
	

}
