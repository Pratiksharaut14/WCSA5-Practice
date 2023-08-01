package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
//	enabled flag has default boolean value as true
//	false will disable the method (will not execute method)
  @Test(enabled = false, description = "Login")
  public void method1() 
  {
	  Reporter.log("Method 1 from flag 2",true);
  }
  
  @Test(enabled = true, description = "Logout")
  public void method2() 
  {
	  Reporter.log("Method 2 from flag 2",true);
  }
}
