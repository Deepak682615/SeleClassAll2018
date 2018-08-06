package FindByPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public  LoginPage(WebDriver driver ) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUsername")
	WebElement userId_Locator;
	
	@FindBy(id="txtPassword")
	WebElement pass_Locator;
	
	@FindBy(how= How.ID, using="btnLogin")
	WebElement login_Locator;
	
	
	public void userIdFunction(String user) {
	
		userId_Locator.click();
	}

	public void passFunction(String pass) {
		
		pass_Locator.click();
		}
	
	public void loginFunction() {
		login_Locator.click();
	}
	
	public void loginMethod(String user, String pass) {
		
		
	userIdFunction(user);
	passFunction(pass);
	loginFunction();
	
	
	}
	
	
}
