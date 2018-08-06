package FindByPractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POMmain {
	
	
WebDriver driver;
	
	@BeforeTest
	
	public void set1() {
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
	
	@Test
	
	public void testLogin() {
		
		LoginPage login = new LoginPage(driver);
		login.loginMethod("Admin", "admin");
		
		
	}
	
	@AfterTest
	public void quit1() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.quit();
	}
	

	

}
