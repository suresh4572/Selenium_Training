package testNGPkg;

import org.testng.annotations.Test;

public class DependsOnMehtodsPractice {

	@Test(dependsOnMethods = { "method3", "method4" })
	public void dependsMethod2() {

		System.out.println(" i m in depends method2");
	}

	@Test
	public void method3() {

		System.out.println(" i m in public method3");

	}

	@Test
	public void method4() {

		System.out.println(" i m in method4");
	}

}
