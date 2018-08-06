package com.com.Deepak;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WindowHandlePrac {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  String main = driver.getWindowHandle();
	  
	  Set<String> allWindows = driver.getWindowHandles();
	  System.out.println(allWindows.size());
	  
	  for (String window : allWindows) {
		  
		 driver.switchTo().window(window);
		 
		  String ti=driver.getTitle();
		  System.out.println(ti);
		  
		  
	if(ti.equals( "Haier")) {
		 driver.switchTo().window(window);
		 driver.manage().window().maximize();
		
		
	}
		  

	
	
	
	 /* if(!window.equals(main)) {
		  driver.close();
		  }
		
		 Thread.sleep(5000);*/
	}
	  
		System.out.println("Hello "+driver.getTitle());
	  driver.switchTo().window(main);
	  driver.findElement(By.xpath("//button[@class='lightCyanBtn'][@title='Walkin Jobs']")).click();
	  
	  
	  allWindows = driver.getWindowHandles();
	  
	  System.out.println(allWindows.size());
	  
	  for (String window : allWindows) {
		  
		 // driver.switchTo().window(window);
		  if(!window.equals(main)) {
			  driver.switchTo().window(window);
		  }
		
		 Thread.sleep(5000);
	}
	 
	  driver.findElement(By.xpath("//button[@id='qsbFormBtn']")).click();
	  
	  
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
