package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass {
	
//  Execute in between BeforeMethod and AfterMethod annotations
  @Test
  public void method1() 
  {
	  Reporter.log("Test Annotation", true);
  }
  
  
  @AfterMethod
  public void method2()
  {
	  Reporter.log("AfterMethod Annotation", true);
  }
  
  @BeforeMethod
  public void method3()
  {
	  Reporter.log("BeforeMethod Annotation", true);
  }
  
  @AfterClass
  public void method4()
  {
	  Reporter.log("AfterClass Annotation", true);
  }
  
  @BeforeClass
  public void method5()
  {
	  Reporter.log("Beforeclass Annotation", true);
  }
  
  @AfterSuite
  public void method6()
  {
	  Reporter.log("AfterSuite Annotation", true);
  }
  
  @BeforeSuite 
  public void method7()
  {
	  Reporter.log("BeforeSuite Annotation", true);
  }
  
  @AfterTest
  public void method8()
  {
	  Reporter.log("AfterTest Annotation", true);
  }
  
  @BeforeTest
  public void method9()
  {
	  Reporter.log("BeforeTest Annotation", true);
  }
  
//  Execute in between BeforeMethod and AfterMethod annotations
  @Test
  public void method10()
  {
	  Reporter.log("Test Annotation", true);
  }
}
