package testNGAnnotation_Flags;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Flag7 {
	@Test
	  public void loginMethod() 
	  {
		  System.out.println("Use to perform login!");
	  }
	  
	  @Test(dependsOnMethods = "loginMethod")
	  public void createUserMethod() 
	  {
		  Assert.fail();
		  System.out.println("Use to create User!");
	  }
	  
//	  If we dont use alwaysRun It will be skipped
	  @Test(dependsOnMethods = "createUserMethod", alwaysRun = true)
	  public void logoutMethod() 
	  {
//		  Verification of test Cases
		  Assert.fail();
		  System.out.println("Use to perform logout!");
	  }
}
