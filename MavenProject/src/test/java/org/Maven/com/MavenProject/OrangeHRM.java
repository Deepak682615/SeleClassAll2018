package org.Maven.com.MavenProject;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;


public class OrangeHRM {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void set1() {
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
	
	@AfterTest
	public void quit1() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.quit();
	}
	
  @Test(priority=1, enabled= true)
  public void Login() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
	  WebElement user = driver.findElement(By.cssSelector("input#txtUsername"));
	  user.sendKeys("Admin");
	
	  WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	  pass.sendKeys("admin");
	  
	  
  }
	
  @Test
  public void TakeScreenshot() throws IOException {
	  
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  
	  File srcFile = ts.getScreenshotAs(OutputType.FILE);
	  
	  FileUtils.copyFile(srcFile, new File("./Screenshot/ScreenLogin1.png"));	  	  
	  
  }
  
}
