package com.cicd.jenkins.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cicd.jenkins.pageobject.HomePage;
import com.cicd.jenkins.testbase.TestBase;

public class Searchgoogle extends TestBase {
	
	@BeforeMethod
	public void setupMethod(){
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		Homepage=new HomePage(driver);
	}
	
	@AfterMethod
	public void tearDownDriver(){
		System.out.println("Closing the window....");
		driver.quit();
	}
	
	@Test
	public void anysearch()
	{
		driver.get(url);
		Homepage.Search(searchtxt);
	}

}
