package groupingtest;

import org.testng.annotations.Test;

public class Groupingtest {
	
	@Test(priority=1,groups= {"smoke","sanity"})
	public void Registration()
	{
		System.out.println("Validate the registration");
	}
	
	@Test(priority=2,groups= {"smoke","sanity"})
	public void Booktickets()
	{
		System.out.println("Book the Tickets");
	}
	
	@Test(priority=3,groups= {"sanity"})
	public void Canceltickets()
	{
		System.out.println("Cancel the Tickets");
	}
	
	@Test(priority=4,groups= {"sanity"})
	public void EditRegistration()
	{
		System.out.println("Edit the registration page");
	}

}
