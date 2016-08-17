package AdvancedTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		
		WebElement element = driver.findElement(By.id("Email"));
		
		jsExecutor.executeScript("arguments[0].style.border='4px groove green'", element);
		
		Thread.sleep(3000);

		/*driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.switchTo().frame("iframeResult");
		
		JavascriptExecutor jsExe = (JavascriptExecutor)driver;
		
		WebElement buttonElemnt =  driver.findElement(By.xpath("html/body/button"));
		
		jsExe.executeScript("myFunction()", buttonElemnt);
		*/
		
	}

}
