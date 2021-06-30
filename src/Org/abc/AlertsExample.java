package Org.abc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//input[@name='proceed']"));
		
		element.click();
		
		Thread.sleep(5000);
  Alert a = driver.switchTo().alert();

System.out.println(a.getText());

Thread.sleep(4000);

		a.accept();
		
		Thread.sleep(2000);
		
	
		driver.quit();

	}

}
