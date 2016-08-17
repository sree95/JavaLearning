package JUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;




public class Intro {
	
	
	/*@Test
	public void testMethodOne() {
		System.out.println("Test Method");
	}
	
	@Ignore
	public void testMethodTwo() {
		System.out.println("Test Method");
	}
	
	@Before
	public void BeforeMethod() {
		System.out.println("Before Method");
	}
	@After
	public void AfterMethod() {
		System.out.println("After Method");
	}
	@org.junit.BeforeClass
	public static void BeforeClass() {
		System.out.println("Before Class");		
	}
	
	@org.junit.AfterClass
	public static void AfterClass() {
		System.out.println("After Class");
	}*/
	@Test
	public void Asserting() {
		Assert.assertEquals(true,true);
		System.out.println("Assertion is passed");
	}
	
}
