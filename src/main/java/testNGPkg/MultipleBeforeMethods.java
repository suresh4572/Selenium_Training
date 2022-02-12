package testNGPkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleBeforeMethods {
	@BeforeMethod
	public void M1() {
		
		System.out.println(" I am  Before Method 1");
	}
	@BeforeMethod
	public void M2() {
		
		System.out.println(" I am  Before Method 2");
	}
	@Test
	public void testMethod() {
		
		System.out.println(" I am  Test Method ");
	}
	@AfterMethod
	public void M3()
	{
		
		System.out.println("  iam in M3  after Method");
	}
	
}
