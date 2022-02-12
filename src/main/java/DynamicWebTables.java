import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.navigate().to("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();

		//Login
		WebElement username =driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");

		WebElement password =driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.className("btn btn-primary")).click();

		//Sales-->Orders

		driver.findElement(By.xpath("//a[text()=' Sales']")).click();

		driver.findElement(By.xpath("//a[text()='Orders']")).click();


		//Table

		//1)Find the Total Number of pages in table
		String text =	driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		System.out.println(text); //Showing 1 to 20 of 11239 (562 Pages)

		//text.indexOf("(");
		//text.indexOf("Pages");
		int total_pages =Integer.valueOf(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));

		System.out.println("Total number of pages:::::>>>> "+total_pages);
		//2)Find How many rows exists in each pages
		for(int p=1;p<=5;p++) {

			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li/span"));
			System.out.println("Active page:"+active_page.getText());
			active_page.click();

			//Total number of rows in a page
			int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
			System.out.println("Number of rows:::>> "+rows );

			//Read all the rows from each

			for(int r=1;r<=rows;r++)
			{
				String orderId=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String customername=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();

				if(status.equals("Pending")) {
					System.out.println(orderId+"   "+customername+"  "+status);
				}

			}
			String pageno =Integer.toString(p+1);

			driver.findElement(By.xpath("//ul[@class='pagination']//li/a[text()='"+pageno+"']")).click();
		}
	}
}
