package Org.abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseclassExample {
	public static WebDriver driver;
	public static WebDriver getDriver() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		return driver;
		
	}
   public static void getURL(String url) {
	   
	   driver.get(url);
}
public static void insertData(WebElement element, String data) {
	
	element.sendKeys(data);

}
public static void uClick(WebElement element) {
	
	element.click();

}
public static void quit() {
	
	driver.quit();
	
}
   
   
}
