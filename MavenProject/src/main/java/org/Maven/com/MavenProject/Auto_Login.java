package org.Maven.com.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Auto_Login {
	WebDriver driver1;
	


	
	public Auto_Login(WebDriver driver) {
		driver1=driver;
	}



	


	public void signin(){
		WebElement signin = driver1.findElement(By.xpath("//a[@class='login' and @rel='nofollow']"));
		signin.click();
		
		
		
		
		
		
	}

}
