package Org.abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
		
		
	}
    public static void getURL(String URL) {
    	driver.get(URL);
	
}
    
    public static void insertData(WebElement element, String text) {
		element.sendKeys(text);

	}
    public static void click(WebElement ele) {
		ele.clear();

	}
    public static void quitBrowser() {
    	
    	driver.quit();
		
	}
}
