import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	public  LoginPage(WebDriver driver ) {
		this.driver=driver;
	}
	
	By userId_Locator = By.id("txtUsername");
	By pass_Locator = By.id("txtPassword");
	By login_Locator = By.id("btnLogin");
	
	
	public void userIdFunction(String user) {
		WebElement userId = driver.findElement(userId_Locator);
		userId.click();
	}

	public void passFunction(String pass) {
		WebElement passId = driver.findElement(pass_Locator);
		passId.click();
		}
	
	public void loginFunction() {
		driver.findElement(login_Locator).click();
	}
	
	public void loginMethod(String user, String pass) {
		
		
	userIdFunction(user);
	passFunction(pass);
	loginFunction();
	
	
	}
	
	
}
