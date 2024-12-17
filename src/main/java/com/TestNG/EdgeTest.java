package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeTest {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options =  new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
	
	}

	@Test(priority = 1)
	public void testTitle() {
		System.out.println("The thread ID for testTitle Chrome is " + Thread.currentThread().getId());
		Assert.assertEquals(driver.getTitle(), "Selenium Practice - Register");
	}

	@Test(priority = 2)
	public void RegisterUser() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("The thread ID for clickOffers Chrome is " + Thread.currentThread().getId());
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

	@Test(priority = 3)
	public void VerifyText() {
		WebElement Text = driver.findElement(By.xpath("//h1[normalize-space()='Selenium - Automation Practice Form']"));
		Assert.assertEquals(Text.getText(), "Selenium - Automation Practice Form");
		System.out.println("Text : " + Text.getText());
	}

	@AfterTest
	public void tearDown() {
		if(driver != null) {
		driver.close();
		}
	}
}
