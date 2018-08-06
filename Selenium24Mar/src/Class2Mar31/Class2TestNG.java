package Class2Mar31;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Class2TestNG {
	WebDriver driver;
  @Test
  public void f() {
	  
	  
	  WebElement email = driver.findElement(By.id("email"));
	  email.sendKeys("xyz@test.com");
	  
	  WebElement pass = driver.findElement(By.xpath("//*[@type='password']"));
	  pass.sendKeys("abc12345");
	  
	  WebElement login = driver.findElement(By.cssSelector("*[value='Log In']"));
	  login.click();
	  
	 /* WebElement signup = driver.findElement(By.linkText("Sign up for Facebook"));
	  signup.click();*/
	  
	  WebElement signup1 = driver.findElement(By.partialLinkText("ign up"));
	  signup1.click();
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	  	driver = new ChromeDriver();
	  	driver.get("https://www.facebook.com/");
	  	driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	
  }

}
