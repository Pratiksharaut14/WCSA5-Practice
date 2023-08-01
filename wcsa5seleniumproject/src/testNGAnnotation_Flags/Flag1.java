package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
//	Use to describe method or test case
  @Test(description = "Login Method")
  public void method1() {
	  Reporter.log("Method 1 of Flag1", true);
  }
  
  @Test(description = "Logout Method")
  public void method2() {
	  Reporter.log("Method 2 of Flag1", true);
  }
  
}
