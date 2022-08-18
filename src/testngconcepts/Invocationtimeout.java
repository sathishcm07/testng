package testngconcepts;

import org.testng.annotations.Test;

public class Invocationtimeout {
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login the page");
	}
	
	@Test(priority=2,invocationTimeOut=1000)
	public void AddCustomer() throws InterruptedException
	{
		System.out.println("Customer added successfully");
		Thread.sleep(2000);
	}
		
	@Test(priority=3)
	public void logout()
	{
		System.out.println("Logout the application");
	}

}
