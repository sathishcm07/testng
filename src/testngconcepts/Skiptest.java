package testngconcepts;

import org.testng.annotations.Test;

public class Skiptest {
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login the application");
	}
	
	@Test(priority=2)
	public void registration()
	{
		System.out.println("Customer id is generated");
	}
	
	@Test(priority=3,enabled=false)
	public void editthecustomerid()
	{
		System.out.println("Edit the customer");
	}
	
	@Test(priority=4,enabled=false)
	public void deletethecustomerid()
	{
		System.out.println("delete the customer id");
	}
	
	@Test(priority=5)
	public void logout()
	{
		System.out.println("Logout the application");
	}

}
