package Class2Mar31;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Apr1 {
  @Test(dependsOnMethods="x")
  public void z() {
	  System.out.println("z");
  }
  
  @Test(priority=1)
  public void y() {
	  System.out.println("y");
  }
 
  @Test
  public void x() {
	  System.out.println("x");
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
