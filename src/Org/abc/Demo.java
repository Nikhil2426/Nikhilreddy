package Org.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demo extends BaseClass{
	
	public static void main(String[] args) {
		
		WebDriver driver = getDriver();
		
		getURL("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("id"));
		insertData(username, "nikhil");
		
	  WebElement password = driver.findElement(By.name("name"));
	    insertData(password,"vnr@11234");
	    
	    WebElement login = driver.findElement(By.id("u_0_d_dN"));
	    
	    login.click();
	    
	    quitBrowser();
		
		
	}

}
