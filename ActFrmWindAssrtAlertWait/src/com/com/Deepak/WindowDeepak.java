package com.com.Deepak;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WindowDeepak {
	WebDriver driver;
	
  @Test
  public void f() {
 String main = driver.getWindowHandle();
	  
	  Set<String> allWindows = driver.getWindowHandles();
	  System.out.println(allWindows.size());
	  
	  
	  Iterator it = allWindows.iterator();
	  
	  it.next();
	  it.next();
	  it.next();
	  it.next();
	  
	  String win = it.next().toString();
	  
	  driver.switchTo().window(win);
	  System.out.println(win);
	  driver.manage().window().maximize();
	  
	
	  System.out.println("Title is "+driver.getTitle());
	  	  
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://www.naukri.com/");
			
  }

  @AfterTest
  public void afterTest() {
  }

}
