package testNGPkg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void testM1() {

		System.out.println(" i m in testM1");
	}

	@Test(dependsOnMethods = {"testM3","testM4"})
	public void testM2() {

		System.out.println(" i m in testM2");
	}
	@Test
	public void testM3() {

		System.out.println(" i m in testM3");
	}

	@Test
	public void testM4() {

		System.out.println(" I am in testM4");
	}

}
