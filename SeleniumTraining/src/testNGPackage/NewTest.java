package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  
	@Test
  public void f() {
	  System.out.println("Test Method");
  }
  
  @Test(groups={"FuncTest"})
  public void f2() {
	  System.out.println(" f2 Test Method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class Method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class Method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test Method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AFter test Method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before SUite Method");  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite Method");
  }

}
