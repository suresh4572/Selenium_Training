package testNGPkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderClass {

	@Test(dataProvider = "getDataMethod")
	public void Method1(String UserName, String password, String abc)

	{
		System.out.println("Username 3:" + UserName);
		System.out.println("Username :" + UserName);
		System.out.println("Password : " + password);
		System.out.println("ABC :" + abc);
	}
	// TODO Auto-generated constructor stub

	@Test(dataProvider = "getDataMethod")
	public void Method2(String UserName, String password,String abc)

	{
		System.out.println(UserName);
		System.out.println(password);
		System.out.println("ABC :" + abc);
	}
	
	@Test(dataProvider = "getDataMethod")
	public void Method3(String UserName, String password,String abc)

	{
		System.out.println(UserName);
		System.out.println(password);
		System.out.println("ABC :" + abc);
	}
	
	/*
	 * @DataProvider  //Syntax  for DataProvider
	 * public Object[][] getDataMethod()
	 * 
	 * { Object[][] data= new Object[2][2]; 
	 * //First row 
	 * data[0][0]=" First User name suresh";
	 * data[0][1]="First Password456"; 
	 * //Second row
	 *  data[0][0]=" Secind UserName suresh";
	 * data[0][1]=" Second Password123";
	 * 
	 * return data;
	 * 
	 * }
	 */
	@DataProvider
	public Object[][] getDataMethod() 
	{

		return new Object[][] 
				{

				{ "Suresh","password123","344546" }, {"Ritvika", "Password456 ","344547"} 
				};
	}
		
		}
	


