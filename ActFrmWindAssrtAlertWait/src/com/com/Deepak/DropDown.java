package com.com.Deepak;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class DropDown {
	
	WebDriver driver;
	
  @Test (priority=1, enabled= false)
  public void index() {
	  
	  Select country= new Select(driver.findElement(By.xpath("//select[@name='country']")));
	  
	  country.selectByIndex(2);
	  
	  
  }
  
  @Test (priority=2)
  public void visible() {
	  
	  Select country= new Select(driver.findElement(By.xpath("//select[@name='country']")));
	  
	  country.selectByValue("INDIA");
	  
	 List<WebElement>ls=country.getOptions();
	 int l=ls.size();
	 for (int i=0; i< l; i++ ) {
		 String s=ls.get(i).getText();
		 System.out.println(s);
		
	}
	  
	 Assert.assertEquals(ls.get(3).getText(), "ANDORRA");
	 System.out.println("Pass");
	  
  }
  
  @Test (priority=3, enabled= false)
  public void value() {
	  
	  Select country= new Select(driver.findElement(By.xpath("//select[@name='country']")));
	  
	  country.selectByValue("INDIA");
	    
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("http://demo.guru99.com/test/newtours/register.php");
		 
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
	  
  }

}
