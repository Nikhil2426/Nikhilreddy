package Org.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		WebElement source = driver.findElement(By.id("name"));
		source.sendKeys("hello");
		Thread.sleep(1000);
		WebElement exmple = driver.findElement(By.xpath("//iframe[@id='frm1']"));
		
		driver.switchTo().frame(exmple);
		
		WebElement read = driver.findElement(By.id("course"));
		
		Select sc = new Select(read);
		
		sc.selectByVisibleText("Python");
		
		
		Thread.sleep(8000);
		
		driver.quit();
		
		
		
	}

}
