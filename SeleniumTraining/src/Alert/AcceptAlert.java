package Alert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AcceptAlert {

	static WebDriver driver = null;
	
	@BeforeClass
	public  static void Opening() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();		
	}	
	
	@Test
	public void AlertAccept() {
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("html/body/button")).click();		
		Alert alert =  driver.switchTo().alert();		
		alert.accept();		
	}
	
	@Test
	public void name() throws InterruptedException {
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("html/body/button")).click();
		Alert prompt =  driver.switchTo().alert();
		prompt.sendKeys("Hello this is a prompt box");		
		Thread.sleep(3000);
		prompt.accept();
	}
	
	@AfterClass
	public static void Closing() {
		driver.close();
	}
	
}
