import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.quidco.pages.ErrorMessages;

public class TestScriptForerrormessages {
	
	
	@Test
	public void CaptureErrorMessages() throws InterruptedException{
		
		
		
		WebDriver driver = new FirefoxDriver();{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.quidco.com");
			//Thread.sleep(4000);
			
			ErrorMessages obj1 = new ErrorMessages(driver);
			
			obj1.clickOnjoinForFree();
			obj1.clickOnJoinQuidco1();
			obj1.typeFirstName();
			Thread.sleep(2000);
			obj1.typeSurname();	
			obj1.typeNewEmail();	
			obj1.typePassword();	
			obj1.clickOnTermsAndCondition();
			obj1.clickOnJoinQuidco();
			
			
			
			
		
		
		
		
		
		
	}
	
	
	
		
		

}}
