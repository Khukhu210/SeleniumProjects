package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest
{
	@Test
   public void testMethod1()
   {
	System.out.println("Test Method 1");
   }
	
	@Test
	   public void testMethod2()
	   {
		System.out.println("Test Method 2");
	   }
	
	@Test
	   public void testMethod3()
	   {
		System.out.println("Test Method 3");
		Assert.fail();
	   }
	
	@Test
	   public void testMethod4()
	   {
		System.out.println("Test Method 4");
		Assert.fail();
	   }
	
}
