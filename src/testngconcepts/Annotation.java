package testngconcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	@BeforeTest
	public void networkopen()
	{
		System.out.println("Network is open");
	}
	
	@BeforeClass
	public void databaseopen()
	{
		System.out.println("Database is open");
	}
	
	@BeforeMethod
	public void Logintheapplication()
	{
		System.out.println("Logintheapplication");
	}
	
	@Test(priority=1)
	public void AddCustomer()
	{
		System.out.println("Customer added successfully");
	}
	
	@Test(priority=2)
	public void EditCustomer()
	{
		System.out.println("Customer Edited successfully");
	}
	
	@Test(priority=3)
	public void DeleteCustomer()
	{
		System.out.println("Customer deleted successfully");
	}

	@AfterMethod
	public void Logouttheapplication()
	{
		System.out.println("Logout the application");
	}
	
	@AfterClass
	public void closedatabase()
	{
		System.out.println("Close the database");
	}
	
	@AfterTest
	public void networkclose()
	{
		System.out.println("Close the network");
	}
	

}
