package freeTrourAutomationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends TestBase {
	
//pageFactory _(OR)_ object Reposotory:
	
	@FindBy(name= "firstName")
	WebElement firstname;
	
	@FindBy(name ="lastName")
	WebElement lastname;
	
	@FindBy(name ="phone")
	WebElement phNum;
	
	@FindBy(id="userName")
	WebElement emailAdd;
	
	@FindBy(name ="address1")
	WebElement mailAdd;
	
	@FindBy(name ="city")
	WebElement cityNm;
	
	@FindBy(name ="state")
	WebElement stateNm;
	
	@FindBy(name ="postalCode")
	WebElement postcod;
	
	@FindBy(name ="register")
	WebElement subtBtn;
	
	//initilize object Reposotory: (create constructor)
	
	public RegistrationPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions_Methods:
	
	public String verifyRegistrationPageTitle(){
		
		return driver.getTitle();
	}
	
	public void completeRegistrationPage(String ftNm,String ltNm, String phNm, String email, String address, String city, String state, String pcode){
		firstname.sendKeys(ftNm);
		lastname.sendKeys(ltNm);
		phNum.sendKeys(phNm);
		emailAdd.sendKeys(email);
		mailAdd.sendKeys(address);
		cityNm.sendKeys(city);
		stateNm.sendKeys(state);
		postcod.sendKeys(pcode);
		subtBtn.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
