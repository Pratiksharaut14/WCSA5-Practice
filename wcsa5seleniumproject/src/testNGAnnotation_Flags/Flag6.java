package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	
//	Test 1 ---------------------------------------------
  @Test(groups = "Functional TestCase")
  public void ftc1() 
  {
	  Reporter.log("FTC1",true);
  }
  
  @Test(groups = "Smoke TestCase")
  public void stc1() 
  {
	  Reporter.log("STC1",true);
  }
  
  @Test(groups = "Integration TestCase")
  public void itc1() 
  {
	  Reporter.log("ITC1",true);
  }
  
//  Test 2 -------------------------------------------
  
  @Test(groups = "Functional TestCase")
  public void ftc2() 
  {
	  Reporter.log("FTC2",true);
  }
  
  @Test(groups = "Smoke TestCase")
  public void stc2() 
  {
	  Reporter.log("STC2",true);
  }
  
  @Test(groups = "Integration TestCase")
  public void itc2() 
  {
	  Reporter.log("ITC2",true);
  }
  
//  Test 3 --------------------------------------------
  
  @Test(groups = "Functional TestCase")
  public void ftc3() 
  {
	  Reporter.log("FTC3",true);
  }
  
  @Test(groups = "Smoke TestCase")
  public void stc3() 
  {
	  Reporter.log("STC3",true);
  }
  
  @Test(groups = "Integration TestCase")
  public void itc3() 
  {
	  Reporter.log("ITC3",true);
  }
  
//  Test 4 ---------------------------------------------
  
  @Test(groups = "Functional TestCase")
  public void ftc4() 
  {
	  Reporter.log("FTC4",true);
  }
  
  @Test(groups = "Smoke TestCase")
  public void stc4() 
  {
	  Reporter.log("STC4",true);
  }
  
  @Test(groups = "Integration TestCase")
  public void itc4() 
  {
	  Reporter.log("ITC4",true);
  }
  
//  Test 5 --------------------------------------------
  
  @Test(groups = "Functional TestCase")
  public void ftc5() 
  {
	  Reporter.log("FTC5",true);
  }
  
  @Test(groups = "Smoke TestCase")
  public void stc5() 
  {
	  Reporter.log("STC5",true);
  }
  
  @Test(groups = "Integration TestCase")
  public void itc5() 
  {
	  Reporter.log("ITC5",true);
  }
  
//  Test 6 -------------------------------------------
  
  @Test(groups = "Functional TestCase")
  public void ftc6() 
  {
	  Reporter.log("FTC6",true);
  }
  
  @Test(groups = "Smoke TestCase")
  public void stc6() 
  {
	  Reporter.log("STC6",true);
  }
  
  @Test(groups = "Integration TestCase")
  public void itc6() 
  {
	  Reporter.log("ITC6",true);
  }
}
