package com.com.Deepak;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class WaitPractice {
	WebDriver driver;
	
  @Test
  public void f() {
	  
	/*  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");   //wait 10s if mot found
	  
	  
	  driver.findElement(By.id("txtPassword")).sendKeys("admin");   //wait 10s if mot found
	  driver.findElement(By.id("btnLogin")).click();				//wait 10s if mot found
	  
	  driver.findElement(By.id("ssgsgs")).click();	*/
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  
	  WebDriverWait wait = new WebDriverWait(driver, 20);
	  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("txtPasswor")));
	  
	  driver.findElement(By.id("txtPasswor")).sendKeys("admin");  
	  driver.findElement(By.id("btnLogin")).click();
	  
	  
	 
	  
	  
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
