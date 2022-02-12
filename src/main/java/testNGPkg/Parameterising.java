package testNGPkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterising {

	@Parameters({ "url", "username" })
	@Test
	public void testM1(String urlname, String linkname)

	{

		System.out.println(" i m in testM1");
		System.out.println("urlname ");
		System.out.println("linkname ");
	}

	@Parameters({ "url" })
	@Test
	public void testM2(String urname)

	{

		System.out.println(" i m in testM2");
		System.out.println("urname ");
	}

	@Test
	public void testM3()

	{

		System.out.println(" i m in testM3");
	}

	@Test
	public void testM4() {

		System.out.println(" I am in testM4");
	}

}
