package com.cicd.jenkins.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleSelTest {
	
	

		WebDriver driver;
		String URL = "https://www.google.com/";

		@Test(priority=1)
		public void LaunchBrowser()
		{

			System.setProperty("webdriver.chrome.driver", "D:\\Rohit\\Automation\\Projects\\CICD\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Browser Launched");


		}
		@Test(priority=2)
		public void Urlhit()
		{

		
			driver.get(URL);
			System.out.println(URL);


		}
		@Test(priority=3)
		public void CloseBrowser()
		{
			String expectedTitle = "Google";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(expectedTitle, actualTitle);
			System.out.println(expectedTitle);

			driver.close();
			System.out.println("Browser closed");
			
		}
	}



