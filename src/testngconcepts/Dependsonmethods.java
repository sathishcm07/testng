package testngconcepts;

import org.testng.annotations.Test;

public class Dependsonmethods {
	
	@Test(priority=1)
	public void login()
	{
		//int a=1/0;
		System.out.println("Login the page");
	}
	
	@Test(priority=2,dependsOnMethods="login")
	public void AddCustomer()
	{
		System.out.println("Customer added successfully");
	}
		
	@Test(priority=3,dependsOnMethods="AddCustomer")
	public void logout()
	{
		System.out.println("Logout the application");
	}

}
