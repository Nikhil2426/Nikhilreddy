package Org.abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Onion {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//select[@type='text']"));
		
		Select sel = new Select(element);
	WebElement firstSelectedOption = sel.getFirstSelectedOption();
	
	System.out.println(firstSelectedOption.getText());
	
	List<WebElement> options = sel.getOptions();
	for (WebElement x : options) {
		System.out.println(x.getText());
		
	}
	
	
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
