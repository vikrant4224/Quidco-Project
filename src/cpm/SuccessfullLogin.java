package cpm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SuccessfullLogin {
	
	
	@Test
	public void ValidLogin() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.quidco.com");
		//Thread.sleep(4000);
		com.quidco.pages.ValidLogin obj1 = new com.quidco.pages.ValidLogin(driver);
		
		obj1.clickOnjoinForFree();
		obj1.typeFirstName();
		obj1.typeSurname();	
		obj1.typeNewEmail();	
		obj1.typePassword();	
		obj1.clickOnTermsAndCondition();
		obj1.clickOnJoinQuidco();
		Thread.sleep(10000);
		obj1.validteConfimationMessageAfterJoin();
		
		
		
		
		
		
	
	
	

		}}
		}
