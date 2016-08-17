package AdvancedTopics;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookie {

	@Test
	public void ManageCookie() {
		
		
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			/*driver.findElement(By.xpath("//a[text() = 'Log In']")).click();
			
			driver.findElement(By.xpath("//input[@class = '_2zrpKA']")).sendKeys("sreenivasparimi95@gmail.com");
			
			driver.findElement(By.xpath("//input[@class = '_2zrpKA _3v41xv']")).sendKeys("Sreenivas007.");
			
			driver.findElement(By.xpath("//button[@class= '_3zLR9i _1LctnI _36SmAs']")).click();
			
			driver.manage().deleteAllCookies();*/

			Set<org.openqa.selenium.Cookie> cookies =  driver.manage().getCookies();
			
			for (org.openqa.selenium.Cookie cookie : cookies) {
				System.out.println(cookie);
			}
			
			
			driver.close();
					
		
		
		
		
		
	}
	
}
