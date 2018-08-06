package org.Maven.com.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	 WebDriver driver;

	public Login(WebDriver driver) {
		this.driver=driver;
		
	}

	
	public void fbLogin() {
		WebElement Username =driver.findElement(By.id("email"));	  
		  Username.sendKeys("DeepakB");
		  
		  WebElement pass = driver.findElement(By.id("pass"));
		  pass.sendKeys("12333");
		  
		  WebElement login = driver.findElement(By.xpath("//*[@value='Log In']"));
		  login.click();

	}
	
	public void click() {
		WebElement link = driver.findElement(By.linkText("Sign up for Facebook"));
		link.click();
		 	
	}

}
