package com.Appium;

import org.testng.annotations.Test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.ApplicationCache;

public class AndroidAppTest {

			WebDriver driver;
			@Test
			public void f() throws InterruptedException 
			{
				
//				driver.findElement(By.name("email")).sendKeys("Saurab");;
//				driver.findElement(By.name("pass")).sendKeys("pass");;
//				driver.findElement(By.name("login")).click();
				//driver.findElement(By.xpath("//android.widget.Button[@text='Kedar Bindu (Gold)']")).click();
			}


			@BeforeTest
			public void beforeTest() throws MalformedURLException  
			{
				File mallapp= new File("Resource/CoCoin.apk");
				DesiredCapabilities capabilities= new DesiredCapabilities();
				capabilities.setCapability("app",mallapp.getAbsolutePath());
				capabilities.setCapability("deviceName", "Lenevo");
				capabilities.setCapability("platformName", "Android");
				capabilities.setCapability("platformVersion", "5.1");
				driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
				driver.get("https://www.facebook.com/login");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}

			@AfterTest
			public void afterTest() throws InterruptedException{
				Thread.sleep(5000);
				driver.quit();
			}
		

	}


