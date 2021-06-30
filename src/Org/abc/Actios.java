package Org.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actios {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		
	
		
		Actions a = new Actions(driver);
		
		a.keyDown(username, Keys.SHIFT).sendKeys(username," nikhilreddy").keyUp(username, Keys.SHIFT).perform();
		
	Thread.sleep(6000);
	
	driver.quit();
		
		
		
		
	}

}
