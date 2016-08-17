package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest3 extends NewTest2 {
  
	@Test(groups={"FuncTest"})	
  public void f3() {
	  System.out.println("f3 method in NewTest3 Class");	  
  }
	
	@Test(dependsOnMethods={"f3"})
	public void f4() {
		System.out.println("f4 method in NewTest3 Class");
	}
	
}
