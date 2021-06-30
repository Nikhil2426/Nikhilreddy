package Org.abc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksImage {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	//List<WebElement> link = driver.findElements(By.tagName("a"));
		
		//int count = link.size();
		
		//System.out.println(count);
		
		//link.get(2).click();
		
		//for (WebElement x : link) {
			
		//	System.out.println(x.getAttribute("href"));
			
			
		//}
		
		//Thread.sleep(3000);
		//driver.quit();
		
		List<WebElement> img = driver.findElements(By.tagName("img"));
		
		int count = img.size();
		
		System.out.println(count);
		
		img.get(0).click();
		
	for (WebElement x : img) {
			
			System.out.println(x.getAttribute("src"));
			
			
			
		}
		
		driver.quit();
		
}

}
