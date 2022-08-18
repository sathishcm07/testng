package assertionconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void hardassert()
	{
		int actual=1;
		int expected=2;
		//Hard assert declaration
		Assert.assertEquals(actual, expected);
		System.out.println("Code is completed");
	}

}
