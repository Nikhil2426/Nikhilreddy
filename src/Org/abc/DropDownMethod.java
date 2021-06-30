package Org.abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	
	driver.manage().window().maximize();
	
	WebElement demo = driver.findElement(By.id("course"));
	Select s = new Select(demo);
	
	//s.selectByIndex(1);
	
	//Thread.sleep(6000);
	
	//s.selectByValue("python");
	
	//Thread.sleep(6000);
	
	//s.selectByVisibleText("Javascript");
	
	List<WebElement> options = s.getOptions();
	
	System.out.println("hello");
	
	for (WebElement x : options) {
		
		System.out.println(x.getText());
		
		
		
	}
	
	
	
	
	
	
	
	

	
	
		
	}

}
