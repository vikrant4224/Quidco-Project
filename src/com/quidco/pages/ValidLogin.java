package com.quidco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidLogin {
	
	WebDriver driver;
	
	By Joinforfree = By.cssSelector("a.btn:nth-child(2)");
	By Firstname =  By.id("first_name_join");	
	By surname = By.id("last_name_join");
	By email = By.id("new_email_join");
	By password =By.id("new_password_join");
	By termsandcondition = By.cssSelector("#agree_to_terms_label");
	By Joinquidco = By.id("join-quidco-submit-button");
	By confimationmessage = By.cssSelector(".welcome");
	public ValidLogin(WebDriver driver){
		
		this.driver=driver;
		
		
		}
	public void clickOnjoinForFree(){
		driver.findElement(Joinforfree).click();
		
	}
	
	public void typeFirstName(){
		driver.findElement(Firstname).sendKeys("vik");
		
	}
	public void typeSurname(){
		driver.findElement(surname).sendKeys("Patel");
		
		
	}
	public void typeNewEmail(){
		driver.findElement(email).sendKeys("sam152@gmail.com");
		
		}
	public void typePassword(){
		driver.findElement(password).sendKeys("charlie123");
		
		
	}
	public void clickOnTermsAndCondition(){
		driver.findElement(termsandcondition).click();
		
		
		}
	public void clickOnJoinQuidco(){
		
		driver.findElement(Joinquidco).click();
	}
	public void validteConfimationMessageAfterJoin(){
		System.out.println(driver.findElement(confimationmessage).getText());
	}
    
}
