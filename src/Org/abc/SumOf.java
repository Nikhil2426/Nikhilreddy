package Org.abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SumOf {
	
	public static void main(String[] args) throws InterruptedException {
		

System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");

driver.manage().window().maximize();

Thread.sleep(6000);
driver.quit();
	
	
	}
		
	
	}
	
		

