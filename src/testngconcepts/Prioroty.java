package testngconcepts;

import org.testng.annotations.Test;

public class Prioroty {
	
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
	
	@Test(priority=3)
	public void logout()
	{
		System.out.println("Logout the application");
	}

}
