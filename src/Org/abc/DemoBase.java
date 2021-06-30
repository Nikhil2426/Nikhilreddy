package Org.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoBase extends BaseclassExample {
	
	public static void main(String[] args) {
		WebDriver driver = getDriver();
		getURL("https://www.facebook.com/");
		
	WebElement username = driver.findElement(By.name("email"));
	insertData(username, "nikhilreddy");
	
	WebElement password = driver.findElement(By.name("pass"));
	insertData(password , "nikhil");
	
	WebElement login = driver.findElement(By.name("login"));
	
	uClick(login);
	
	quit();
	
	}

	
	}


