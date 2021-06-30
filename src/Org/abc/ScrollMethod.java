package Org.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollMethod {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement signup = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
		
		WebElement username = driver.findElement(By.name("email"));
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true)", signup);
		
		Thread.sleep(8000);
		
		j.executeScript("arguments[0].scrollIntoView(flase)", username);
		
		Thread.sleep(10000);
		driver.quit();
}
}