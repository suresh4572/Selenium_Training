package testNGPkg;

import org.testng.annotations.Test;

public class DependsOnMethodAndGroups {
	
	@Test(groups ="pre-tests")
	public void init()
	{
		
		System.out.println(" I ma in init Method");
	}
	
	@Test(groups = "tests",dependsOnGroups = "pre-tests")
	public void insert()
	{
		System.out.println(" I am in insert method");
	}
	
	@Test(dependsOnMethods = "insert",groups = "tests")
	public void selectMethod()
	{
		
		System.out.println(" I ma in select Method");
	}
	
	@Test(dependsOnMethods = "selectMethod",groups = "tests")
	public void updatedMethod()
	{
		
		System.out.println(" I am in updated Method");
		
	}
	
	@Test(dependsOnMethods = {"insert","updatedMethod"},groups = "tests")
	public void deleteMethod()
	{
	System.out.println(" I am in delete Method");	
	}
	
	@Test(dependsOnGroups = "tests")
	public void cleanUpMehtod()
	{
		System.out.println(" I am in cleanUp Method");
	}

	}


