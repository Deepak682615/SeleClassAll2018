package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SignUp {
	
	WebDriver driver;
	WebDriver ie;
	
  @Test
  public void f() {
	
	  WebElement FirstName =driver.findElement(By.id("u_0_m"));	  
	  FirstName.sendKeys("DeepakB");
	  
	  WebElement LastName = driver.findElement(By.id("u_0_o"));
	  LastName.sendKeys("Birajdar");
	  

	  WebElement Mob = driver.findElement(By.id("u_0_r"));
	  Mob.sendKeys("123456789");
	  
	 /* WebElement login = driver.findElement(By.xpath("//*[@value='Log In']"));
	  login.click();*/
	  
  }
 
  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
/*	System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
	ie = new InternetExplorerDriver();
	ie.get("https://www.facebook.com");
*/
	
  }

  @AfterTest
  public void afterTest() {
	 
	  driver.quit();

  }
  

}
