package Org.abc;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nikhi\\test//chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys("Nikhil");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("vnr@1234");
		
		WebElement login = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		login.click();
		
		
	
		
		
		
			
		}
		
   
}
 
 	


