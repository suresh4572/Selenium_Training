package testNGPkg;

import org.testng.annotations.*;

public class AllAnnotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" Iam in Beforesuite  Method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println(" Iam in aftersuite ");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println(" Iam in beforeTest ");
	}

	@AfterTest
	public void afterTest() {
		System.out.println(" Iam in afterTest ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println(" Iam in before Class  Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println(" Iam in afterClass ");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" Iam in before Method ");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println(" Iam in afterMethod ");
	}

	@Test
	public void testMethod() {
		System.out.println(" Iam in testMethod ");
	}

	@Test
	public void testMethod2() {
		System.out.println(" Iam in testMethod2 ");
	}

}
