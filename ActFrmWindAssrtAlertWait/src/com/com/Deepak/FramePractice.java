package com.com.Deepak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FramePractice {
 WebDriver  driver;
		
 @Test
	  public void f() throws InterruptedException {
		  
		   WebElement frame1 = driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
		   driver.switchTo().frame(frame1);
		   Thread.sleep(5000);
		   			driver.findElement(By.xpath("//a[text()='com.thoughtworks.selenium']")).click();
		   driver.switchTo().defaultContent();
		  
		  
		  WebElement frame2 = driver.findElement(By.xpath("//frame[@name='packageFrame']"));
		  driver.switchTo().frame(frame2);
		  Thread.sleep(5000);
		  		driver.findElement(By.xpath("//span[text()='CommandProcessor']")).click();
		  driver.switchTo().defaultContent();
		  
		  WebElement frame3 = driver.findElement(By.xpath("//frame[@name='classFrame']"));
		   driver.switchTo().frame(frame3);
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//a[text()='Deprecated']")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//a[text()='Deprecated Interfaces']")).click();
			  driver.switchTo().defaultContent();
		  

		  
		  
	  }
	  
	  
	  
	  @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	}

	

