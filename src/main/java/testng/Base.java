package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base {
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("This is beforeTest");
  }
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("This is beforeclass");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("This is beforeMethod");
  }
 
  @AfterMethod
  public void AfterMethod()
  {
	  System.out.println("This is AfterMethod");
  }
  
  @AfterClass
  public void AfterClass()
  {
	  System.out.println("This is AfterClass");
  }
  
  @AfterTest
  public void afterTest()
  {
	  System.out.println("This is afterTest");
  }
}
