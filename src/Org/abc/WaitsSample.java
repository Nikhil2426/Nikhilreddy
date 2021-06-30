package Org.abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsSample {
	
	public static void main(String[] args) throws InterruptedException {
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			//Thread.sleep(3000);
			
			driver.manage().window().maximize();
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//WebDriverWait w = new WebDriverWait(driver,100);
			//w.until(ExpectedConditions.elementToBeClickable(By.name("login")));
			
			
			//driver.quit();
			
			WebElement key = driver.findElement(By.name("q"));
			
			key.sendKeys("scrolltest" +Keys.ENTER);
			
			WebDriverWait f = new WebDriverWait(driver, 10);
			f.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@class='LC20lb DKV0Md']")));
			

			
			
		
	driver.quit();
		
	}
	
	

}
