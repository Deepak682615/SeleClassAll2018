package com.com.Deepak;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertPractice {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  
	 String s= driver.findElement(By.id("txtUsername")).getAttribute("name");
	 System.out.println(s);
	  driver.findElement(By.id("txtPassword")).sendKeys("admin");
	  
	  
	  driver.findElement(By.id("btnLogin")).click();
	  
	  String URl= "http://opensource.demo.orangehrmlive.com/index.php/dashboard";
	  String ActualURL=driver.getCurrentUrl();
	  
	  
	  
	  //-------------HARD Assert----stops execution if condition fails----------
	  
	  Assert.assertEquals(URl, ActualURL);
	  System.out.println("code post Hard assert");
	  
	  
	  SoftAssert soft = new SoftAssert();
	 soft.assertEquals(URl, ActualURL);
	 
	  
	 
	
	  
	  System.out.println("code post Soft assert");
	  soft.assertAll();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	  
  }
  

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  driver.quit();
	  
	  
  }

}
