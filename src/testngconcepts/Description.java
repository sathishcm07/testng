package testngconcepts;

import org.testng.annotations.Test;

public class Description {
	
	@Test(priority=1,description="To login the application")
	public void login()
	{
		System.out.println("Login the page");
	}
	
	@Test(priority=2,description="Adding the customers")
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
