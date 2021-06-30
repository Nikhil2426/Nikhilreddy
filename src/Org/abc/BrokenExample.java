package Org.abc;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(2000);
			int count = 0;
			List<WebElement> link = driver.findElements(By.tagName("a"));
			
			int size = link.size();
			System.out.println(size);
			
			for (WebElement x : link) {
				
				String linkurl = x.getAttribute("href");
				
				URL u = new URL(linkurl);
				
				HttpURLConnection h = (HttpURLConnection) u.openConnection();
				
				int responseCode = h.getResponseCode();
				
				
				if (responseCode!=200) {
					System.out.println(linkurl);
					count++;
				}
					
				
			}
			System.out.println("Total count of broken links = "+count);
			System.out.println("done");
			
			Thread.sleep(3000);
			
			driver.quit();
		
	}
}
