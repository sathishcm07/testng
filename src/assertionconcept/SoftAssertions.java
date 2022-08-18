package assertionconcept;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	@Test
	public void softassert()
	{
		int actual=1;
		int expected =1;
		
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(actual,expected);
		System.out.println("Code is completed");
		soft.assertAll();
	}

}
