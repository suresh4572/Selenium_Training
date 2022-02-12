package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();


		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]   
		//*[@id="customers"]/tbody/tr[4]/td[1]
 
		
   //Company
		String beforeXpath="//*[@id='customers']/tbody/tr[";
		String afterXpath ="]/td[1]";
		for(int row =2;row<=7;row++) {
			String acutualXpath = beforeXpath+row+afterXpath;
			WebElement element = driver.findElement(By.xpath(acutualXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Island Trading")) {
				System.out.println("company name: "+element.getText()+"is found at position : "+(row-1));
				break;
			}

		}
		
		
		System.out.println("******************");
		
		//Contact 
		String afterXpathContact ="]/td[2]";
		for(int row =2;row<=7;row++) {
			String acutualXpath = beforeXpath+row+afterXpathContact;
			WebElement element = driver.findElement(By.xpath(acutualXpath));
			System.out.println(element.getText());
		}
		
		System.out.println("******************");
		
		//Country
		String afterXpathCountry ="]/td[3]";
		for(int row =2;row<=7;row++) {
			String acutualXpath = beforeXpath+row+afterXpathContact;
			WebElement element = driver.findElement(By.xpath(acutualXpath));
			System.out.println(element.getText());
		}
		
		
		


	}

}
