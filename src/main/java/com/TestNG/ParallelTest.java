package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ParallelTest {

	WebDriver driver;
	
	@Test(priority = 1)
	public void testChrome() throws InterruptedException {
	System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	
	WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);
    
    driver.manage().window().maximize();
    driver.get("https://www.bstackdemo.com/");
	Assert.assertEquals(driver.getTitle(), "StackDemo");
	}
	
	@Test(priority = 2)
	public void testFirefox() throws InterruptedException {
	System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://www.bstackdemo.com/");
	driver.manage().window().maximize();
	Assert.assertEquals(driver.getTitle(), "StackDemo"); 
	}
}
