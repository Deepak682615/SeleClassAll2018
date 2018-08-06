package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Login {
	
	WebDriver driver;
	WebDriver ie;
	
 /* @Test
  public void f() {
	
	  WebElement Username =driver.findElement(By.id("email"));	  
	  Username.sendKeys("DeepakB");
	  
	  WebElement pass = driver.findElement(By.id("pass"));
	  pass.sendKeys("12333");
	  
	  WebElement login = driver.findElement(By.xpath("//*[@value='Log In']"));
	  login.click();
	  
  }*/
  @Test
  public void f2() {
		
	  WebElement Username =ie.findElement(By.id("email"));	  
	  Username.sendKeys("DeepakB");
	  
	  WebElement pass = ie.findElement(By.id("pass"));
	  pass.sendKeys("12333");
	  
	  WebElement login = ie.findElement(By.xpath("//*[@value='Log In']"));
	  login.click();
	  
  }
  

  @BeforeTest
  public void beforeTest() {
//	 System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
//	  driver = new ChromeDriver();
//	  driver.get("https://www.facebook.com/");
	  
  System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
	ie = new InternetExplorerDriver();
	ie.get("https://www.facebook.com");
	ie.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	
  }

  @AfterTest
  public void afterTest() {

	  ie.quit();
  }
  

}
