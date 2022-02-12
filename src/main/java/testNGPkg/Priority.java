package testNGPkg;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 3,enabled=true)
	public void testM1() {

		System.out.println(" i m in testM1");
	}

	@Test(priority = 1,alwaysRun =true,enabled=false )
	public void testM2() {

		System.out.println(" i m in testM2");
	}

	@Test(priority = 2,enabled=true,invocationCount =6)
	public void testM3() {

		System.out.println(" i m in testM3");
		//git commit
		System.out.println(" adding changes in git repository");
	}

}
