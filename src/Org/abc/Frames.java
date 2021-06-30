package Org.abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://demo.guru99.com/test/guru99home/");
	
	List<WebElement> frame = driver.findElements(By.tagName("iframe"));
	
	int count = frame.size();
	
System.out.println(count);

WebElement sampleframe = driver.findElement(By.xpath("//iframe[@wmode='transparent']"));

driver.switchTo().frame(sampleframe);

WebElement logo = driver.findElement(By.xpath("//a[@target='_blank']"));
logo.click();

Thread.sleep(3000);

driver.switchTo().defaultContent();

System.out.println("done");


driver.quit();
	
	
	
	
	
	
	
	}

}
