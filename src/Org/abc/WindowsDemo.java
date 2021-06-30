package Org.abc;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
				
				Thread.sleep(3000);
				
				 String ParientWindowId = driver.getWindowHandle();
			     
			     System.out.println("My id is=" +ParientWindowId);
				
				WebElement find = driver.findElement(By.id("newWindowBtn"));
				
	        find.click();
	    
	     Set<String> windowHandles = driver.getWindowHandles();
	     
	     
	     for (String x : windowHandles) {
			
	    	 System.out.println("my handle="+x);
	    	 
	    	 if (!x.equals(ParientWindowId)) {
				
			driver.switchTo().window(x);
	    	 WebElement bye = driver.findElement(By.id("firstName"));
	    	 
	    	 bye.sendKeys("nikhilreddy");
	    	 }
	    	 	
				}
	     Thread.sleep(5000);
	     
	     
	     
	    System.out.println("done");
	    
	    driver.switchTo().window(ParientWindowId);
	    
	    WebElement name = driver.findElement(By.xpath("//input[@size='30']"));
	    
	    name.sendKeys("cheater");
	    
	    Thread.sleep(5000);
	     
	     driver.quit();
	     
	     
				
	}

}
