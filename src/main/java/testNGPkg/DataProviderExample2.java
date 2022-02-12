package testNGPkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample2 {

	@Test(dataProvider = "getDataMethod")

	public void testMethod1(String userName, String password) {

		System.out.println(" I m in   first method");

		System.out.println(" Print User name :" + userName);
		System.out.println(" Print pasword :" + password);

	}

	@Test(dataProvider = "getDataMethod")
	public void testMethod2(String userName, String password) {

		System.out.println(" I m in second method");

		System.out.println(" Print User name :" + userName);
		System.out.println(" Print pasword :" + password);
	}

	@Test(dataProvider = "getDataMethod")
	public void testMethod3(String userName, String password) {

		System.out.println(" I m in Third method");
		System.out.println(" Print User name :" + userName);
		System.out.println(" Print pasword :" + password);
	}

	/*
	 * @DataProvider public Object[][] getDataProvider() {
	 * 
	 * Object[][] data = new Object[2][2]; data[0][0]="suresh";
	 * data[0][1]="password123";
	 * 
	 * data[1][0]="ritvika"; data[1][1]="password456";
	 * 
	 * return data; }
	 */

	@DataProvider
	public Object[][] getDataMethod() {
		return new Object[][] { { "userName1", " password123" }, { "userName2", " password456" } };

	}
}
