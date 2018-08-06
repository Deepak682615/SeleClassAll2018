package com.com.Deepak;

import org.testng.annotations.Test;

import com.sun.corba.se.spi.orbutil.fsm.Action;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;

public class ActionPractice {
		WebDriver driver;
		@BeforeTest
		public void before(){
			
			System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("http://opensource.demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");	//20
				
			driver.findElement(By.id("txtPassword")).sendKeys("admin");//20
			
			driver.findElement(By.id("btnLogin")).click();//20
			
		}
		
	//-------------Drag And Drop-------------
		@Test(enabled= false)
		public void drag() throws InterruptedException
		{
			driver.navigate().to("http://jqueryui.com/droppable/");

			Thread.sleep(5000);
			WebElement x = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(x);
			WebElement sourceElem=driver.findElement(By.id("draggable"));
			WebElement targetElem=driver.findElement(By.id("droppable"));
			
			
			Actions act= new Actions(driver);
			act.dragAndDrop(sourceElem, targetElem).perform();
		}
		
		
	//------------------------Right Click--------------
		@Test(enabled= true)
		public void rightClick()
		{	
			WebElement adminTab=driver.findElement(By.xpath("//b[text()='Admin']"));
			Actions act= new Actions(driver);
			act.contextClick(adminTab).perform();
			
			
		}
		
		
		
		
		
	//--------------------------Mouse Hover	
		@Test(enabled=true)
		public void mouseHover()
		{
			WebElement adminTab=driver.findElement(By.xpath("//b[text()='Admin']"));
			WebElement userManagementTab=driver.findElement(By.xpath("//a[text()='User Management']"));
			WebElement userTab=driver.findElement(By.xpath("//a[text()='Users']"));
					
			Actions act= new Actions(driver);
			act.moveToElement(adminTab).moveToElement(userManagementTab).moveToElement(userTab).click().build().perform();
			
			driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Saurab");//20
		}
		
		@AfterTest
		public void af() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.quit();
		}
	}


