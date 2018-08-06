package org.Maven.com.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;

	@Test
	public void f() {
		/*
		 * Login ref = new Login(driver); ref.fbLogin(); ref.click();
		 */

		Auto_Login ref = new Auto_Login(driver);
		ref.signin();
		
	}

	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String xyz) {

		if (xyz.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (xyz.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("no such browser");
		}

		driver.get("https://www.facebook.com/");

		// System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
		// driver = new FirefoxDriver();
		// driver.get("https://www.facebook.com/");
		driver.get("http://automationpractice.com/index.php");

	}

	@AfterTest
	public void afterTest() {

		// ref.driver.quit();

	}

}
