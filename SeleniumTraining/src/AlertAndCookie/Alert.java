package AlertAndCookie;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	@Test
	public void jsAlert() {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement buttonElemnt = driver.findElement(By.xpath("html/body/button"));
		
		JavascriptExecutor jsExe = (JavascriptExecutor)driver;
		
		jsExe.executeScript("myFunction()", buttonElemnt);
				
	}
	
}
