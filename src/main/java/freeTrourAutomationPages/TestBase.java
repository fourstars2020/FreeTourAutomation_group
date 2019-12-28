package freeTrourAutomationPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase(){
		 prop = new Properties();
		 try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Four stars\\Documents\\FreeTourAutomation\\FreeTourAutomation_group"
					+ "\\src\\main\\java\\com\\freeTour\\qa\\config\\cofig.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		}
	
	public void initilization(){
		
		prop.getProperty("browser");
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\For 79\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		
		
		//driver.get("http://newtours.demoaut.com/mercurysignon.php");
		
		driver.get(prop.getProperty("url"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
