package com.quidco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorMessages {
	
	WebDriver driver;
	
	By Joinforfree = By.cssSelector("a.btn:nth-child(2)");
	By Firstname =  By.id("first_name_join");	
	By surname = By.id("last_name_join");
	By email = By.id("new_email_join");
	By password =By.id("new_password_join");
	By termsandcondition = By.cssSelector("#agree_to_terms_label");
	By Joinquidco = By.id("join-quidco-submit-button");
	
	
	public ErrorMessages(WebDriver driver){
		
		this.driver=driver;
		
	}
	

	public void clickOnjoinForFree(){
		driver.findElement(Joinforfree).click();
		
	}
public void clickOnJoinQuidco1(){
		
		driver.findElement(Joinquidco).click();
		}
	
	public void typeFirstName(){
		driver.findElement(Firstname).sendKeys("");
		//print out error message when you don't enter anything
		System.out.println(driver.findElement(By.cssSelector("#join-quidco-form fieldset:nth-child(1) .error")).getText());
	}
	
	public void typeSurname(){
		driver.findElement(surname).sendKeys("");
		//print out error message when you don't enter anything
				System.out.println(driver.findElement(By.cssSelector("#join-quidco-form fieldset div:nth-child(2) .error")).getText());
			}
		
	
	public void typeNewEmail(){
		driver.findElement(email).sendKeys("");
		//print out error message when you don't enter anything
		System.out.println(driver.findElement(By.cssSelector("#join-quidco-form fieldset div:nth-child(3) .error")).getText());
		
		}
	public void typePassword(){
		//print pout error message when password is not 6 character
		driver.findElement(password).sendKeys("chae1");
		System.out.println(driver.findElement(By.cssSelector("div[class*='minlength']")).getText());
		//System.out.println(By.cssSelector("div[class*='minlength']"))).
		
		
	}
	public void clickOnTermsAndCondition(){
		driver.findElement(termsandcondition).click();
		
	
		
		
		}
	public void clickOnJoinQuidco(){
		
		driver.findElement(Joinquidco).click();
	}
	
	
	
	
	
	
	
	

}
