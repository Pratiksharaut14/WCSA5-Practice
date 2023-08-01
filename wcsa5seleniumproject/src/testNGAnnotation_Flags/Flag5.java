package testNGAnnotation_Flags;

import org.testng.annotations.Test;

public class Flag5 {
  @Test
  public void loginMethod() 
  {
	  System.out.println("Use to perform login!");
  }
  
  @Test(dependsOnMethods = "loginMethod")
  public void createUserMethod() 
  {
	  System.out.println("Use to create User!");
  }
  
  @Test(dependsOnMethods = "createUserMethod")
  public void logoutMethod() 
  {
	  System.out.println("Use to perform logout!");
  }
}
