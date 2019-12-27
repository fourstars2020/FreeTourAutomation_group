package freeTrourAutomationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
	
	//pagefactory / Object Repository:
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement username;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement submitBtn;
	
	
	//initiliaze Object Repository:
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions (Methods):
	
	public String verifyLoginPageTitle(){
		
		return driver.getTitle();
	}
	
	public FlightsPage login(String un, String pwd){
		
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		submitBtn.click();
		return new FlightsPage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
