package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotExample {
		WebDriver driver;
		
		@Test
		public void setUp() {
			WebDriverManager.chromedriver().setup();
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver(options);
			driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
			driver.manage().window().maximize();
			Screenshot();
		}
		
		public void Screenshot(){
			
			try {
				File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(f, new File("D:\\Pankaj\\Selenium_Demo\\TestNG\\Screenshots"));
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		

}
