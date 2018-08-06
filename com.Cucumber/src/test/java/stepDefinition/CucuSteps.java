package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucuSteps {
	WebDriver driver;
	


	@Given("^Site is opened$")
	public void site_is_opened() {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
	    
	}

	@When("^I enter (\\w+) and (\\w+)$")
	public void i_enter_user_name_and_password(String username, String password) {
		WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		  user.sendKeys(username);
		
		  WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		  pass.sendKeys(password);
		  
	    
	}

	@Then("^I should get logged in$")
	public void i_shold_get_logged_in() throws InterruptedException  {
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		driver.quit();
	   
	}



}
