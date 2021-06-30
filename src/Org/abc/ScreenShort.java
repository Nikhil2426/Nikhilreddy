package Org.abc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShort {
	
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("Nikhil");
		
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("vnr@1234");
	
	TakesScreenshot ts =(TakesScreenshot) driver;
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File destination = new File("C:\\Users\\nikhi\\test.hell.png");
	
	Files.copy(source, destination);
	driver.quit();
	
	
	
	
	}

}
