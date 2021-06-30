package Org.abc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\test\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
		int size1 = rows.size();
		System.out.println(size1);
		for (int i = 0; i < rows.size(); i++) {
			WebElement tr = rows.get(i);
			
			List<WebElement> sol = driver.findElements(By.tagName("td"));
			int size = sol.size();
			System.out.println(size);
			for (int j = 0; j < sol.size(); j++) {
				WebElement td = sol.get(j);
				String cellvalue = td.getText();
				System.out.println(cellvalue);
			}
			
		}
		driver.quit();
	}
}
