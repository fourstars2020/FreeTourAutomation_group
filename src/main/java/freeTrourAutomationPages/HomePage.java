package freeTrourAutomationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{
	
	//pagefactory_ (OR) Object Reposotory:
	
		@FindBy(xpath="//a[contains(text(),'REGISTER')]")
		WebElement RegistrationBtn;
	
	//initilize Object Reposotory:
		
		public HomePage(){
			
			PageFactory.initElements(driver, this);
		}
	//Actions_ Methods:
		
		public String verifyHomePageTitle(){
			
			return driver.getTitle();
		}
		
		public void clickOnRegistrationLink(){
			
			RegistrationBtn.click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
