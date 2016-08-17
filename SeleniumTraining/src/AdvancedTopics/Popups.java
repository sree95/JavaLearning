package AdvancedTopics;

import java.util.HashSet;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popups {

	static WebDriver driver = null;
	
	@BeforeClass
	public static void OpeningBrowser() {
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.naukri.com/");
	}
	
	@Test
	public void Action() throws InterruptedException {
		
		String currentWindow = driver.getWindowHandle();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Set<String> winHandles =  driver.getWindowHandles();
/*		for (String s : winHandles) {
			if (!s.equals(currentWindow)) {
				driver.switchTo().window(s);
				if (driver.getTitle().contains("J P Morgan")) {
					driver.findElement(By.xpath("html/body/a/img")).click();
					Thread.sleep(7000);
					Set<String> newWindows = driver.getWindowHandles();
					for (String s2 : newWindows) {
						
					}
				}
				if (driver.getTitle().contains("Home | Jobs")) {
					driver.findElement(By.xpath("//*[@id='divisions__link']")).click();
					System.out.println(driver.getTitle());
				}
				driver.close();			
				driver.switchTo().window(currentWindow);
			}			
		}*/
		
		for (String string : winHandles) {
			if (!string.equals(currentWindow)) {
				driver.switchTo().window(string);
				if (driver.getTitle().contains("Amazon")) {
					driver.findElement(By.xpath("html/body/a/img")).click();
				}				
			}
			driver.switchTo().window(currentWindow);
		}
		
		Set<String> winHandles2 =  driver.getWindowHandles();
		
		for (String s2 : winHandles2) {
			if (!s2.equals(currentWindow)) {
				driver.switchTo().window(s2);
				if (driver.getTitle().contains("Amazon Jobs")) {
					System.out.println(driver.findElement(By.xpath("//strong[contains(text(), 'Join us so you can – Work Hard,')]")).getText());
				}
				driver.close();
			}
			driver.switchTo().window(currentWindow);
		}
		
	}
	
	@AfterClass
	public static void ClosingBrowser() {
		driver.close();
	}
	
}
