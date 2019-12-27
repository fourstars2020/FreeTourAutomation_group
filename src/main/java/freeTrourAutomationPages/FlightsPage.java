package freeTrourAutomationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage extends TestBase{
	
	//pagefactory _ObjectRepostory
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement clickOnHomePage;
	
	//initiliaze object Repostory:
	
	public FlightsPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions_Methods
	
	public String verifyFlightsPageTitle(){
		
		return driver.getTitle();
	}
	
	public void clickOnHomePageLink(){
		
		clickOnHomePage.click();
	}
	
	
	
	
	
	
	
	
	

}
