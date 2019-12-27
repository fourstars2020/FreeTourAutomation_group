package freeTrourAutomationpagesTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.freeTour.qa.testUtil.TestUtil;

import freeTrourAutomationPages.FlightsPage;
import freeTrourAutomationPages.HomePage;
import freeTrourAutomationPages.LoginPage;
import freeTrourAutomationPages.RegistrationPage;
import freeTrourAutomationPages.TestBase;

public class RegistrationPageTest extends TestBase{
	
	LoginPage loginpage;
	FlightsPage flightspage;
	HomePage homepage;
	RegistrationPage registrationpage;
	TestUtil testutil;
	public static String sheetname = "contacts";
	//constructor with super class:
	
	public RegistrationPageTest(){
		
		super();
	}
	//@BeforeMethod & initialization:
	
	@BeforeMethod
	public void setUp(){
		initilization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		flightspage = new FlightsPage();
		flightspage.clickOnHomePageLink();
		homepage = new HomePage();
		homepage.clickOnRegistrationLink();
		registrationpage = new RegistrationPage();
	}
	
	@DataProvider
	public Object[][] getTestData(){
		Object data[][] =TestUtil.getTestData(sheetname);
		return data;
		
		
	}
	//@Test:
		@Test(priority=1)
		public void verifyRegistrationPageTitle(){
			
		
		String registrationPageTitle=registrationpage.verifyRegistrationPageTitle();
		Assert.assertEquals(registrationPageTitle, "Register: Mercury Tours");
		
	}
		
		@Test(dataProvider="getTestData",priority=2)
		public void completeRegistrationPage(String ftNm, String ltNm, String phNm, String email, String address, String city, String state, String pcode){
			//registrationpage.completeRegistrationPage();
			registrationpage.completeRegistrationPage(ftNm, ltNm, phNm, email, address, city, state, pcode);
		}
	
	//@AfterMethod:
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
