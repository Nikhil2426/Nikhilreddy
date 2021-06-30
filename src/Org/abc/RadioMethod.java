package Org.abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		
		//int radiosize = radio.size();
		
		//System.out.println(radiosize);
		
		//Thread.sleep(3000);
		
		//radio.get(0).click();
		
		//Thread.sleep(5000);
		
		
		
		//driver.quit();
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int size = checkbox.size();
		
		System.out.println(size);
		
		//checkbox.get(0).click();
		
	//	Thread.sleep(4000);
		
		//checkbox.get(1).click();
		
		//List<WebElement> checkbox1 = driver.findElements(By.xpath("(//input[@type='checkbox'])[1]"));
		
		WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		checkbox1.click();
		
		boolean selected= checkbox1.isSelected();
		System.out.println(selected);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
