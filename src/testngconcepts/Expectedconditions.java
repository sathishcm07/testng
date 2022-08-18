package testngconcepts;

import org.testng.annotations.Test;

public class Expectedconditions {
	
	@Test(priority=1,expectedExceptions=ArithmeticException.class)
	public void login()
	{

		int a=1/0;		
		System.out.println("Login the page");
	}
	
	@Test(priority=2,expectedExceptions=Exception.class)
	public void AddCustomer()
	{
		String s=null;
		System.out.println(s.length());
		System.out.println("Customer added successfully");
	}
		
	@Test(priority=3)
	public void logout()
	{
		System.out.println("Logout the application");
	}

}
