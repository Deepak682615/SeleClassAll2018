package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class SelePractice {
	WebDriver  driver;
	
	
	
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.linkText("Women")).click();
	  driver.findElement(By.linkText("Tops")).click();
	  driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")).click();
	  
	  WebElement frame= driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	  driver.switchTo().frame(frame);
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//a[@id='color_14']")).click();
	  driver.findElement(By.xpath("//p[@id='add_to_cart']")).click();
	  
	  driver.switchTo().defaultContent();
	  
	  
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium'][@title='Proceed to checkout']")).click();
	  
	  driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium'][@title='Proceed to checkout']")).click();
	  
	  
	
	  
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	 /* System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	  driver= new ChromeDriver();*/
	  
	  DesiredCapabilities capa = new DesiredCapabilities();
	  capa.setBrowserName("chrome");
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.176:4444/wd/hub"), capa);
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	 // driver.quit();
  }

}
