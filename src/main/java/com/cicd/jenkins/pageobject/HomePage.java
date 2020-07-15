package com.cicd.jenkins.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="q")
	private WebElement searchtxt;
	
	@FindBy(name="btnk")
	private WebElement searchbtn;
	
	
	public HomePage Search(String txt){
		searchtxt.sendKeys(txt);
		searchtxt.sendKeys(Keys.ENTER); 
		return new HomePage(driver);
	}
	
	
	
}
