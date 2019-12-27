package freeTrourAutomationpagesTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import freeTrourAutomationPages.FlightsPage;
import freeTrourAutomationPages.LoginPage;
import freeTrourAutomationPages.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	FlightsPage flightspage;
	
	
	public LoginPageTest(){
		
		super();
			
	}
	
	@BeforeMethod
	
	public void setUp(){
		
		initilization();
		loginpage = new LoginPage();
		flightspage = new FlightsPage();
		
		}
	
	@Test(priority=1)
	
	public void verifyLoginPage(){
		String loginpageTitle =loginpage.verifyLoginPageTitle();
		Assert.assertEquals(loginpageTitle, "Sign-on: Mercury Tours");
	}
	
	@Test(priority=2)
	public void login(){
		 flightspage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod()
	public void tearDown(){
		driver.quit();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
