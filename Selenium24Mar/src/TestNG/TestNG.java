package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class TestNG {
  @Test
  public void test() {
	  System.out.println("Test");

  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	WebDriver chrome = new ChromeDriver();
	chrome.get("https://www.facebook.com/");
	
//	  System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
//		WebDriver ie = new InternetExplorerDriver();
//		ie.get("https://www.facebook.com");

//	 System.setProperty("webdriver.gecko.driver"	, "Resource/geckodriver.exe");
//	FirefoxDriver Mozilla = new FirefoxDriver();
	

	  
	
  }
  


  @AfterTest
  public void afterTest() {
	  
  }
}
