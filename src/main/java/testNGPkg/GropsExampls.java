package testNGPkg;

import org.testng.annotations.Test;

public class GropsExampls {
	
	@Test(groups="regration")
	public void testMethod1() {

		System.out.println(" i m in testM1");
	}

	@Test(groups="regration1")
	public void testMethod2() {

		System.out.println(" i m in testM2");
	}
	
	@Test(groups="smoketest")
	public void testMethod3() {

		System.out.println(" i m in testM3");
	}

	@Test(groups="sanitytest")
	public void testM4() {

		System.out.println(" I am in testM4");
	}


}
