package freeTrourAutomationpagesTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import freeTrourAutomationPages.FlightsPage;
import freeTrourAutomationPages.HomePage;
import freeTrourAutomationPages.LoginPage;
import freeTrourAutomationPages.RegistrationPage;
import freeTrourAutomationPages.TestBase;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage;
	FlightsPage flightspage;
	HomePage homepage;
	RegistrationPage registrationpage;
	
	//create constructor & call super class:
	public HomePageTest(){
		super();
	}
	
	//@BeforeMethod & initialization:
	
	@BeforeMethod
	public void setUp(){
		initilization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		flightspage = new FlightsPage();
		flightspage.clickOnHomePageLink();
		homepage = new HomePage();
		
		}
	
	//@Test:
	
	@Test(priority=1)
	public void verifyHomePageTitle(){
		String homepageTitle =homepage.verifyHomePageTitle();
		Assert.assertEquals(homepageTitle, "Welcome: Mercury Tours");
		
	}
	
	@Test(priority=2)
	public void clickOnRegistrationPageLink(){
		
		homepage.clickOnRegistrationLink();
	}
	
	
	//@AfterMethod:
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	

}
