package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
//	  Reporter.log("......");   Output will not be visible in test output
	  Reporter.log(".....", true); //Keep it true 
  }
}
