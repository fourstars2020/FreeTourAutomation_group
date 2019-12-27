package freeTrourAutomationpagesTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import freeTrourAutomationPages.FlightsPage;
import freeTrourAutomationPages.LoginPage;
import freeTrourAutomationPages.TestBase;

public class FlightsPageTest extends TestBase {
	
	LoginPage loginpage;
	FlightsPage flightspage;
	
	public FlightsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initilization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		flightspage = new FlightsPage();
	}
	
	@Test
	public void verifyFlightsPageTitle(){
		String flightspageTitle =flightspage.verifyFlightsPageTitle();
		Assert.assertEquals(flightspageTitle, "Find a Flight: Mercury Tours:");
	}
	
	@Test
	public void clickOnHomePageLink(){
//		flightspage.clickOnHomePageLink();
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	

}
