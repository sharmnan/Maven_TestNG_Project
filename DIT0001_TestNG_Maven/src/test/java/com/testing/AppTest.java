package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest 
{
	WebDriver driver; // creating object of WebDriver Class
	
		@BeforeMethod
		public void openBrowserOpenURL() throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:/Users/madhav/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https:/accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");	//opening any URL
		
		Thread.sleep(2000);
		
	}
			
	/*@AfterMethod
	public void closeBrowser() {
		
		driver.close();}*/
	
    @Test
    public void GmailLoginTest() throws InterruptedException
    {
    	
    	Thread.sleep(3000);
    
    	
    	driver.findElement(By.cssSelector("#identifierId")).sendKeys("swastikaswami@gmail.com");
    	driver.findElement(By.cssSelector("#identifierNext")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("VandanaGaurav");
    	driver.findElement(By.cssSelector("#passwordNext")).click();
        
    }}
