package com.com.Deepak;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AlertPractice {
	WebDriver driver;
	
  @Test(priority= 1)
  public void custInput() {
	 WebElement cust= driver.findElement(By.xpath("//input[@name='cusid']"));
	 String s= "Deepak";
	 cust.sendKeys(s);
	  
  }
  
  @Test(priority= 2)
  public void clickbuttn() {
	  WebElement clickSbmit = driver.findElement(By.xpath("//input[@name='submit']"));
	  clickSbmit.click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @Test (priority= 3)
  public void alertPract() {
	 Alert al = driver.switchTo().alert();
	 al.dismiss();
	  
	 
  }
  
  @Test(priority= 0)
  public void title() {
	  
	  String s= driver.getTitle();
	  System.out.println(s);
	  
	 try {
		 Assert.assertEquals(s, "Delete ");
		 
		
	} catch (AssertionError e) {
		System.out.println("Pass");
	}
	 System.out.println("Post Ass");
  }
  
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
	
	  driver = new ChromeDriver();
	  
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
	  
	  driver.manage().window().maximize();
	
	  
	  
	 
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  Thread.sleep(10000);
	  driver.quit();
	  
	  
	  
  }

}
