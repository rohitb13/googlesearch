package com.cicd.jenkins.testbase;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.cicd.jenkins.pageobject.HomePage;
import com.cicd.jenkins.util.PropertyFileReader;



public class TestBase {

	protected PropertyFileReader propFile;
	protected String url;
	protected String searchtxt;
	protected WebDriver driver;
	protected HomePage Homepage;
	
	
	@BeforeTest
	public void setupTest() throws FileNotFoundException{
		propFile=new PropertyFileReader("qa.properties");
		url=propFile.getValue("url");
		searchtxt=propFile.getValue("text");
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		
	}
	
}
