package com.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void testTitle() {
	System.out.println("The thread ID for testTitle Chrome is "+ Thread.currentThread().getId());
	Assert.assertEquals(driver.getTitle(), "Selenium Practice - Register");
	}
	
	@Test(priority = 2)
	public void RegisterUser() throws InterruptedException {
	System.out.println("The thread ID for clickOffers Chrome is "+ Thread.currentThread().getId());
	WebElement Fname = driver.findElement(By.xpath("//input[@id='firstname']"));
	Fname.sendKeys("Joel");
	
	WebElement Lname = driver.findElement(By.xpath("//input[@id='lastname']"));
	Lname.sendKeys("Smith");
	
	WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
	Username.sendKeys("Smith@yopmail.com");
	
	WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	Password.sendKeys("Pass@12");
	
	WebElement Register = driver.findElement(By.xpath("//input[@value='Register']"));
	Register.click();
	Thread.sleep(2000);
	
	}
	
	@Test(priority=3)
	public void VerifyText() {
		WebElement Text = driver.findElement(By.xpath("//h1[normalize-space()='Selenium - Automation Practice Form']"));
		Assert.assertEquals(Text.getText(), "Selenium - Automation Practice Form");
		System.out.println("Text : "+Text.getText());
	}
	
	@AfterTest
	public void tearDown() {
	driver.close();
	}
}

