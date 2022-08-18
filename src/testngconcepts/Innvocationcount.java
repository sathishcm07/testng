package testngconcepts;

import org.testng.annotations.Test;

public class Innvocationcount {
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login the page");
	}
	
	@Test(priority=2,invocationCount=3)
	public void AddCustomer()
	{
		System.out.println("Customer added successfully");
	}
		
	@Test(priority=3)
	public void logout()
	{
		System.out.println("Logout the application");
	}

}
