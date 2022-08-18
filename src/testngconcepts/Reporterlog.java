package testngconcepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporterlog {
	
	@Test(priority=1)
	public void login()
	{
		Reporter.log("Login the page");
		//System.out.println("Login the page");
	}
	
	@Test(priority=2)
	public void AddCustomer()
	{
		Reporter.log("Customer added successfully");
		//System.out.println("Customer added successfully");
	}
		
	@Test(priority=3)
	public void logout()
	{
		Reporter.log("Logout the application");
		//System.out.println("Logout the application");
	}

}
