package com.TestNG;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Edge {
	WebDriver driver;
	@Test
	public void setUp() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options =  new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
	
	}
}
