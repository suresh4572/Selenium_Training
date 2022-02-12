package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpLoadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement inputFile =driver.findElement(By.xpath("//*[@id=\'uploadfile_0']"));

		//enter the file path onto the file=selection input file
		inputFile.sendKeys("E:\\01-02-21\\Selenium\\Selenium Inter Questions_2.docx");

		//Check the "I accept the terms of service" check box
		driver.findElement(By.xpath("//a[text()='terms of service']")).click();

		//click the "UploadFile" button
		driver.findElement(By.name("send")).click();


	}

}
