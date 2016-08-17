package Actions;

import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {

	@Test
	public void read() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		
		int rowCount = driver.findElements(By.xpath("//*[@id='customers']//tr")).size();
		int columnCount = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td")).size();
		
		for (int i = 2; i <= rowCount; i++) {
			for (int j = 1; j <= columnCount; j++) {
				System.out.print(driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText()+"  \t");				
			}
			
			System.out.println();
		}
	}
	
}
