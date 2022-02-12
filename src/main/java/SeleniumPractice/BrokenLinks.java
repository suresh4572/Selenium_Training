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

public class BrokenLinks {

	WebDriver driver;

	@Test
	public void brokenLink() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		driver.get("http://newtours.demoaut.com.cutestat.com/");

		driver.manage().window().maximize();
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));

		System.out.println("Total no of links is available in page :: " + totalLinks.size());

		for (int i = 0; i <= totalLinks.size(); i++) {

			// By using href tag we can get url of required link
			WebElement ele = totalLinks.get(i);
			String url = ele.getAttribute("href");

			URL link = new URL(url);
			Thread.sleep(2000);

			// creating a connect by using link object
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			// establish connection
			httpconn.connect();
			int rescode = httpconn.getResponseCode();
			if (rescode >= 400) {
				System.out.println(url + " --" + " is broken link  ::");
			} else {

				System.out.println(url + " -- " + "is valid url");
			}

		}

	}

}
